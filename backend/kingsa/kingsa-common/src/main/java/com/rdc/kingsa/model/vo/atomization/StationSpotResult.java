package com.rdc.kingsa.model.vo.atomization;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Created by lxf on 18/8/1.
 */
@ApiModel("测点分布->部位")
public class StationSpotResult {

    @ApiModelProperty("部位名称")
    private String stationSpotName;

    @ApiModelProperty("部位id")
    private String stationSpotId;

    public String getStationSpotName() {
        return stationSpotName;
    }

    public void setStationSpotName(String stationSpotName) {
        this.stationSpotName = stationSpotName;
    }

    public String getStationSpotId() {
        return stationSpotId;
    }

    public void setStationSpotId(String stationSpotId) {
        this.stationSpotId = stationSpotId;
    }
}
