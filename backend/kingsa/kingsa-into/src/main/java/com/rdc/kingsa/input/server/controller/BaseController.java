package com.rdc.kingsa.input.server.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.rdc.kingsa.input.common.pslog.PsLog;
import com.rdc.kingsa.input.common.pslog.developerlog.DeveloperLogRecord;
import com.rdc.kingsa.input.thirds.spring.config.PropertyConfigurer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * controller抽象类
 *
 * @author Administrator
 */
public abstract class BaseController {

    /**
     * http请求request
     */
    @Autowired
    protected HttpServletRequest request;
    /**
     * http请求response
     */
    @Autowired
    protected HttpServletResponse response;

    /**
     * 配置文件读取类
     */
    @Autowired
    protected PropertyConfigurer propertys;

    /***
     * 返回json数据
     *
     * @param resultCode        返回码
     * @param resultDesc        返回码描述
     * @param resultDetails     对象
     * @return
     */
    protected ModelAndView jsonDone(int resultCode, String resultDesc, Object resultDetails) {
        Map<String, Object> jsonMap = new HashMap<String, Object>();
        jsonMap.put("resultCode", resultCode);
        jsonMap.put("resultDesc", resultDesc);
        jsonMap.put("resultDetails", resultDetails);

        responseJsonLog(jsonMap);

        return new ModelAndView(new MappingJackson2JsonView(), jsonMap);
    }

    /**
     * @param resultCode    返回码
     * @param resultDetails 返回对象
     * @return
     */
    protected ModelAndView jsonDone(int resultCode, Object resultDetails) {
        Map<String, Object> jsonMap = new HashMap<String, Object>();
        jsonMap.put("resultCode", resultCode);
        // 通过返回码读取返回码描述
        jsonMap.put("resultDesc", propertys.getString("code_" + resultCode));
        jsonMap.put("resultDetails", resultDetails);

        responseJsonLog(jsonMap);

        return new ModelAndView(new MappingJackson2JsonView(), jsonMap);
    }

    /**
     * 返回前台报文统一记录debug日志
     *
     * @param jsonMap
     */
    private void responseJsonLog(Map<String, Object> jsonMap) {
        if (PsLog.DEVELOPER.isDebugEnabled()) {
            DeveloperLogRecord record = new DeveloperLogRecord(this.getClass().getSimpleName(), "responseJsonLog()",
                    "response json string is:" + translate(jsonMap) + " | response time is:"
                            + System.currentTimeMillis());
            PsLog.DEVELOPER.debug(record);
        }
    }

    /**
     * map转String
     *
     * @param jsonMap
     * @return
     */
    private String translate(Map<String, Object> jsonMap) {
        ObjectMapper mapper = new ObjectMapper();
        String r = "";
        try {
            r = mapper.writeValueAsString(jsonMap);
        } catch (JsonProcessingException e) {
            DeveloperLogRecord record = new DeveloperLogRecord("BaseController", "translate", "translate error");
            PsLog.DEVELOPER.error(record, e);
        }
        return r;
    }

    protected void checkResult(BindingResult bindingResult) throws Exception {
        StringBuffer sb = new StringBuffer();
        if (bindingResult != null && bindingResult.hasErrors()) {
            /** 回显所有不合理数据 */
            bindingResult.getFieldErrors().stream().forEach(fieldError -> {
                sb.append(fieldError);
            });
        }
    }
}
