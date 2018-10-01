package com.rdc.kingsa.input.server.service.base;

import java.util.Date;
import java.util.List;

import com.rdc.kingsa.input.common.KingsaUtil;
import com.rdc.kingsa.input.persistence.beans.Approval;
import com.rdc.kingsa.input.persistence.beans.ApprovalDetail;
import com.rdc.kingsa.input.persistence.beans.MonitoringReport;
import com.rdc.kingsa.input.persistence.dao.ApprovalDetailMapper;
import com.rdc.kingsa.input.persistence.dao.ApprovalMapper;
import com.rdc.kingsa.input.persistence.dao.MonitoringReportMapper;
import com.rdc.kingsa.input.server.controller.model.base.data.ApprovalMD;
import com.rdc.kingsa.input.server.controller.model.base.data.PageMD;
import com.rdc.kingsa.input.server.controller.model.base.operate.ApprovalIt;
import com.rdc.kingsa.input.server.controller.model.base.operate.CreateMonitorReportFCIt;
import com.rdc.kingsa.input.server.controller.model.base.operate.CreateMonitorReportIt;
import com.rdc.kingsa.input.server.controller.model.base.operate.DeleteMonitorReportFCIt;
import com.rdc.kingsa.input.server.controller.model.base.operate.DeleteMonitorReportIt;
import com.rdc.kingsa.input.server.controller.model.base.operate.EmptyMonitorReportFCIt;
import com.rdc.kingsa.input.server.controller.model.base.operate.GetMonitorReportFCDetailIt;
import com.rdc.kingsa.input.server.controller.model.base.operate.GetMonitorReportFCDetailOt;
import com.rdc.kingsa.input.server.controller.model.base.operate.GetMonitorReportFCListIt;
import com.rdc.kingsa.input.server.controller.model.base.operate.GetMonitorReportFCListOt;
import com.rdc.kingsa.input.server.controller.model.base.operate.GetMonitorReportIt;
import com.rdc.kingsa.input.server.controller.model.base.operate.GetMonitorReportListIt;
import com.rdc.kingsa.input.server.controller.model.base.operate.GetMonitorReportListOt;
import com.rdc.kingsa.input.server.controller.model.base.operate.GetMonitorReportOt;
import com.rdc.kingsa.input.server.controller.model.base.operate.MonitorReportDetailALLIt;
import com.rdc.kingsa.input.server.controller.model.base.operate.MonitorReportDetailALLOt;
import com.rdc.kingsa.input.server.controller.model.base.operate.UpdateMonitorReportFCIt;
import com.rdc.kingsa.input.server.controller.model.base.operate.UpdateMonitorReportIt;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * description com.rdc.kingsa com.rdc.kingsa.input.server.service
 */
public abstract class AbstractMonitorService {
    @Autowired
    public MonitoringReportMapper monitoringReportMapper;
    @Autowired
    public ApprovalMapper approvalMapper;
    @Autowired
    public ApprovalDetailMapper approvalDetailMapper;

    /**
     * 基本信息
     */
    public GetMonitorReportListOt getBaseMsgList(GetMonitorReportListIt input) throws Exception {
        PageMD pagemd = input.getPagemd();
        MonitoringReport queryBean = new MonitoringReport();
        queryBean.setType(input.getType());
        List<MonitoringReport> list = monitoringReportMapper.findPageByBean(queryBean, KingsaUtil.rowBounds(pagemd));
        GetMonitorReportListOt getMonitorReportListOt = new GetMonitorReportListOt();
        BeanUtils.copyProperties(getMonitorReportListOt, input);
        getMonitorReportListOt.setMonitoringReportList(list);
        //TODO
        getMonitorReportListOt.getPage().setSum(11);
        return getMonitorReportListOt;
    }

    /**
     * 基本信息详情
     */
    public GetMonitorReportOt getBaseMsgDetail(GetMonitorReportIt input) throws Exception {
        GetMonitorReportOt output = new GetMonitorReportOt();
        //TODO 泄洪雾化是其他表
        MonitoringReport monitoringReport = monitoringReportMapper.selectByPrimaryKey(input.getId());
        output.setMonitoringReport(monitoringReport);
        return output;
    }

