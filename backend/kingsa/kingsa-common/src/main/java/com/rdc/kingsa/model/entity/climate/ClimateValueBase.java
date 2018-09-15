package com.rdc.kingsa.model.entity.climate;

import com.rdc.kingsa.annotation.climate.ClimateTemperatureValue;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by lxf on 18/8/7.
 */
public class ClimateValueBase {
    private String id;

    @ClimateTemperatureValue(avg4 = false)
    private BigDecimal h1;

    @ClimateTemperatureValue(avg4 = true)
    private BigDecimal h2;

    @ClimateTemperatureValue(avg4 = false)
    private BigDecimal h3;

    @ClimateTemperatureValue(avg4 = false)
    private BigDecimal h4;

    @ClimateTemperatureValue(avg4 = false)
    private BigDecimal h5;

    @ClimateTemperatureValue(avg4 = false)
    private BigDecimal h6;

    @ClimateTemperatureValue(avg4 = false)
    private BigDecimal h7;

    @ClimateTemperatureValue(avg4 = true)
    private BigDecimal h8;

    @ClimateTemperatureValue(avg4 = false)
    private BigDecimal h9;

    @ClimateTemperatureValue(avg4 = false)
    private BigDecimal h10;

    @ClimateTemperatureValue(avg4 = false)
    private BigDecimal h11;

    @ClimateTemperatureValue(avg4 = false)
    private BigDecimal h12;

    @ClimateTemperatureValue(avg4 = false)
    private BigDecimal h13;

    @ClimateTemperatureValue(avg4 = true)
    private BigDecimal h14;

    @ClimateTemperatureValue(avg4 = false)
    private BigDecimal h15;

    @ClimateTemperatureValue(avg4 = false)
    private BigDecimal h16;

    @ClimateTemperatureValue(avg4 = false)
    private BigDecimal h17;

    @ClimateTemperatureValue(avg4 = false)
    private BigDecimal h18;

    @ClimateTemperatureValue(avg4 = false)
    private BigDecimal h19;

    @ClimateTemperatureValue(avg4 = true)
    private BigDecimal h20;

    @ClimateTemperatureValue(avg4 = false)
    private BigDecimal h21;

    @ClimateTemperatureValue(avg4 = false)
    private BigDecimal h22;

    @ClimateTemperatureValue(avg4 = false)
    private BigDecimal h23;

    @ClimateTemperatureValue(avg4 = false)
    private BigDecimal h24;

    private Date monitorDate;

    private String recordId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public BigDecimal getH1() {
        return h1;
    }

    public void setH1(BigDecimal h1) {
        this.h1 = h1;
    }

    public BigDecimal getH2() {
        return h2;
    }

    public void setH2(BigDecimal h2) {
        this.h2 = h2;
    }

    public BigDecimal getH3() {
        return h3;
    }

    public void setH3(BigDecimal h3) {
        this.h3 = h3;
    }

    public BigDecimal getH4() {
        return h4;
    }

    public void setH4(BigDecimal h4) {
        this.h4 = h4;
    }

    public BigDecimal getH5() {
        return h5;
    }

    public void setH5(BigDecimal h5) {
        this.h5 = h5;
    }

    public BigDecimal getH6() {
        return h6;
    }

    public void setH6(BigDecimal h6) {
        this.h6 = h6;
    }

    public BigDecimal getH7() {
        return h7;
    }

    public void setH7(BigDecimal h7) {
        this.h7 = h7;
    }

    public BigDecimal getH8() {
        return h8;
    }

    public void setH8(BigDecimal h8) {
        this.h8 = h8;
    }

    public BigDecimal getH9() {
        return h9;
    }

    public void setH9(BigDecimal h9) {
        this.h9 = h9;
    }

    public BigDecimal getH10() {
        return h10;
    }

    public void setH10(BigDecimal h10) {
        this.h10 = h10;
    }

    public BigDecimal getH11() {
        return h11;
    }

    public void setH11(BigDecimal h11) {
        this.h11 = h11;
    }

    public BigDecimal getH12() {
        return h12;
    }

    public void setH12(BigDecimal h12) {
        this.h12 = h12;
    }

    public BigDecimal getH13() {
        return h13;
    }

    public void setH13(BigDecimal h13) {
        this.h13 = h13;
    }

    public BigDecimal getH14() {
        return h14;
    }

    public void setH14(BigDecimal h14) {
        this.h14 = h14;
    }

    public BigDecimal getH15() {
        return h15;
    }

    public void setH15(BigDecimal h15) {
        this.h15 = h15;
    }

    public BigDecimal getH16() {
        return h16;
    }

    public void setH16(BigDecimal h16) {
        this.h16 = h16;
    }

    public BigDecimal getH17() {
        return h17;
    }

    public void setH17(BigDecimal h17) {
        this.h17 = h17;
    }

    public BigDecimal getH18() {
        return h18;
    }

    public void setH18(BigDecimal h18) {
        this.h18 = h18;
    }

    public BigDecimal getH19() {
        return h19;
    }

    public void setH19(BigDecimal h19) {
        this.h19 = h19;
    }

    public BigDecimal getH20() {
        return h20;
    }

    public void setH20(BigDecimal h20) {
        this.h20 = h20;
    }

    public BigDecimal getH21() {
        return h21;
    }

    public void setH21(BigDecimal h21) {
        this.h21 = h21;
    }

    public BigDecimal getH22() {
        return h22;
    }

    public void setH22(BigDecimal h22) {
        this.h22 = h22;
    }

    public BigDecimal getH23() {
        return h23;
    }

    public void setH23(BigDecimal h23) {
        this.h23 = h23;
    }

    public BigDecimal getH24() {
        return h24;
    }

    public void setH24(BigDecimal h24) {
        this.h24 = h24;
    }

    public Date getMonitorDate() {
        return monitorDate;
    }

    public void setMonitorDate(Date monitorDate) {
        this.monitorDate = monitorDate;
    }

    public String getRecordId() {
        return recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId == null ? null : recordId.trim();
    }
}
