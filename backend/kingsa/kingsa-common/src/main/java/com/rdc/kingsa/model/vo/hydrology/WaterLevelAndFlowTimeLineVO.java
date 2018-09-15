package com.rdc.kingsa.model.vo.hydrology;

import java.math.BigDecimal;
import java.util.Map;

/**
 * Created by lxf on 18/8/29.
 */
public class WaterLevelAndFlowTimeLineVO {

    private Map<String, BigDecimal> waterLevel;

    private Map<String, BigDecimal> waterFlow;

    public Map<String, BigDecimal> getWaterLevel() {
        return waterLevel;
    }

    public void setWaterLevel(Map<String, BigDecimal> waterLevel) {
        this.waterLevel = waterLevel;
    }

    public Map<String, BigDecimal> getWaterFlow() {
        return waterFlow;
    }

    public void setWaterFlow(Map<String, BigDecimal> waterFlow) {
        this.waterFlow = waterFlow;
    }
}
