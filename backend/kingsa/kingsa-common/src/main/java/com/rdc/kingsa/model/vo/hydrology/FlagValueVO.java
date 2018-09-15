package com.rdc.kingsa.model.vo.hydrology;

import java.math.BigDecimal;
import java.util.Map;

/**
 * Created by lxf on 18/8/30.
 */
public class FlagValueVO {
    private Map<String, BigDecimal> jan;

    private Map<String, BigDecimal> feb;

    private Map<String, BigDecimal> mar;

    private Map<String, BigDecimal> apr;

    private Map<String, BigDecimal> may;

    private Map<String, BigDecimal> jun;

    private Map<String, BigDecimal> jul;

    private Map<String, BigDecimal> aug;

    private Map<String, BigDecimal> sep;

    private Map<String, BigDecimal> oct;

    private Map<String, BigDecimal> nov;

    private Map<String, BigDecimal> dec;

    public Map<String, BigDecimal> getJan() {
        return jan;
    }

    public void setJan(Map<String, BigDecimal> jan) {
        this.jan = jan;
    }

    public Map<String, BigDecimal> getFeb() {
        return feb;
    }

    public void setFeb(Map<String, BigDecimal> feb) {
        this.feb = feb;
    }

    public Map<String, BigDecimal> getMar() {
        return mar;
    }

    public void setMar(Map<String, BigDecimal> mar) {
        this.mar = mar;
    }

    public Map<String, BigDecimal> getApr() {
        return apr;
    }

    public void setApr(Map<String, BigDecimal> apr) {
        this.apr = apr;
    }

    public Map<String, BigDecimal> getMay() {
        return may;
    }

    public void setMay(Map<String, BigDecimal> may) {
        this.may = may;
    }

    public Map<String, BigDecimal> getJun() {
        return jun;
    }

    public void setJun(Map<String, BigDecimal> jun) {
        this.jun = jun;
    }

    public Map<String, BigDecimal> getJul() {
        return jul;
    }

    public void setJul(Map<String, BigDecimal> jul) {
        this.jul = jul;
    }

    public Map<String, BigDecimal> getAug() {
        return aug;
    }

    public void setAug(Map<String, BigDecimal> aug) {
        this.aug = aug;
    }

    public Map<String, BigDecimal> getSep() {
        return sep;
    }

    public void setSep(Map<String, BigDecimal> sep) {
        this.sep = sep;
    }

    public Map<String, BigDecimal> getOct() {
        return oct;
    }

    public void setOct(Map<String, BigDecimal> oct) {
        this.oct = oct;
    }

    public Map<String, BigDecimal> getNov() {
        return nov;
    }

    public void setNov(Map<String, BigDecimal> nov) {
        this.nov = nov;
    }

    public Map<String, BigDecimal> getDec() {
        return dec;
    }

    public void setDec(Map<String, BigDecimal> dec) {
        this.dec = dec;
    }
}
