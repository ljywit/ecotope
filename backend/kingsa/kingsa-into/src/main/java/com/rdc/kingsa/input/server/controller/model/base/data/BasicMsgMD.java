package com.rdc.kingsa.input.server.controller.model.base.data;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 数据模型未提供，暂时填两个属性
 */
@ApiModel("检测数据基本信息")
public class BasicMsgMD {
    @ApiModelProperty("ID")
    private String id;
    @ApiModelProperty("标题")
    private String title;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
