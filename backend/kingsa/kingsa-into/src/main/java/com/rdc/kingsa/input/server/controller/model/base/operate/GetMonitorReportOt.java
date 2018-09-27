package com.rdc.kingsa.input.server.controller.model.base.operate;

import com.rdc.kingsa.input.persistence.beans.MonitoringReport;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("获取监测记录基本信息返回结果")
public class GetMonitorReportOt {
    @ApiModelProperty("水文生态系统type,对应静态数据接口数据")
    private int type;
    @ApiModelProperty("监测记录ID")
    private String id;
    @ApiModelProperty("监测记录基本信息")
    private MonitoringReport monitoringReport;

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
}
