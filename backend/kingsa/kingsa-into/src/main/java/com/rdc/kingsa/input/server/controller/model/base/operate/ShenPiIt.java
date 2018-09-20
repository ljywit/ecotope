package com.rdc.kingsa.input.server.controller.model.base.operate;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.apache.commons.lang3.builder.ToStringBuilder;

@ApiModel("审批请求信息")
public class ShenPiIt {
    @ApiModelProperty("审批记录ID")
    private String id;
    @ApiModelProperty("水文生态系统Code,对应静态数据接口数据")
    private int shuiWencode;
    @ApiModelProperty("审批Code,对应静态数据接口数据")
    private int shenPiCode;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getShuiWencode() {
        return shuiWencode;
    }

    public void setShuiWencode(int shuiWencode) {
        this.shuiWencode = shuiWencode;
    }

    public int getShenPiCode() {
        return shenPiCode;
    }

    public void setShenPiCode(int shenPiCode) {
        this.shenPiCode = shenPiCode;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
