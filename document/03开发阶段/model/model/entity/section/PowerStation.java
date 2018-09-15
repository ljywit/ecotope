package com.rdc.kingsa.model.entity.section;

import java.math.BigDecimal;
import java.util.Date;

public class PowerStation {
    private String id;

    private String geoStationPosition;

    private String geoRiverwayType;

    private String geoLandform;

    private BigDecimal hydrRiverArea;

    private BigDecimal hydrAvgFlow;

    private BigDecimal hydrAvgRunoff;

    private BigDecimal sandAvgVolume;

    private BigDecimal sandAvgTransVolume;

    private BigDecimal sandNatrueWaterTemperature;

    private BigDecimal reserviorWaterline;

    private BigDecimal reserviorWaterlineDead;

    private BigDecimal reserviorNatureArea;

    private BigDecimal reserviorLength;

    private BigDecimal reserviorVolumeTotal;

    private BigDecimal reserviorVolumeNormal;

    private BigDecimal reserviorVolumeDead;

    private BigDecimal reserviorVolumeControl;

    private BigDecimal reserviorVolumeFactor;

    private String reserviorControlType;

    private String reserviorDevelopType;

    private BigDecimal benefitPowerVolumeMax;

    private BigDecimal benefitPowerVolumeMin;

    private BigDecimal benefitPowerVolumeAvg;

    private BigDecimal benefitUsageHoursYear;

    private BigDecimal floodRegionCount;

    private BigDecimal floodCountryTownCount;

    private BigDecimal floodLandArea;

    private BigDecimal floodForestArea;

    private BigDecimal floodPopulation;

    private BigDecimal arrangeImmigrantPopulation;

    private BigDecimal arrangeProductPopulation;

    private String damType;

    private BigDecimal damHeight;

    private BigDecimal damLength;

    private String damOutletType;

    private String damDissipationEnergyType;

    private String damStationPlacement;

    private BigDecimal damWaterInletElevation;

    private BigDecimal constructionDigVolume;

    private BigDecimal constructionWasteSlagVolume;

    private BigDecimal constructionConcreteVolume;

    private BigDecimal constructionPopulationMax;

    private BigDecimal constructionYears;

    private BigDecimal economyTotal;

    private BigDecimal economyKw;

    private BigDecimal economyKwH;

    private String stationName;

    private Date createTime;

    private Date modityTime;

    private String remarks;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getGeoStationPosition() {
        return geoStationPosition;
    }

    public void setGeoStationPosition(String geoStationPosition) {
        this.geoStationPosition = geoStationPosition == null ? null : geoStationPosition.trim();
    }

    public String getGeoRiverwayType() {
        return geoRiverwayType;
    }

    public void setGeoRiverwayType(String geoRiverwayType) {
        this.geoRiverwayType = geoRiverwayType == null ? null : geoRiverwayType.trim();
    }

    public String getGeoLandform() {
        return geoLandform;
    }

    public void setGeoLandform(String geoLandform) {
        this.geoLandform = geoLandform == null ? null : geoLandform.trim();
    }

    public BigDecimal getHydrRiverArea() {
        return hydrRiverArea;
    }

    public void setHydrRiverArea(BigDecimal hydrRiverArea) {
        this.hydrRiverArea = hydrRiverArea;
    }

    public BigDecimal getHydrAvgFlow() {
        return hydrAvgFlow;
    }

    public void setHydrAvgFlow(BigDecimal hydrAvgFlow) {
        this.hydrAvgFlow = hydrAvgFlow;
    }

    public BigDecimal getHydrAvgRunoff() {
        return hydrAvgRunoff;
    }

    public void setHydrAvgRunoff(BigDecimal hydrAvgRunoff) {
        this.hydrAvgRunoff = hydrAvgRunoff;
    }

    public BigDecimal getSandAvgVolume() {
        return sandAvgVolume;
    }

    public void setSandAvgVolume(BigDecimal sandAvgVolume) {
        this.sandAvgVolume = sandAvgVolume;
    }

    public BigDecimal getSandAvgTransVolume() {
        return sandAvgTransVolume;
    }

    public void setSandAvgTransVolume(BigDecimal sandAvgTransVolume) {
        this.sandAvgTransVolume = sandAvgTransVolume;
    }

