package com.rdc.kingsa.input.server.controller;

import javax.validation.Valid;

import com.rdc.kingsa.input.server.controller.model.base.data.StaticMD;
import com.rdc.kingsa.input.server.controller.model.base.operate.ApprovalIt;
import com.rdc.kingsa.input.server.controller.model.base.operate.DeleteMonitorReportFCIt;
import com.rdc.kingsa.input.server.controller.model.base.operate.EmptyMonitorReportFCIt;
import com.rdc.kingsa.input.server.controller.model.base.operate.GetMonitorReportFCIt;
import com.rdc.kingsa.input.server.controller.model.base.operate.GetMonitorReportFCOt;
import com.rdc.kingsa.input.server.controller.model.base.operate.GetMonitorReportIt;
import com.rdc.kingsa.input.server.controller.model.base.operate.GetMonitorReportOt;
import com.rdc.kingsa.input.server.controller.model.base.operate.MonitorDataBeanOt;
import com.rdc.kingsa.input.server.controller.model.base.operate.MonitorReportDetailALLIt;
import com.rdc.kingsa.input.server.controller.model.base.operate.MonitorReportDetailALLOt;
import com.rdc.kingsa.input.server.controller.model.base.operate.MonitorReportFCIt;
import com.rdc.kingsa.input.server.controller.model.base.operate.MonitorReportFCListIt;
import com.rdc.kingsa.input.server.controller.model.base.operate.MonitorReportFCListOt;
import com.rdc.kingsa.input.server.controller.model.base.operate.MonitorReportIt;
import com.rdc.kingsa.input.server.controller.model.base.operate.MonitorReportListIt;
import com.rdc.kingsa.input.server.controller.model.base.operate.MonitorReportListOt;
import com.rdc.kingsa.input.server.controller.model.base.operate.UploadMonitorReportFcOt;
import com.rdc.kingsa.input.server.service.ApprovalService;
import com.rdc.kingsa.input.server.service.MonitorReportService;
import com.rdc.kingsa.input.server.service.StaticService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * 控制层
 */
@Api(tags = "Kingsa监测数据录入平台")
@RestController("kingsaController")
@RequestMapping(value = "operations")
public class KingsaController {

    @Autowired
    private StaticService staticService;
    @Autowired
    private MonitorReportService monitorReportService;
    @Autowired
    private ApprovalService approvalService;

    /**
     * 需要注意当前状态，审批下一步或退回
     *
     * @param input
     */
    @ApiOperation(value = "审批", httpMethod = "POST", produces = "application/json;charset=utf-8")
    @RequestMapping(value = "/kingsa:approve", method = RequestMethod.POST,
        produces = {MediaType.APPLICATION_JSON_VALUE}, consumes = {MediaType.APPLICATION_JSON_VALUE})
    public void order(@ApiParam("入参") @Valid @RequestBody ApprovalIt input) {
        approvalService.approve(input);
    }

    @ApiOperation(value = "监测（审批）数据列表获取", httpMethod = "POST", produces = "application/json;charset=utf-8")
    @RequestMapping(value = "/kingsa:get-monitor-report-list", method = RequestMethod.POST, produces = {
        MediaType.APPLICATION_JSON_VALUE}, consumes = {MediaType.APPLICATION_JSON_VALUE})
    public MonitorReportListOt getMonitorReportList(@ApiParam("入参") @Valid @RequestBody MonitorReportListIt input,
                                                    BindingResult bindingResult) throws Exception {
        return monitorReportService.list(input);
    }

    @ApiOperation(value = "审批数据单条详细信息（包含审批、监测等数据）", httpMethod = "POST", produces = "application/json;charset=utf-8")
    @RequestMapping(value = "/kingsa:get-monitor-report-detail", method = RequestMethod.POST, produces = {
        MediaType.APPLICATION_JSON_VALUE}, consumes = {MediaType.APPLICATION_JSON_VALUE})
    public MonitorReportDetailALLOt getMonitorReportDetail(@ApiParam("入参") @Valid @RequestBody MonitorReportDetailALLIt input,
                                                           BindingResult bindingResult) throws Exception {
        return monitorReportService.detail(input);
    }

    @ApiOperation(value = "监测基本数据查询", httpMethod = "POST", produces = "application/json;charset=utf-8")
    @RequestMapping(value = "/kingsa:get-monitor-report", method = RequestMethod.POST, produces = {
        MediaType.APPLICATION_JSON_VALUE}, consumes = {MediaType.APPLICATION_JSON_VALUE})
    public GetMonitorReportOt getMonitorReport(@ApiParam("入参") @Valid @RequestBody GetMonitorReportIt input,
                                               BindingResult bindingResult) throws Exception {
        //TODO
        return null;
    }

    @ApiOperation(value = "监测基本数据保存", httpMethod = "POST", produces = "application/json;charset=utf-8")
    @RequestMapping(value = "/kingsa:save-monitor-report", method = RequestMethod.POST, produces = {
        MediaType.APPLICATION_JSON_VALUE}, consumes = {MediaType.APPLICATION_JSON_VALUE})
    public void saveMonitorReport(@ApiParam("入参") @Valid @RequestBody MonitorReportIt input,
                                  BindingResult bindingResult) throws Exception {
        //TODO
    }

    @ApiOperation(value = "监测基本数据删除", httpMethod = "POST", produces = "application/json;charset=utf-8")
    @RequestMapping(value = "/kingsa:delete-monitor-report", method = RequestMethod.POST, produces = {
        MediaType.APPLICATION_JSON_VALUE}, consumes = {MediaType.APPLICATION_JSON_VALUE})
    public void deleteMonitorReport(@ApiParam("入参") @Valid @RequestBody MonitorReportIt input,
                                    BindingResult bindingResult) throws Exception {
        //TODO
    }

