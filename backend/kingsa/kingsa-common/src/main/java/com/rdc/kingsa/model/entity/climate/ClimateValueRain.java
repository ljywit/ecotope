package com.rdc.kingsa.model.entity.climate;


import java.math.BigDecimal;

public class ClimateValueRain extends ClimateValueBase {


    private BigDecimal total;


    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }
}