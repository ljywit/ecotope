package com.rdc.kingsa.input.server.controller;

import com.base.utils.UUIDUtils;
import com.google.common.collect.Lists;
import com.rdc.kingsa.input.server.controller.model.base.data.BasicMsgMD;
import com.rdc.kingsa.input.server.controller.model.base.data.StaticMD;
import com.rdc.kingsa.input.server.controller.model.base.operate.AprrovalIt;
import com.rdc.kingsa.input.server.controller.model.base.operate.MonitorReportListIt;
import com.rdc.kingsa.input.server.controller.model.base.operate.MonitorReportListOt;
import com.rdc.kingsa.input.server.service.StaticService;
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
@Controller("kingsaController")
@RequestMapping(value = "operations")
public class KingsaController {

    @Autowired
    private StaticService staticService;

    @RequestMapping(value = "/kingsa:approve", method = RequestMethod.POST,
            produces = {MediaType.APPLICATION_JSON_VALUE}, consumes = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public void order(AprrovalIt input) {
        System.out.println(input);
    }

    @RequestMapping(value = "/kingsa:get-monitor-report-list", method = RequestMethod.POST, produces = {
            MediaType.APPLICATION_JSON_VALUE}, consumes = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public MonitorReportListOt getMonitorReportList(@Valid @RequestBody MonitorReportListIt input, BindingResult bindingResult) throws
            Exception {
        BasicMsgMD basicMsgMD = new BasicMsgMD();
        basicMsgMD.setId(UUIDUtils.getUUID());
        basicMsgMD.setTitle("标题1");
        BasicMsgMD basicMsgMD2 = new BasicMsgMD();
        basicMsgMD2.setId(UUIDUtils.getUUID());
        basicMsgMD2.setTitle("标题2");
        MonitorReportListOt monitorReportListOt = new MonitorReportListOt();
        monitorReportListOt.setBasicMsgMDList(Lists.newArrayList(basicMsgMD, basicMsgMD2));
        return monitorReportListOt;
    }

    @RequestMapping(value = "/kingsa:get-static-datas", method = RequestMethod.GET, produces = {
            MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public StaticMD getStaticDatas() throws Exception {
        return staticService.staticDatas();
    }
}
