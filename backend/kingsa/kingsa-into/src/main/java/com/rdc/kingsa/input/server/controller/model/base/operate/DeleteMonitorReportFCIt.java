package com.rdc.kingsa.input.server.controller.model.base.operate;


import java.util.List;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("监测记录临时表记录删除请求信息-支持批量")
public class DeleteMonitorReportFCIt {
    @ApiModelProperty("监测因子类型type,对应静态数据接口数据")
    private int type;
    @ApiModelProperty("检测记录基本信息ID")
    private String id;
    @ApiModelProperty("单条检测记录ID集合")
    private List<String> ids;

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
     * 获取 ids
     *
     * @return ids
     */
    public List<String> getIds() {
        return ids;
    }

    /**
     * 设置 ids
     *
     * @param ids ids
     */
    public void setIds(List<String> ids) {
        this.ids = ids;
    }
}
