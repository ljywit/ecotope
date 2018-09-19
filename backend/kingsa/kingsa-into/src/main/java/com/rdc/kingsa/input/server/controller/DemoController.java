package com.rdc.kingsa.input.server.controller;

import com.rdc.kingsa.input.server.controller.model.SectionMD;
import com.rdc.kingsa.input.server.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * 控制层
 */
//@RestController
@Controller("demoController")
@RequestMapping(value = "operations")
public class DemoController {

    @Autowired
    private DemoService demoService;

    @RequestMapping(value = "/kingsa:get-topology-list", method = RequestMethod.GET,
            produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public SectionMD getTopologyList() {
        SectionMD result = new SectionMD();
        result.setId("11");
        return result;
    }

    @RequestMapping(value = "/kingsa:get-SectionMD-details", method = RequestMethod.POST, produces = {
            MediaType.APPLICATION_JSON_VALUE}, consumes = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public SectionMD getTopologyDetails(@Valid @RequestBody SectionMD sectionMD, BindingResult bindingResult) throws Exception {
        return demoService.detail(sectionMD);
    }
}
