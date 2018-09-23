package com.rdc.kingsa.input.common.pslog.developerlog;

import com.rdc.kingsa.input.common.pslog.conts.CommonParams;
import org.apache.log4j.spi.LocationInfo;


public class DeveloperLogRecord {
    private String moduleName;
    private String type;
    private String message;

    public DeveloperLogRecord(String message) {
        this.moduleName = "";
        this.type = "";
        this.message = message;
    }

    public DeveloperLogRecord(String moduleName, String type, String message) {
        this.moduleName = moduleName;
        this.type = type;
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getModuleName() {
        return this.moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String toLogMsg(String logClassName) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.moduleName).append(CommonParams.LOG_SPILT_CHAR).append(this.type)
            .append(CommonParams.LOG_SPILT_CHAR).append(this.message);

        LocationInfo locationInfo = new LocationInfo(new Throwable(), logClassName);
        sb.append(CommonParams.LOG_SPILT_CHAR).append(locationInfo.getFileName()).append(locationInfo.getLineNumber());

        return sb.toString();
    }
}
