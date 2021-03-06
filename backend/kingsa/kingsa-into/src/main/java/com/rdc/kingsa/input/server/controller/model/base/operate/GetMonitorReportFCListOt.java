package com.rdc.kingsa.input.server.controller.model.base.operate;

import java.util.List;
import java.util.Map;

import com.base.dal.object.AbstractDO;
import com.rdc.kingsa.input.server.controller.model.base.data.PageMD;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("监测记录临时表查询响应信息")
public class GetMonitorReportFCListOt {
    @ApiModelProperty("监测因子类型type,对应静态数据接口数据")
    private int type;
    @ApiModelProperty("检测记录ID")
    private String id;
    @ApiModelProperty("分页查询信息")
    private PageMD page;
    @ApiModelProperty("监测记录详细信息")
    //private Map<Integer, List<BasicRecordMD>> recordMap;
    private Map<Integer, List<? extends AbstractDO>> recordMap;

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

    /**
     * 获取 recordMap
     *
     * @return recordMap
     */
    public Map<Integer, List<? extends AbstractDO>> getRecordMap() {
        return recordMap;
    }

    /**
     * 设置 recordMap
     *
     * @param recordMap recordMap
     */
    public void setRecordMap(Map<Integer, List<? extends AbstractDO>> recordMap) {
        this.recordMap = recordMap;
    }
}
