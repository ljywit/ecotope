package com.rdc.kingsa.model.vo.hydrology;

import com.rdc.kingsa.model.entity.hydrology.HydrWaterLevelDay;
import com.rdc.kingsa.model.entity.hydrology.HydrWaterLevelMonth;
import com.rdc.kingsa.model.entity.hydrology.HydrWaterLevelYear;

import java.math.BigDecimal;
import java.util.Map;

/**
 * Created by lxf on 18/8/31.
 */
public class WaterLevelReportVO {

    private HydrWaterLevelYear year;

    private Map<String, HydrWaterLevelMonth> month;

    private Map<String, BigDecimal> day;

    public HydrWaterLevelYear getYear() {
        return year;
    }

    public void setYear(HydrWaterLevelYear year) {
        this.year = year;
    }

    public Map<String, HydrWaterLevelMonth> getMonth() {
        return month;
    }

    public void setMonth(Map<String, HydrWaterLevelMonth> month) {
        this.month = month;
    }

    public Map<String, BigDecimal> getDay() {
        return day;
    }

    public void setDay(Map<String, BigDecimal> day) {
        this.day = day;
    }
}
