package com.rdc.kingsa.model.vo.water.temperature;

import com.rdc.kingsa.model.po.section.WaterTemperatureSection;

import java.util.Map;

/**
 * Created by lxf on 18/8/27.
 */
public class WaterTemperatureSectionMapVO {

    private WaterTemperatureSection section;

    private Map<String, Double> values;

    public WaterTemperatureSection getSection() {
        return section;
    }

    public void setSection(WaterTemperatureSection section) {
        this.section = section;
    }

    public Map<String, Double> getValues() {
        return values;
    }

    public void setValues(Map<String, Double> values) {
        this.values = values;
    }
}