    @ApiOperation(value = "监测基本数据更新", httpMethod = "POST", produces = "application/json;charset=utf-8")
    @RequestMapping(value = "/kingsa:update-monitor-report", method = RequestMethod.POST, produces = {
        MediaType.APPLICATION_JSON_VALUE}, consumes = {MediaType.APPLICATION_JSON_VALUE})
    public void updateMonitorReport(@ApiParam("入参") @Valid @RequestBody MonitorReportIt input,
                                    BindingResult bindingResult) throws Exception {
        //TODO
    }

    @ApiOperation(value = "监测记录临时表查询", httpMethod = "POST", produces = "application/json;charset=utf-8")
    @RequestMapping(value = "/kingsa:get-monitor-report-fc-list", method = RequestMethod.POST, produces = {
        MediaType.APPLICATION_JSON_VALUE}, consumes = {MediaType.APPLICATION_JSON_VALUE})
    public MonitorReportFCListOt getMonitorReportFCList(@ApiParam("入参") @Valid @RequestBody MonitorReportFCListIt input,
                                                        BindingResult bindingResult) throws Exception {
        //TODO
        return new MonitorReportFCListOt();
    }

    @ApiOperation(value = "监测记录临时表单条信息查询", httpMethod = "POST", produces = "application/json;charset=utf-8")
    @RequestMapping(value = "/kingsa:get-monitor-report-fc", method = RequestMethod.POST, produces = {
        MediaType.APPLICATION_JSON_VALUE}, consumes = {MediaType.APPLICATION_JSON_VALUE})
    public GetMonitorReportFCOt getMonitorReportFC(@ApiParam("入参") @Valid @RequestBody GetMonitorReportFCIt input,
                                                   BindingResult bindingResult) throws Exception {
        //TODO
        return null;
    }

    @ApiOperation(value = "监测记录临时表单条信息更新", httpMethod = "POST", produces = "application/json;charset=utf-8")
    @RequestMapping(value = "/kingsa:update-monitor-report-fc", method = RequestMethod.POST, produces = {
        MediaType.APPLICATION_JSON_VALUE}, consumes = {MediaType.APPLICATION_JSON_VALUE})
    public void updateMonitorReportFC(@ApiParam("入参") @Valid @RequestBody MonitorReportFCIt input,
                                      BindingResult bindingResult) throws Exception {
        //TODO
    }

    @ApiOperation(value = "监测记录临时表单条信息保存", httpMethod = "POST", produces = "application/json;charset=utf-8")
    @RequestMapping(value = "/kingsa:save-monitor-report-fc", method = RequestMethod.POST, produces = {
        MediaType.APPLICATION_JSON_VALUE}, consumes = {MediaType.APPLICATION_JSON_VALUE})
    public void saveMonitorReportFC(@ApiParam("入参") @Valid @RequestBody MonitorReportFCIt input,
                                    BindingResult bindingResult) throws Exception {
        //TODO
    }

    @ApiOperation(value = "监测记录临时表信息删除-支持批量", httpMethod = "POST", produces = "application/json;charset=utf-8")
    @RequestMapping(value = "/kingsa:delete-monitor-report-fc", method = RequestMethod.POST, produces = {
        MediaType.APPLICATION_JSON_VALUE}, consumes = {MediaType.APPLICATION_JSON_VALUE})
    public void deleteMonitorReportFC(@ApiParam("入参") @Valid @RequestBody DeleteMonitorReportFCIt input,
                                      BindingResult bindingResult) throws Exception {
        //TODO
    }

    @ApiOperation(value = "监测记录信息清空", httpMethod = "POST", produces = "application/json;charset=utf-8")
    @RequestMapping(value = "/kingsa:empty-monitor-report-fc", method = RequestMethod.POST, produces = {
        MediaType.APPLICATION_JSON_VALUE}, consumes = {MediaType.APPLICATION_JSON_VALUE})
    public void deleteMonitorReportFC(@ApiParam("入参") @Valid @RequestBody EmptyMonitorReportFCIt input,
                                      BindingResult bindingResult) throws Exception {
        //TODO
    }

    @ApiOperation(value = "监测数据上传", httpMethod = "POST", produces = "application/json;charset=utf-8")
    @RequestMapping(value = "/kingsa:upload-monitor-report-fc", method = RequestMethod.POST)
    public UploadMonitorReportFcOt uploadData(@RequestParam("file") MultipartFile file,
                                              @RequestParam("data") MonitorReportIt reportData) throws Exception {
        return null;
    }

    @ApiOperation(value = "静态数据获取", httpMethod = "GET", produces = "application/json;charset=utf-8")
    @RequestMapping(value = "/kingsa:get-static-datas", method = RequestMethod.GET, produces = {
        MediaType.APPLICATION_JSON_VALUE})
    public StaticMD getStaticDatas() throws Exception {
        return staticService.staticDatas();
    }

    @ApiOperation(value = "监测数据基础对象-仅供Swagger展示", httpMethod = "GET", produces = "application/json;charset=utf-8")
    @RequestMapping(value = "/kingsa:xxxx", method = RequestMethod.GET, produces = {
        MediaType.APPLICATION_JSON_VALUE})
    public MonitorDataBeanOt getMonitorDatas() throws Exception {
        return new MonitorDataBeanOt();
    }
}
