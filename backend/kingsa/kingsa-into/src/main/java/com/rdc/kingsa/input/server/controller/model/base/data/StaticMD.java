package com.rdc.kingsa.input.server.controller.model.base.data;

import io.swagger.annotations.ApiModel;

import java.util.List;
import java.util.Map;

@ApiModel("静态数据")
public class StaticMD {
    Map<String, List<Map<Object, Object>>> datas;

    public Map<String, List<Map<Object, Object>>> getDatas() {
        return datas;
    }

    public void setDatas(Map<String, List<Map<Object, Object>>> datas) {
        this.datas = datas;
    }
}
