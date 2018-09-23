package com.rdc.kingsa.input.server.controller.model.base.data;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiParam;

/**
 * description com.rdc.kingsa com.rdc.kingsa.input.server.controller.model.base.data
 */
@ApiModel("断面信息")
public class SectionMD {

    @ApiParam("断面具体ID")
    private String id;

    @ApiParam("断面类型")
    private int type;

    @ApiParam("断面名")
    private String name;

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
     * 获取 name
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置 name
     *
     * @param name name
     */
    public void setName(String name) {
        this.name = name;
    }
}
