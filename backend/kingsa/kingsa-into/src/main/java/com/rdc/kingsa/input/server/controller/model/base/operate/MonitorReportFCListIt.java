package com.rdc.kingsa.input.server.controller.model.base.operate;

import com.rdc.kingsa.input.server.controller.model.base.data.PageMD;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("监测记录临时表查询请求信息")
public class MonitorReportFCListIt {
    @ApiModelProperty("水文生态系统type,对应静态数据接口数据")
    private int type;
    @ApiModelProperty("检测记录ID")
    private String id;
    @ApiModelProperty("分页查询信息")
    private PageMD page;

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
}
