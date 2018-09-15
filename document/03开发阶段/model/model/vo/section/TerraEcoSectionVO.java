package com.rdc.kingsa.model.vo.section;

/**
 * Created by lxf on 18/8/16.
 */
public class TerraEcoSectionVO extends SectionBaseInfo {

    private String powerStation;

    private String sampLineType;

    private String sampNumber;

    public String getPowerStation() {
        return powerStation;
    }

    public void setPowerStation(String powerStation) {
        this.powerStation = powerStation;
    }

    public String getSampLineType() {
        return sampLineType;
    }

    public void setSampLineType(String sampLineType) {
        this.sampLineType = sampLineType;
    }

    public String getSampNumber() {
        return sampNumber;
    }

    public void setSampNumber(String sampNumber) {
        this.sampNumber = sampNumber;
    }
}
