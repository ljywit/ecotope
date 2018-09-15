package com.rdc.kingsa.model.vo.section;

import java.math.BigDecimal;

/**
 * Created by lxf on 18/8/3.
 */
public class PowerStationLiteVO {
    private String id;
    private String stationName;
    private String geoStationPosition;
    private BigDecimal hydrRiverArea;
    private BigDecimal reserviorWaterline;
    private BigDecimal reserviorVolumeTotal;
    private BigDecimal reserviorVolumeNormal;
    private String reserviorControlType;
    private BigDecimal benefitPowerVolumeMax;
    private String damType;
    private String videoUrl;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public String getGeoStationPosition() {
        return geoStationPosition;
    }

    public void setGeoStationPosition(String geoStationPosition) {
        this.geoStationPosition = geoStationPosition;
    }

    public BigDecimal getHydrRiverArea() {
        return hydrRiverArea;
    }

    public void setHydrRiverArea(BigDecimal hydrRiverArea) {
        this.hydrRiverArea = hydrRiverArea;
    }

    public BigDecimal getReserviorWaterline() {
        return reserviorWaterline;
    }

    public void setReserviorWaterline(BigDecimal reserviorWaterline) {
        this.reserviorWaterline = reserviorWaterline;
    }

    public BigDecimal getReserviorVolumeTotal() {
        return reserviorVolumeTotal;
    }

    public void setReserviorVolumeTotal(BigDecimal reserviorVolumeTotal) {
        this.reserviorVolumeTotal = reserviorVolumeTotal;
    }

    public BigDecimal getReserviorVolumeNormal() {
        return reserviorVolumeNormal;
    }

    public void setReserviorVolumeNormal(BigDecimal reserviorVolumeNormal) {
        this.reserviorVolumeNormal = reserviorVolumeNormal;
    }

    public String getReserviorControlType() {
        return reserviorControlType;
    }

    public void setReserviorControlType(String reserviorControlType) {
        this.reserviorControlType = reserviorControlType;
    }

    public BigDecimal getBenefitPowerVolumeMax() {
        return benefitPowerVolumeMax;
    }

    public void setBenefitPowerVolumeMax(BigDecimal benefitPowerVolumeMax) {
        this.benefitPowerVolumeMax = benefitPowerVolumeMax;
    }

    public String getDamType() {
        return damType;
    }

    public void setDamType(String damType) {
        this.damType = damType;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }
}
