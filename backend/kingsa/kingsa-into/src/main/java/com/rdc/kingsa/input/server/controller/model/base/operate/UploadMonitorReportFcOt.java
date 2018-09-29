package com.rdc.kingsa.input.server.controller.model.base.operate;

import java.util.List;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("上传响应信息")
public class UploadMonitorReportFcOt {
    @ApiModelProperty("错误信息列表")
    private List<String> errorList;
    @ApiModelProperty("记录列表")
    private GetMonitorReportFCListOt list;

    /**
     * 获取 errorList
     *
     * @return errorList
     */
    public List<String> getErrorList() {
        return errorList;
    }

    /**
     * 设置 errorList
     *
     * @param errorList errorList
     */
    public void setErrorList(List<String> errorList) {
        this.errorList = errorList;
    }

    /**
     * 获取 list
     *
     * @return list
     */
    public GetMonitorReportFCListOt getList() {
        return list;
    }

    /**
     * 设置 list
     *
     * @param list list
     */
    public void setList(GetMonitorReportFCListOt list) {
        this.list = list;
    }
}
