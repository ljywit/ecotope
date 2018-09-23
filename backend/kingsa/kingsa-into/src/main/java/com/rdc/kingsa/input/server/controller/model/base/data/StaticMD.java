package com.rdc.kingsa.input.server.controller.model.base.data;

import java.util.Map;

import io.swagger.annotations.ApiModel;

@ApiModel("静态数据")
public class StaticMD {
    private Map<String, Object> datas;

    /**
     * 获取 datas
     *
     * @return datas
     */
    public Map<String, Object> getDatas() {
        return datas;
    }

    /**
     * 设置 datas
     *
     * @param datas datas
     */
    public void setDatas(Map<String, Object> datas) {
        this.datas = datas;
    }
    /*Map<String, List<Map<Object, Object>>> types;

    public Map<String, List<Map<Object, Object>>> getTypes() {
        return types;
    }

    public void setTypes(Map<String, List<Map<Object, Object>>> types) {
        this.types = types;
    }*/
}
