package com.rdc.kingsa.model.po.water.temperature;

import java.math.BigDecimal;

/**
 * Created by lxf on 18/8/21.
 */
public class ExtremeBO {
    String sectionId;
    BigDecimal maxVal;
    BigDecimal minVal;
    BigDecimal avgVal;

    public String getSectionId() {
        return sectionId;
    }

    public void setSectionId(String sectionId) {
        this.sectionId = sectionId;
    }

    public BigDecimal getMaxVal() {
        return maxVal;
    }

    public void setMaxVal(BigDecimal maxVal) {
        this.maxVal = maxVal;
    }

    public BigDecimal getMinVal() {
        return minVal;
    }

    public void setMinVal(BigDecimal minVal) {
        this.minVal = minVal;
    }

    public BigDecimal getAvgVal() {
        return avgVal;
    }

    public void setAvgVal(BigDecimal avgVal) {
        this.avgVal = avgVal;
    }
}
