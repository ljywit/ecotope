package com.rdc.kingsa.input.server.controller.model.base.operate;

import com.rdc.kingsa.input.server.controller.model.base.data.PageMD;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("监测记录列表查询请求信息")
public class GetMonitorReportListIt {
    @ApiModelProperty("监测因子类型type,对应静态数据接口数据")
    private int type;
    @ApiModelProperty("分页查询信息")
    private PageMD pagemd;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public PageMD getPagemd() {
        return pagemd;
    }

    public void setPagemd(PageMD pagemd) {
        this.pagemd = pagemd;
    }
}
