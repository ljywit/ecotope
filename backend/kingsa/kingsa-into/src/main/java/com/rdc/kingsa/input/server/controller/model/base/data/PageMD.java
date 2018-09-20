package com.rdc.kingsa.input.server.controller.model.base.data;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("分页查询信息")
public class PageMD {
    //TODO 目前无查询添加
    @ApiModelProperty("每页条数")
    private int pageSize;
    @ApiModelProperty("页码")
    private int pageNum;
    @ApiModelProperty("总数")
    private int sum;

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
}
