package com.rdc.kingsa.input.server.controller.model.base.operate;

import java.util.List;
import java.util.Map;

import com.base.dal.object.AbstractDO;
import com.rdc.kingsa.input.persistence.beans.MonitoringReport;
import com.rdc.kingsa.input.server.controller.model.base.data.ApprovalMD;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("监测记录详情[包含审批、监测所有记录等]查询响应信息")
public class MonitorReportDetailALLOt {
    @ApiModelProperty("水文生态系统type,对应静态数据接口数据")
    private int type;
    @ApiModelProperty("监测记录ID")
    private String id;
    @ApiModelProperty("审批信息")
    private ApprovalMD approvalMD;
    @ApiModelProperty("监测记录基本信息")
    private MonitoringReport monitoringReport;
    @ApiModelProperty("监测记录详细信息")
    //private Map<Integer, List<BasicRecordMD>> recordMap;
    private Map<Integer, List<? extends AbstractDO>> recordMap;

    /**
     * 获取 type
     *
     * @return type
     */
    public int getType() {
        return type;
    }

    /**
     * 设置 type
     *
     * @param type type
     */
    public void setType(int type) {
        this.type = type;
    }

    /**
     * 获取 id
     *
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置 id
     *
     * @param id id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取 approvalMD
     *
     * @return approvalMD
     */
    public ApprovalMD getApprovalMD() {
        return approvalMD;
    }

    /**
     * 设置 approvalMD
     *
     * @param approvalMD approvalMD
     */
    public void setApprovalMD(ApprovalMD approvalMD) {
        this.approvalMD = approvalMD;
    }

    /**
     * 获取 monitoringReport
     *
     * @return monitoringReport
     */
    public MonitoringReport getMonitoringReport() {
        return monitoringReport;
    }

    /**
     * 设置 monitoringReport
     *
     * @param monitoringReport monitoringReport
     */
    public void setMonitoringReport(MonitoringReport monitoringReport) {
        this.monitoringReport = monitoringReport;
    }

    /**
     * 获取 recordMap
     *
     * @return recordMap
     */
    public Map<Integer, List<? extends AbstractDO>> getRecordMap() {
        return recordMap;
    }

    /**
     * 设置 recordMap
     *
     * @param recordMap recordMap
     */
    public void setRecordMap(Map<Integer, List<? extends AbstractDO>> recordMap) {
        this.recordMap = recordMap;
    }
}
