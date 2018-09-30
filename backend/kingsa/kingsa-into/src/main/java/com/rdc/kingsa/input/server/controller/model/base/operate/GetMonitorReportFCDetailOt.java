package com.rdc.kingsa.input.server.controller.model.base.operate;


import com.base.dal.object.AbstractDO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("监测记录临时表单条记录响应信息")
public class GetMonitorReportFCDetailOt {
    @ApiModelProperty("监测因子类型type,对应静态数据接口数据")
    private int type;
    @ApiModelProperty("检测记录ID")
    private String id;
    @ApiModelProperty("检测记录单条信息")
    private AbstractDO record;

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
     * 获取 record
     *
     * @return record
     */
    public AbstractDO getRecord() {
        return record;
    }

    /**
     * 设置 record
     *
     * @param record record
     */
    public void setRecord(AbstractDO record) {
        this.record = record;
    }
}
