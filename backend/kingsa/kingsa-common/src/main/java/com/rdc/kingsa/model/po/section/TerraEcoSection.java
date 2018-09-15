package com.rdc.kingsa.model.po.section;

/**
 * Created by lxf on 18/8/24.
 */
public class TerraEcoSection extends BaseSection {

    String powerStation;

    String sampLineType;

    String sampNumber;


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
