package com.rdc.kingsa.input.server.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.base.utils.ListUtil;
import com.rdc.kingsa.input.common.constant.KingsaInputConstant;
import com.rdc.kingsa.input.persistence.beans.CatchRecord;
import com.rdc.kingsa.input.persistence.beans.FreshRecord;
import com.rdc.kingsa.input.persistence.beans.FreshRecordFc;
import com.rdc.kingsa.input.persistence.dao.CatchRecordMapper;
import com.rdc.kingsa.input.persistence.dao.FreshRecordFcMapper;
import com.rdc.kingsa.input.persistence.dao.FreshRecordMapper;
import com.rdc.kingsa.input.server.controller.model.base.operate.ApprovalIt;
import com.rdc.kingsa.input.server.controller.model.base.operate.CreateMonitorReportFCIt;
import com.rdc.kingsa.input.server.controller.model.base.operate.DeleteMonitorReportFCIt;
import com.rdc.kingsa.input.server.controller.model.base.operate.EmptyMonitorReportFCIt;
import com.rdc.kingsa.input.server.controller.model.base.operate.GetMonitorReportFCDetailIt;
import com.rdc.kingsa.input.server.controller.model.base.operate.GetMonitorReportFCDetailOt;
import com.rdc.kingsa.input.server.controller.model.base.operate.GetMonitorReportFCListIt;
import com.rdc.kingsa.input.server.controller.model.base.operate.GetMonitorReportFCListOt;
import com.rdc.kingsa.input.server.controller.model.base.operate.UpdateMonitorReportFCIt;
import com.rdc.kingsa.input.server.service.base.DefaultMonitorService;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * description com.rdc.kingsa com.rdc.kingsa.input.server.service
 * 渔获
 *
 * @since 2018/9/30.
 */
@Transactional(rollbackFor = Exception.class)
@Service(KingsaInputConstant.FISH_RECORD_SERVICE)
public class FishRecordMonitorService
    extends DefaultMonitorService<FreshRecord, FreshRecordFc, FreshRecordMapper, FreshRecordFcMapper> {

    @Autowired
    CatchRecordMapper mapper;

    /**
     * 获取临时监测数据列表
     *
     * @param input
     * @return
     * @throws Exception
     */
    @Override
    public GetMonitorReportFCListOt getFCDataList(GetMonitorReportFCListIt input) throws Exception {
        return super.getFCDataList(input);
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
        GetMonitorReportFCDetailOt fcDataDetail = super.getFCDataDetail(input);
        FreshRecordFc record = (FreshRecordFc) fcDataDetail.getRecord();
        Map query = new HashMap<>();
        query.put("recordId", record.getId());
        List<CatchRecord> list = mapper.findPageBreakByCondition(query, RowBounds.DEFAULT);
        record.setRecordList(list);
        return fcDataDetail;
    }

    /**
     * 新增临时监测单条数据
     *
     * @param input
     * @throws Exception
     */
    @Override
    public void createFCData(CreateMonitorReportFCIt input) throws Exception {
        super.createFCData(input);
        FreshRecordFc record = (FreshRecordFc) input.getRecord();
        List<CatchRecord> recordList = record.getRecordList();
        if (ListUtil.isNotEmpty(recordList)) {
            for (CatchRecord catchRecord : recordList) {
                catchRecord.setCatchId(record.getId());
                mapper.insert(catchRecord);
            }
        }
    }

    /**
     * 更新临时监测单条数据
     *
     * @param input
     * @throws Exception
     */
    @Override
    public void updateFCData(UpdateMonitorReportFCIt input) throws Exception {
        super.updateFCData(input);
        FreshRecordFc record = (FreshRecordFc) input.getRecord();

        //先删除，后添加，因为无法判断具体哪些是更新；为了和创建保持一致，也不提供具体的catch record记录的更新
        deleteByRecordId(record.getId());

        List<CatchRecord> recordList = record.getRecordList();
        if (ListUtil.isNotEmpty(recordList)) {
            for (CatchRecord catchRecord : recordList) {
                catchRecord.setCatchId(record.getId());
                mapper.insert(catchRecord);
            }
        }
    }

    /**
     * 删除临时监测数据，支持批量
     *
     * @param input
     * @throws Exception
     */
    @Override
    public void deleteFCDatas(DeleteMonitorReportFCIt input) throws Exception {
        super.deleteFCDatas(input);
        List<String> ids = input.getIds();
        if (ListUtil.isNotEmpty(ids)) for (String id : ids) {
            deleteByRecordId(id);
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
        Map query = new HashMap();
        query.put(KingsaInputConstant.REPORT_ID_PARAM, input.getId());
        List<FreshRecordFc> list = fcMapper.findPageBreakByCondition(query, RowBounds.DEFAULT);
        if (ListUtil.isNotEmpty(list)) for (FreshRecordFc freshRecordFc : list) {
            deleteByRecordId(freshRecordFc.getId());
        }
        super.emptyFCDatas(input);
    }

    /**
     * 清空某一类型正式监测数据
     *
     * @param input
     * @throws Exception
     */
    @Override
    public void emptyMIDatas(EmptyMonitorReportFCIt input) throws Exception {
        super.emptyMIDatas(input);
    }

    /**
     * 临时数据转正后，删除临时数据
     *
     * @param input
     * @throws Exception
     */
    @Override
    public void emptyFCDatas(ApprovalIt input) throws Exception {
        super.emptyFCDatas(input);
    }

    @Override
    protected FreshRecord getMiBean() {
        return new FreshRecord();
    }

    private void deleteByRecordId(String recordId) throws Exception {
        Map query = new HashMap<>();
        query.put("recordId", recordId);
        List<CatchRecord> list = mapper.findPageBreakByCondition(query, RowBounds.DEFAULT);
        if (ListUtil.isNotEmpty(list)) {
            for (CatchRecord catchRecord : list) {
                mapper.deleteByPrimaryKey(catchRecord.getId());
            }
        }
    }
}
