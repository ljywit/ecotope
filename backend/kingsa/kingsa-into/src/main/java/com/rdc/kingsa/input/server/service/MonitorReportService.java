package com.rdc.kingsa.input.server.service;


import java.util.List;
import java.util.Map;

import com.base.dal.object.AbstractDO;
import com.google.common.collect.Maps;
import com.rdc.kingsa.input.common.KingsaUtil;
import com.rdc.kingsa.input.persistence.beans.GssMi;
import com.rdc.kingsa.input.persistence.beans.MonitoringReport;
import com.rdc.kingsa.input.persistence.dao.GssMiMapper;
import com.rdc.kingsa.input.persistence.dao.MonitoringReportMapper;
import com.rdc.kingsa.input.server.controller.model.base.data.ApprovalMD;
import com.rdc.kingsa.input.server.controller.model.base.data.PageMD;
import com.rdc.kingsa.input.server.controller.model.base.operate.MonitorReportDetailALLIt;
import com.rdc.kingsa.input.server.controller.model.base.operate.MonitorReportDetailALLOt;
import com.rdc.kingsa.input.server.controller.model.base.operate.MonitorReportListIt;
import com.rdc.kingsa.input.server.controller.model.base.operate.MonitorReportListOt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional(rollbackFor = Exception.class)
@Service("monitorReportService")
public class MonitorReportService extends BaseService {

    @Autowired
    private MonitoringReportMapper monitoringReportMapper;

    /**
     * 饱和气体
     */
    @Autowired
    private GssMiMapper gssMiMapper;

    public MonitorReportListOt list(MonitorReportListIt input) throws Exception {
        PageMD pagemd = input.getPagemd();
        MonitoringReport queryBean = new MonitoringReport();
        queryBean.setType(input.getType());
        List<MonitoringReport> list = monitoringReportMapper.findPageBreakByBean(queryBean,
            KingsaUtil.rowBounds(pagemd));
        MonitorReportListOt monitorReportListOt = new MonitorReportListOt();
        monitorReportListOt.setMonitoringReportList(list);
        return monitorReportListOt;
    }

    public MonitorReportDetailALLOt detail(MonitorReportDetailALLIt input) throws Exception {
        MonitorReportDetailALLOt output = new MonitorReportDetailALLOt();
        String id = input.getId();
        int type = input.getType();
        MonitoringReport monitoringReport = monitoringReportMapper.selectByPrimaryKey(id);
        ApprovalMD approvalMD = approveDetail(id);
        //TODO
        List<GssMi> gssMis = gssMiMapper.selectAll();
        Map<Integer, List<? extends AbstractDO>> recordMap = Maps.newHashMap();
        recordMap.put(type,gssMis);

        output.setId(id);
        output.setType(type);
        output.setMonitoringReport(monitoringReport);
        output.setApprovalMD(approvalMD);
        output.setRecordMap(recordMap);
        return output;
    }
}