    public BigDecimal getSandNatrueWaterTemperature() {
        return sandNatrueWaterTemperature;
    }

    public void setSandNatrueWaterTemperature(BigDecimal sandNatrueWaterTemperature) {
        this.sandNatrueWaterTemperature = sandNatrueWaterTemperature;
    }

    public BigDecimal getReserviorWaterline() {
        return reserviorWaterline;
    }

    public void setReserviorWaterline(BigDecimal reserviorWaterline) {
        this.reserviorWaterline = reserviorWaterline;
    }

    public BigDecimal getReserviorWaterlineDead() {
        return reserviorWaterlineDead;
    }

    public void setReserviorWaterlineDead(BigDecimal reserviorWaterlineDead) {
        this.reserviorWaterlineDead = reserviorWaterlineDead;
    }

    public BigDecimal getReserviorNatureArea() {
        return reserviorNatureArea;
    }

    public void setReserviorNatureArea(BigDecimal reserviorNatureArea) {
        this.reserviorNatureArea = reserviorNatureArea;
    }

    public BigDecimal getReserviorLength() {
        return reserviorLength;
    }

    public void setReserviorLength(BigDecimal reserviorLength) {
        this.reserviorLength = reserviorLength;
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

    public BigDecimal getReserviorVolumeDead() {
        return reserviorVolumeDead;
    }

    public void setReserviorVolumeDead(BigDecimal reserviorVolumeDead) {
        this.reserviorVolumeDead = reserviorVolumeDead;
    }

    public BigDecimal getReserviorVolumeControl() {
        return reserviorVolumeControl;
    }

    public void setReserviorVolumeControl(BigDecimal reserviorVolumeControl) {
        this.reserviorVolumeControl = reserviorVolumeControl;
    }

    public BigDecimal getReserviorVolumeFactor() {
        return reserviorVolumeFactor;
    }

    public void setReserviorVolumeFactor(BigDecimal reserviorVolumeFactor) {
        this.reserviorVolumeFactor = reserviorVolumeFactor;
    }

    public String getReserviorControlType() {
        return reserviorControlType;
    }

    public void setReserviorControlType(String reserviorControlType) {
        this.reserviorControlType = reserviorControlType == null ? null : reserviorControlType.trim();
    }

    public String getReserviorDevelopType() {
        return reserviorDevelopType;
    }

    public void setReserviorDevelopType(String reserviorDevelopType) {
        this.reserviorDevelopType = reserviorDevelopType == null ? null : reserviorDevelopType.trim();
    }

    public BigDecimal getBenefitPowerVolumeMax() {
        return benefitPowerVolumeMax;
    }

    public void setBenefitPowerVolumeMax(BigDecimal benefitPowerVolumeMax) {
        this.benefitPowerVolumeMax = benefitPowerVolumeMax;
    }

    public BigDecimal getBenefitPowerVolumeMin() {
        return benefitPowerVolumeMin;
    }

    public void setBenefitPowerVolumeMin(BigDecimal benefitPowerVolumeMin) {
        this.benefitPowerVolumeMin = benefitPowerVolumeMin;
    }

    public BigDecimal getBenefitPowerVolumeAvg() {
        return benefitPowerVolumeAvg;
    }

    public void setBenefitPowerVolumeAvg(BigDecimal benefitPowerVolumeAvg) {
        this.benefitPowerVolumeAvg = benefitPowerVolumeAvg;
    }

    public BigDecimal getBenefitUsageHoursYear() {
        return benefitUsageHoursYear;
    }

    public void setBenefitUsageHoursYear(BigDecimal benefitUsageHoursYear) {
        this.benefitUsageHoursYear = benefitUsageHoursYear;
    }

    public BigDecimal getFloodRegionCount() {
        return floodRegionCount;
    }

    public void setFloodRegionCount(BigDecimal floodRegionCount) {
        this.floodRegionCount = floodRegionCount;
    }

    public BigDecimal getFloodCountryTownCount() {
        return floodCountryTownCount;
    }

    public void setFloodCountryTownCount(BigDecimal floodCountryTownCount) {
        this.floodCountryTownCount = floodCountryTownCount;
    }

    public BigDecimal getFloodLandArea() {
        return floodLandArea;
    }

    public void setFloodLandArea(BigDecimal floodLandArea) {
        this.floodLandArea = floodLandArea;
    }

    public BigDecimal getFloodForestArea() {
        return floodForestArea;
    }

    public void setFloodForestArea(BigDecimal floodForestArea) {
        this.floodForestArea = floodForestArea;
    }

    public BigDecimal getFloodPopulation() {
        return floodPopulation;
    }

    public void setFloodPopulation(BigDecimal floodPopulation) {
        this.floodPopulation = floodPopulation;
    }

    public BigDecimal getArrangeImmigrantPopulation() {
        return arrangeImmigrantPopulation;
    }

    public void setArrangeImmigrantPopulation(BigDecimal arrangeImmigrantPopulation) {
        this.arrangeImmigrantPopulation = arrangeImmigrantPopulation;
    }

    public BigDecimal getArrangeProductPopulation() {
        return arrangeProductPopulation;
    }

    public void setArrangeProductPopulation(BigDecimal arrangeProductPopulation) {
        this.arrangeProductPopulation = arrangeProductPopulation;
    }

    public String getDamType() {
        return damType;
    }

    public void setDamType(String damType) {
        this.damType = damType == null ? null : damType.trim();
    }

    public BigDecimal getDamHeight() {
        return damHeight;
    }

    public void setDamHeight(BigDecimal damHeight) {
        this.damHeight = damHeight;
    }

    public BigDecimal getDamLength() {
        return damLength;
    }

    public void setDamLength(BigDecimal damLength) {
        this.damLength = damLength;
    }

    public String getDamOutletType() {
        return damOutletType;
    }

    public void setDamOutletType(String damOutletType) {
        this.damOutletType = damOutletType == null ? null : damOutletType.trim();
    }

    public String getDamDissipationEnergyType() {
        return damDissipationEnergyType;
    }

    public void setDamDissipationEnergyType(String damDissipationEnergyType) {
        this.damDissipationEnergyType = damDissipationEnergyType == null ? null : damDissipationEnergyType.trim();
    }

    public String getDamStationPlacement() {
        return damStationPlacement;
    }

    public void setDamStationPlacement(String damStationPlacement) {
        this.damStationPlacement = damStationPlacement;
    }

    public BigDecimal getDamWaterInletElevation() {
        return damWaterInletElevation;
    }

    public void setDamWaterInletElevation(BigDecimal damWaterInletElevation) {
        this.damWaterInletElevation = damWaterInletElevation;
    }

    public BigDecimal getConstructionDigVolume() {
        return constructionDigVolume;
    }

    public void setConstructionDigVolume(BigDecimal constructionDigVolume) {
        this.constructionDigVolume = constructionDigVolume;
    }

    public BigDecimal getConstructionWasteSlagVolume() {
        return constructionWasteSlagVolume;
    }

    public void setConstructionWasteSlagVolume(BigDecimal constructionWasteSlagVolume) {
        this.constructionWasteSlagVolume = constructionWasteSlagVolume;
    }

    public BigDecimal getConstructionConcreteVolume() {
        return constructionConcreteVolume;
    }

    public void setConstructionConcreteVolume(BigDecimal constructionConcreteVolume) {
        this.constructionConcreteVolume = constructionConcreteVolume;
    }

    public BigDecimal getConstructionPopulationMax() {
        return constructionPopulationMax;
    }

    public void setConstructionPopulationMax(BigDecimal constructionPopulationMax) {
        this.constructionPopulationMax = constructionPopulationMax;
    }

    public BigDecimal getConstructionYears() {
        return constructionYears;
    }

    public void setConstructionYears(BigDecimal constructionYears) {
        this.constructionYears = constructionYears;
    }

    public BigDecimal getEconomyTotal() {
        return economyTotal;
    }

    public void setEconomyTotal(BigDecimal economyTotal) {
        this.economyTotal = economyTotal;
    }

    public BigDecimal getEconomyKw() {
        return economyKw;
    }

    public void setEconomyKw(BigDecimal economyKw) {
        this.economyKw = economyKw;
    }

    public BigDecimal getEconomyKwH() {
        return economyKwH;
    }

    public void setEconomyKwH(BigDecimal economyKwH) {
        this.economyKwH = economyKwH;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName == null ? null : stationName.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModityTime() {
        return modityTime;
    }

    public void setModityTime(Date modityTime) {
        this.modityTime = modityTime;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }
}