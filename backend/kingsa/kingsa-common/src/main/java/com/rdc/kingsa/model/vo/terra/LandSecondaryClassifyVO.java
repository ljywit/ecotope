package com.rdc.kingsa.model.vo.terra;

import com.rdc.kingsa.model.po.terra.LandSecondaryClassifyPO;

import java.util.List;

/**
 * Created by lxf on 18/8/25.
 */
public class LandSecondaryClassifyVO {
    String monitorDate;
    List<LandSecondaryClassifyPO> datas;

    public String getMonitorDate() {
        return monitorDate;
    }

    public void setMonitorDate(String monitorDate) {
        this.monitorDate = monitorDate;
    }

    public List<LandSecondaryClassifyPO> getDatas() {
        return datas;
    }

    public void setDatas(List<LandSecondaryClassifyPO> datas) {
        this.datas = datas;
    }
}
