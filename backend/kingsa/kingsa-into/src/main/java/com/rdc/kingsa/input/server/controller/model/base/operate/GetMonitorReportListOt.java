package com.rdc.kingsa.input.server.controller.model.base.operate;

import java.util.List;

import com.rdc.kingsa.input.persistence.beans.MonitoringReport;
import com.rdc.kingsa.input.server.controller.model.base.data.PageMD;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("监测记录列表查询响应信息")
public class GetMonitorReportListOt {
    @ApiModelProperty("监测因子类型type,对应静态数据接口数据")
    private int type;
    @ApiModelProperty("分页查询信息")
    private PageMD page;
    @ApiModelProperty("结果集合")
    List<MonitoringReport> monitoringReportList;

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
     * 获取 page
     *
     * @return page
     */
    public PageMD getPage() {
        return page;
    }

    /**
     * 设置 page
     *
     * @param page page
     */
    public void setPage(PageMD page) {
        this.page = page;
    }

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
