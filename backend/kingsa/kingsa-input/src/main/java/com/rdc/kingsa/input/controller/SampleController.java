package com.rdc.kingsa.input.controller;

import com.rdc.kingsa.model.dto.water.quality.WaterQualityFCView;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.apache.log4j.Logger;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Map;

@Api(tags = "测试Swagger")
@RestController
@RequestMapping("/sample")
public class SampleController {

    private static Logger LOGGER = Logger.getLogger(SampleController.class);


    @ApiOperation(value = "测试map大小", httpMethod = "POST", produces = "application/json;charset=utf-8")
    @RequestMapping(value = "test001",method = RequestMethod.POST, produces = "application/json;charset=utf-8")
    public int test001(@ApiParam("入参") @NotBlank @RequestBody Map<String,String> inputMap) {
        return inputMap.size();
    }

    @ApiOperation(value = "测试格式", httpMethod = "POST", produces = "application/json;charset=utf-8")
    @RequestMapping(value = "test002",method = RequestMethod.POST, produces = "application/json;charset=utf-8")
    public String test001(@ApiParam("入参") @RequestBody WaterQualityFCView view) {
        return view.toString();
    }


}
