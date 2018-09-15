package com.rdc.kingsa.model.vo.hydrology;

import com.rdc.kingsa.model.entity.hydrology.HydrWaterFlowMonth;
import com.rdc.kingsa.model.entity.hydrology.HydrWaterFlowYear;

import java.math.BigDecimal;
import java.util.Map;

/**
 * Created by lxf on 18/8/31.
 */
public class WaterFlowReportVO {

    private HydrWaterFlowYear year;

    private Map<String, HydrWaterFlowMonth> month;

    private Map<String, BigDecimal> day;

    public HydrWaterFlowYear getYear() {
        return year;
    }

    public void setYear(HydrWaterFlowYear year) {
        this.year = year;
    }

    public Map<String, HydrWaterFlowMonth> getMonth() {
        return month;
    }

    public void setMonth(Map<String, HydrWaterFlowMonth> month) {
        this.month = month;
    }

    public Map<String, BigDecimal> getDay() {
        return day;
    }

    public void setDay(Map<String, BigDecimal> day) {
        this.day = day;
    }
}
