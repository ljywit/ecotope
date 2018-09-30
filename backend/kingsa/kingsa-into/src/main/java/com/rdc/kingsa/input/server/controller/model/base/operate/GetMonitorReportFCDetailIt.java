package com.rdc.kingsa.input.server.controller.model.base.operate;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("监测记录临时表单条记录请求信息")
public class GetMonitorReportFCDetailIt {
    @ApiModelProperty("监测因子类型type,对应静态数据接口数据")
    private int type;
    @ApiModelProperty("检测记录ID")
    private String id;
    @ApiModelProperty("此检测记录中详情单条信息ID")
    private String recordId;

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
     * 获取 recordId
     *
     * @return recordId
     */
    public String getRecordId() {
        return recordId;
    }

    /**
     * 设置 recordId
     *
     * @param recordId recordId
     */
    public void setRecordId(String recordId) {
        this.recordId = recordId;
    }
}