    /**
     * 基本信息保存
     *
     * @param input
     * @throws Exception
     */
    public void createBaseMsg(CreateMonitorReportIt input) throws Exception {
        MonitoringReport monitoringReport = input.getMonitoringReport();
        monitoringReport.setReportTime(new Date());
        //TODO 泄洪雾化是其他表
        monitoringReportMapper.insert(monitoringReport);
    }

    /**
     * 基本信息更新
     *
     * @param input
     * @throws Exception
     */
    public void updateBaseMsg(UpdateMonitorReportIt input) throws Exception {
        MonitoringReport monitoringReport = input.getMonitoringReport();
        monitoringReport.setReportTime(new Date());
        //TODO 泄洪雾化是其他表
        monitoringReportMapper.updateByPrimaryKey(monitoringReport);
    }

    /**
     * 监测基本信息+记录信息删除+审批数据
     *
     * @param input
     * @throws Exception
     */
    public void deleteBaseMsgs(DeleteMonitorReportIt input) throws Exception {
        //TODO 泄洪雾化是其他表
        List<String> ids = input.getIds();
        for (String id : ids) {
            monitoringReportMapper.deleteByPrimaryKey(id);
            emptyFCDatas(new EmptyMonitorReportFCIt());
            emptyMIDatas(null);
            deleteApprove(null);
        }
    }

    /****************************************************************/

    /**
     * 获取临时监测数据列表
     *
     * @param input
     * @return
     * @throws Exception
     */
    public abstract GetMonitorReportFCListOt getFCDataList(GetMonitorReportFCListIt input) throws Exception;

    /**
     * 获取临时监测单条数据详细信息
     *
     * @param input
     * @return
     * @throws Exception
     */
    public abstract GetMonitorReportFCDetailOt getFCDataDetail(GetMonitorReportFCDetailIt input) throws Exception;

    /**
     * 新增临时监测单条数据
     *
     * @param input
     * @throws Exception
     */
    public abstract void createFCData(CreateMonitorReportFCIt input) throws Exception;

    /**
     * 更新临时监测单条数据
     *
     * @param input
     * @throws Exception
     */
    public abstract void updateFCData(UpdateMonitorReportFCIt input) throws Exception;

    /**
     * 删除临时监测数据，支持批量
     *
     * @param input
     * @throws Exception
     */
    public abstract void deleteFCDatas(DeleteMonitorReportFCIt input) throws Exception;

    /**
     * 清空某一类型临时监测数据
     *
     * @param input
     * @throws Exception
     */
    public abstract void emptyFCDatas(EmptyMonitorReportFCIt input) throws Exception;

    /**
     * 清空某一类型正式监测数据
     *
     * @param input
     * @throws Exception
     */
    public abstract void emptyMIDatas(EmptyMonitorReportFCIt input) throws Exception;

    /**
     * 临时数据转正
     *
     * @param input
     * @throws Exception
     */
    public abstract void FC2MI(ApprovalIt input) throws Exception;

    /**
     * 临时数据转正后，删除临时数据
     *
     * @param input
     * @throws Exception
     */
    public abstract void emptyFCDatas(ApprovalIt input) throws Exception;

    /****************************************************************/

    public void approve(ApprovalIt input) throws Exception {
        approvalMapper.insert(Convert.aprrovalItIt2Approval(input));
        approvalDetailMapper.insert(Convert.aprrovalItIt2ApprovalDetail(input));
        //TODO 审批成功后，记录转正，删除临时数据
    }

    public void deleteApprove(String id) throws Exception {

    }

    /**
     * 获取审批详情
     *
     * @param id 监测记录ID
     * @return
     * @throws Exception
     */
    public ApprovalMD getApproveDetail(String id) throws Exception {
        Approval approval = approvalMapper.selectByPrimaryKey(id);
        ApprovalDetail query = new ApprovalDetail();
        query.setApprovalId(id);
        List<ApprovalDetail> approvalDetails = approvalDetailMapper.findPageByBean(query, RowBounds.DEFAULT);
        ApprovalMD approvalMD = new ApprovalMD(approval, approvalDetails);
        return approvalMD;
    }

    /****************************************************************/

    /**
     * 获取基本信息+记录信息+审批信息
     *
     * @param input
     * @return
     * @throws Exception
     */
    public abstract MonitorReportDetailALLOt getBaseMsgAndFCList(MonitorReportDetailALLIt input) throws Exception;

    void upload() throws Exception {
    }
}
