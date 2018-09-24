package com.rdc.kingsa.input.server.controller;

import com.rdc.kingsa.input.server.controller.model.base.data.StaticMD;
import com.rdc.kingsa.input.server.controller.model.base.operate.*;
import com.rdc.kingsa.input.server.service.ApprovalService;
import com.rdc.kingsa.input.server.service.MonitorReportService;
import com.rdc.kingsa.input.server.service.StaticService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;

/**
 * 控制层
 */
//@RestController
@Api(tags = "Kingsa监测数据录入平台")
@Controller("kingsaController")
@RequestMapping(value = "operations")
public class KingsaController {

    @Autowired
    private StaticService staticService;
    @Autowired
    private MonitorReportService monitorReportService;
    @Autowired
    private ApprovalService approvalService;

    @ApiOperation(value = "审批", httpMethod = "POST", produces = "application/json;charset=utf-8")
    @RequestMapping(value = "/kingsa:approve", method = RequestMethod.POST,
        produces = {MediaType.APPLICATION_JSON_VALUE}, consumes = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public void order(@ApiParam("入参") @Valid @RequestBody ApprovalIt input) {
        approvalService.approve(input);
    }

    @ApiOperation(value = "监测（审批）数据列表获取", httpMethod = "POST", produces = "application/json;charset=utf-8")
    @RequestMapping(value = "/kingsa:get-monitor-report-list", method = RequestMethod.POST, produces = {
        MediaType.APPLICATION_JSON_VALUE}, consumes = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public MonitorReportListOt getMonitorReportList(@ApiParam("入参") @Valid @RequestBody MonitorReportListIt input,
                                                    BindingResult bindingResult) throws Exception {
        return monitorReportService.list(input);
    }

    @ApiOperation(value = "审批数据单条详细信息（包含审批、监测等数据）", httpMethod = "POST", produces = "application/json;charset=utf-8")
    @RequestMapping(value = "/kingsa:get-monitor-report-detail", method = RequestMethod.POST, produces = {
        MediaType.APPLICATION_JSON_VALUE}, consumes = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public MonitorReportDetailALLOt getMonitorReportDetail(@ApiParam("入参") @Valid @RequestBody MonitorReportDetailALLIt input,
                                                           BindingResult bindingResult) throws Exception {
        return monitorReportService.detail(input);
    }

    @ApiOperation(value = "监测基本数据保存", httpMethod = "POST", produces = "application/json;charset=utf-8")
    @RequestMapping(value = "/kingsa:save-monitor-report", method = RequestMethod.POST, produces = {
        MediaType.APPLICATION_JSON_VALUE}, consumes = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public void saveMonitorReport(@ApiParam("入参") @Valid @RequestBody MonitorReportIt input,
                                  BindingResult bindingResult) throws Exception {
        //TODO
    }

    @ApiOperation(value = "监测基本数据删除", httpMethod = "POST", produces = "application/json;charset=utf-8")
    @RequestMapping(value = "/kingsa:delete-monitor-report", method = RequestMethod.POST, produces = {
        MediaType.APPLICATION_JSON_VALUE}, consumes = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public void deleteMonitorReport(@ApiParam("入参") @Valid @RequestBody MonitorReportIt input,
                                    BindingResult bindingResult) throws Exception {
        //TODO
    }

    @ApiOperation(value = "监测基本数据更新", httpMethod = "POST", produces = "application/json;charset=utf-8")
    @RequestMapping(value = "/kingsa:update-monitor-report", method = RequestMethod.POST, produces = {
        MediaType.APPLICATION_JSON_VALUE}, consumes = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public void updateMonitorReport(@ApiParam("入参") @Valid @RequestBody MonitorReportIt input,
                                    BindingResult bindingResult) throws Exception {
        //TODO
    }

    @ApiOperation(value = "监测记录临时表查询", httpMethod = "POST", produces = "application/json;charset=utf-8")
    @RequestMapping(value = "/kingsa:get-monitor-report-fc-list", method = RequestMethod.POST, produces = {
        MediaType.APPLICATION_JSON_VALUE}, consumes = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public MonitorReportFCListOt getMonitorReportFCList(@ApiParam("入参") @Valid @RequestBody MonitorReportFCListIt input,
                                                        BindingResult bindingResult) throws Exception {
        //TODO
        return new MonitorReportFCListOt();
    }

    @ApiOperation(value = "监测记录临时表单条信息查询", httpMethod = "POST", produces = "application/json;charset=utf-8")
    @RequestMapping(value = "/kingsa:get-monitor-report-fc", method = RequestMethod.POST, produces = {
        MediaType.APPLICATION_JSON_VALUE}, consumes = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public MonitorReportFCOt getMonitorReportFC(@ApiParam("入参") @Valid @RequestBody MonitorReportFCIt input,
                                                BindingResult bindingResult) throws Exception {
        //TODO
        return new MonitorReportFCOt();
    }

    @ApiOperation(value = "监测记录临时表单条信息更新", httpMethod = "POST", produces = "application/json;charset=utf-8")
    @RequestMapping(value = "/kingsa:update-monitor-report-fc", method = RequestMethod.POST, produces = {
        MediaType.APPLICATION_JSON_VALUE}, consumes = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public void updateMonitorReportFC(@ApiParam("入参") @Valid @RequestBody MonitorReportFCIt input,
                                                BindingResult bindingResult) throws Exception {
        //TODO
    }

    @ApiOperation(value = "监测记录临时表单条信息删除", httpMethod = "POST", produces = "application/json;charset=utf-8")
    @RequestMapping(value = "/kingsa:delete-monitor-report-fc", method = RequestMethod.POST, produces = {
        MediaType.APPLICATION_JSON_VALUE}, consumes = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public void deleteMonitorReportFC(@ApiParam("入参") @Valid @RequestBody MonitorReportFCIt input,
                                                BindingResult bindingResult) throws Exception {
        //TODO
    }

    @ApiOperation(value = "静态数据获取", httpMethod = "GET", produces = "application/json;charset=utf-8")
    @RequestMapping(value = "/kingsa:get-static-datas", method = RequestMethod.GET, produces = {
        MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public StaticMD getStaticDatas() throws Exception {
        return staticService.staticDatas();
    }
}
