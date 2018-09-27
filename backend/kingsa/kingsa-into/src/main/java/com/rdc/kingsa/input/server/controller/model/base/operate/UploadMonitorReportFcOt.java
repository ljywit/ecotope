package com.rdc.kingsa.input.server.controller.model.base.operate;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

@ApiModel("监测记录临时表查询响应信息")
public class UploadMonitorReportFcOt {
    @ApiModelProperty("水文生态系统type,对应静态数据接口数据")
    List<String> errorList;
    @ApiModelProperty("检测记录ID")
    MonitorReportFCListOt list;
}
