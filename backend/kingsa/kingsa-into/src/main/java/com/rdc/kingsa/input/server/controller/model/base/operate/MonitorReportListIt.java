package com.rdc.kingsa.input.server.controller.model.base.operate;

import com.rdc.kingsa.input.server.controller.model.base.data.PageMD;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("审批列表查询请求信息")
public class MonitorReportListIt {
    @ApiModelProperty("水文生态系统Code,对应静态数据接口数据")
    private int shuiWencode;
    @ApiModelProperty("分页查询信息")
    private PageMD pagemd;
    public int getShuiWencode() {
        return shuiWencode;
    }
    public void setShuiWencode(int shuiWencode) {
        this.shuiWencode = shuiWencode;
    }

    public PageMD getPagemd() {
        return pagemd;
    }

    public void setPagemd(PageMD pagemd) {
        this.pagemd = pagemd;
    }
}
