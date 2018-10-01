package com.rdc.kingsa.input.server.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.base.dal.object.AbstractDO;
import com.base.utils.ListUtil;
import com.google.common.collect.Maps;
import com.rdc.kingsa.input.common.KingsaUtil;
import com.rdc.kingsa.input.persistence.beans.GssFc;
import com.rdc.kingsa.input.persistence.beans.GssMi;
import com.rdc.kingsa.input.persistence.beans.MonitoringReport;
import com.rdc.kingsa.input.persistence.dao.GssFcMapper;
import com.rdc.kingsa.input.persistence.dao.GssMiMapper;
import com.rdc.kingsa.input.server.controller.model.base.data.ApprovalMD;
import com.rdc.kingsa.input.server.controller.model.base.operate.ApprovalIt;
import com.rdc.kingsa.input.server.controller.model.base.operate.CreateMonitorReportFCIt;
import com.rdc.kingsa.input.server.controller.model.base.operate.DeleteMonitorReportFCIt;
import com.rdc.kingsa.input.server.controller.model.base.operate.EmptyMonitorReportFCIt;
import com.rdc.kingsa.input.server.controller.model.base.operate.GetMonitorReportFCDetailIt;
import com.rdc.kingsa.input.server.controller.model.base.operate.GetMonitorReportFCDetailOt;
import com.rdc.kingsa.input.server.controller.model.base.operate.GetMonitorReportFCListIt;
import com.rdc.kingsa.input.server.controller.model.base.operate.GetMonitorReportFCListOt;
import com.rdc.kingsa.input.server.controller.model.base.operate.MonitorReportDetailALLIt;
import com.rdc.kingsa.input.server.controller.model.base.operate.MonitorReportDetailALLOt;
import com.rdc.kingsa.input.server.controller.model.base.operate.UpdateMonitorReportFCIt;
import com.rdc.kingsa.input.server.service.base.AbstractMonitorService;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * description com.rdc.kingsa com.rdc.kingsa.input.server.service
 * demo
 *
 * @since 2018/9/29.
 */
/*@Transactional(rollbackFor = Exception.class)
@Service("demo")*/
public class DemoMonitorService extends AbstractMonitorService {
    @Autowired
    private GssMiMapper miMapper;
    @Autowired
    private GssFcMapper fcMapper;

    /**
     * 获取临时监测数据列表
     *
     * @param input
     * @return
     * @throws Exception
     */
    @Override
    public GetMonitorReportFCListOt getFCDataList(GetMonitorReportFCListIt input) throws Exception {
        GssFc query = new GssFc();
        RowBounds rowBounds = KingsaUtil.rowBounds(input.getPage());
        List<GssFc> list = fcMapper.findPageByBean(query, rowBounds);
        GetMonitorReportFCListOt result = new GetMonitorReportFCListOt();
        BeanUtils.copyProperties(result, input);
        Map map = new HashMap();
        map.put(input.getType(), list);
        result.setRecordMap(map);
        return result;
    }

    /**
     * 获取临时监测单条数据详细信息
     *
     * @param input
     * @return
     * @throws Exception
     */
    @Override
    public GetMonitorReportFCDetailOt getFCDataDetail(GetMonitorReportFCDetailIt input) throws Exception {
        GssFc bean = fcMapper.selectByPrimaryKey(input.getId());
        GetMonitorReportFCDetailOt result = new GetMonitorReportFCDetailOt();
        BeanUtils.copyProperties(result, input);
        result.setRecord(bean);
        return result;
    }

    /**
     * 新增临时监测单条数据
     *
     * @param input
     * @throws Exception
     */
    @Override
    public void createFCData(CreateMonitorReportFCIt input) throws Exception {
        fcMapper.insert((GssFc) input.getRecord());
    }

    /**
     * 更新临时监测单条数据
     *
     * @param input
     * @throws Exception
     */
    @Override
    public void updateFCData(UpdateMonitorReportFCIt input) throws Exception {
        fcMapper.updateByPrimaryKey((GssFc) input.getRecord());
    }

    /**
     * 删除临时监测数据，支持批量
     *
     * @param input
     * @throws Exception
     */
    @Override
    public void deleteFCDatas(DeleteMonitorReportFCIt input) throws Exception {
        List<String> ids = input.getIds();
        if (ListUtil.isNotEmpty(ids)) {
            for (String id : ids) {
                fcMapper.deleteByPrimaryKey(id);
            }
        }
    }

    /**
     * 清空某一类型临时监测数据
     *
     * @param input
     * @throws Exception
     */
    @Override
    public void emptyFCDatas(EmptyMonitorReportFCIt input) throws Exception {
        String id = input.getId();
        fcMapper.deleteByForeignId(id);
    }

    /**
     * 清空某一类型正式监测数据
     *
     * @param input
     * @throws Exception
     */
    @Override
    public void emptyMIDatas(EmptyMonitorReportFCIt input) throws Exception {
        //过饱和气体表无reportID字段
    }

    /**
     * 临时数据转正
     *
     * @param input
     * @throws Exception
     */
    @Override
    public void FC2MI(ApprovalIt input) throws Exception {
        String reportId = input.getId();
        GssFc query = new GssFc();
        query.setReportId(reportId);
        List<GssFc> list = fcMapper.findPageByBean(query, RowBounds.DEFAULT);
        if (ListUtil.isNotEmpty(list)) {
            for (GssFc gssFc : list) {
                GssMi bean = new GssMi();
                BeanUtils.copyProperties(bean, gssFc);
                miMapper.insert(bean);
            }
        }
    }

    /**
     * 临时数据转正后，删除临时数据
     *
     * @param input
     * @throws Exception
     */
    @Override
    public void emptyFCDatas(ApprovalIt input) throws Exception {
        //暂时不删除
    }

    @Override
    public MonitorReportDetailALLOt getBaseMsgAndFCList(MonitorReportDetailALLIt input) throws Exception {
        MonitorReportDetailALLOt output = new MonitorReportDetailALLOt();
        String id = input.getId();
        int type = input.getType();
        MonitoringReport monitoringReport = monitoringReportMapper.selectByPrimaryKey(id);
        ApprovalMD approvalMD = getApproveDetail(id);
        List<GssFc> beans = fcMapper.selectAll();
        Map<Integer, List<? extends AbstractDO>> recordMap = Maps.newHashMap();
        recordMap.put(type, beans);

        output.setId(id);
        output.setType(type);
        output.setMonitoringReport(monitoringReport);
        output.setApprovalMD(approvalMD);
        output.setRecordMap(recordMap);
        return output;
    }
}
