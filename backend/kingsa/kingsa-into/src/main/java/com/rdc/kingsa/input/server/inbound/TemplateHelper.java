package com.rdc.kingsa.input.server.inbound;

import com.rdc.kingsa.input.server.inbound.model.TemplateDefine;
import com.thoughtworks.xstream.XStream;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by jyliu on 2018/9/30.
 */
public class TemplateHelper {

    private static Map<String, TemplateDefine> templateDefineMap = new ConcurrentHashMap<>();

    public static TemplateDefine parseTemplate(String templatePath) {
        return templateDefineMap.computeIfAbsent(templatePath, x -> {
            XStream stream = new XStream();
            //设置解析均使用注解
            stream.autodetectAnnotations(true);
            stream.processAnnotations(TemplateDefine.class);
            //获取解析xml后生成的java对象
            return (TemplateDefine) stream.fromXML(TemplateHelper.class.getClassLoader().getResource(templatePath));
        });
    }
}
