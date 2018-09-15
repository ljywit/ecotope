package com.rdc.kingsa.model.vo.water.temperature;

import com.rdc.kingsa.model.entity.water.temperature.VWTMI;

import java.math.BigDecimal;

/**
 * Created by lxf on 18/8/23.
 */
public class WaterTemperatureVerticalVO extends VWTMI {
    BigDecimal elevation;

    public WaterTemperatureVerticalVO(VWTMI mi) {
        if (mi != null) {
            super.setId(mi.getId());
            super.setModifyTime(mi.getModifyTime());
            super.setCreateTime(mi.getCreateTime());
            super.setMonitorTime(mi.getMonitorTime());
            super.setSectionId(mi.getSectionId());
            super.setWaterDepth(mi.getWaterDepth());
            super.setWaterTemper(mi.getWaterTemper());
            super.setRemarks(mi.getRemarks());
            super.setWaterLevel(mi.getWaterLevel());
            if (mi.getWaterDepth() != null && mi.getWaterLevel() != null) {
                BigDecimal elevation = mi.getWaterLevel().subtract(mi.getWaterDepth());
                this.setElevation(elevation);
            }
        }
    }

    public BigDecimal getElevation() {
        return elevation;
    }

    public void setElevation(BigDecimal elevation) {
        this.elevation = elevation;
    }
}
