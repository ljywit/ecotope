package com.rdc.kingsa.model.entity.climate;

import java.util.Date;

public class ClimateRecord {
    private String id;

    private String copyMan;

    private String proofMan;

    private String firstCalcMan;

    private String lastCalcMan;

    private String firstCheckMan;

    private String lastCheckMan;

    private String printMan;

    private Short temperatureMonitor;

    private Short rainMonitor;

    private Short wetMonitor;

    private String recordType;

    private String temperatureUnit;

    private String rainUnit;

    private String wetUnit;

    private Date monitorTimeStart;

    private Date monitorTimeEnd;

    private String sectionId;

    private String recordCode;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getCopyMan() {
        return copyMan;
    }

    public void setCopyMan(String copyMan) {
        this.copyMan = copyMan == null ? null : copyMan.trim();
    }

    public String getProofMan() {
        return proofMan;
    }

    public void setProofMan(String proofMan) {
        this.proofMan = proofMan == null ? null : proofMan.trim();
    }

    public String getFirstCalcMan() {
        return firstCalcMan;
    }

    public void setFirstCalcMan(String firstCalcMan) {
        this.firstCalcMan = firstCalcMan == null ? null : firstCalcMan.trim();
    }

    public String getLastCalcMan() {
        return lastCalcMan;
    }

    public void setLastCalcMan(String lastCalcMan) {
        this.lastCalcMan = lastCalcMan == null ? null : lastCalcMan.trim();
    }

    public String getFirstCheckMan() {
        return firstCheckMan;
    }

    public void setFirstCheckMan(String firstCheckMan) {
        this.firstCheckMan = firstCheckMan == null ? null : firstCheckMan.trim();
    }

    public String getLastCheckMan() {
        return lastCheckMan;
    }

    public void setLastCheckMan(String lastCheckMan) {
        this.lastCheckMan = lastCheckMan == null ? null : lastCheckMan.trim();
    }

    public String getPrintMan() {
        return printMan;
    }

    public void setPrintMan(String printMan) {
        this.printMan = printMan == null ? null : printMan.trim();
    }

    public Short getTemperatureMonitor() {
        return temperatureMonitor;
    }

    public void setTemperatureMonitor(Short temperatureMonitor) {
        this.temperatureMonitor = temperatureMonitor;
    }

    public Short getRainMonitor() {
        return rainMonitor;
    }

    public void setRainMonitor(Short rainMonitor) {
        this.rainMonitor = rainMonitor;
    }

    public Short getWetMonitor() {
        return wetMonitor;
    }

    public void setWetMonitor(Short wetMonitor) {
        this.wetMonitor = wetMonitor;
    }

    public String getRecordType() {
        return recordType;
    }

    public void setRecordType(String recordType) {
        this.recordType = recordType == null ? null : recordType.trim();
    }

    public String getTemperatureUnit() {
        return temperatureUnit;
    }

    public void setTemperatureUnit(String temperatureUnit) {
        this.temperatureUnit = temperatureUnit == null ? null : temperatureUnit.trim();
    }

    public String getRainUnit() {
        return rainUnit;
    }

    public void setRainUnit(String rainUnit) {
        this.rainUnit = rainUnit == null ? null : rainUnit.trim();
    }

    public String getWetUnit() {
        return wetUnit;
    }

    public void setWetUnit(String wetUnit) {
        this.wetUnit = wetUnit == null ? null : wetUnit.trim();
    }

    public Date getMonitorTimeStart() {
        return monitorTimeStart;
    }

    public void setMonitorTimeStart(Date monitorTimeStart) {
        this.monitorTimeStart = monitorTimeStart;
    }

    public Date getMonitorTimeEnd() {
        return monitorTimeEnd;
    }

    public void setMonitorTimeEnd(Date monitorTimeEnd) {
        this.monitorTimeEnd = monitorTimeEnd;
    }

    public String getSectionId() {
        return sectionId;
    }

    public void setSectionId(String sectionId) {
        this.sectionId = sectionId == null ? null : sectionId.trim();
    }

    public String getRecordCode() {
        return recordCode;
    }

    public void setRecordCode(String recordCode) {
        this.recordCode = recordCode == null ? null : recordCode.trim();
    }
}