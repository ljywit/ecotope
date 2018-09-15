package com.rdc.kingsa.model.vo.hydrology;

import java.math.BigDecimal;

/**
 * Created by lxf on 18/8/29.
 */
public class WaterLevelAndFlowVO {

    private BigDecimal waterLevel;

    private BigDecimal waterFlow;

    public BigDecimal getWaterLevel() {
        return waterLevel;
    }

    public void setWaterLevel(BigDecimal waterLevel) {
        this.waterLevel = waterLevel;
    }

    public BigDecimal getWaterFlow() {
        return waterFlow;
    }

    public void setWaterFlow(BigDecimal waterFlow) {
        this.waterFlow = waterFlow;
    }
}
