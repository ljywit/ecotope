package com.rdc.kingsa.input.server.controller.model.base.operate;

import java.util.List;

import com.rdc.kingsa.input.persistence.beans.MonitoringReport;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("监测记录列表查询相应信息")
public class MonitorReportListOt {
    /*@ApiModelProperty("水文生态系统Code,对应静态数据接口数据")
    private int shuiWencode;
    @ApiModelProperty("分页查询信息")
    private PageMD pagemd;*/
    @ApiModelProperty("结果集合")
    List<MonitoringReport> monitoringReportList;

    /**
     * 获取 monitoringReportList
     *
     * @return monitoringReportList
     */
    public List<MonitoringReport> getMonitoringReportList() {
        return monitoringReportList;
    }

    /**
     * 设置 monitoringReportList
     *
     * @param monitoringReportList monitoringReportList
     */
    public void setMonitoringReportList(List<MonitoringReport> monitoringReportList) {
        this.monitoringReportList = monitoringReportList;
    }
}
