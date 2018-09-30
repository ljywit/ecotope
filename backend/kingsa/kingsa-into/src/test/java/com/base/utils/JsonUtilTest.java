package com.base.utils;

import com.rdc.kingsa.input.common.constant.SystemTypeEnum;
import com.rdc.kingsa.input.server.controller.model.base.data.PageMD;
import com.rdc.kingsa.input.server.controller.model.base.operate.GetMonitorReportListIt;
import org.junit.Test;

public class JsonUtilTest {
    @Test
    public void toJsonString() throws Exception {
        PageMD pageMD = new PageMD();
        pageMD.setPageNum(2);
        pageMD.setPageSize(10);
        pageMD.setSum(23);
        GetMonitorReportListIt monitorReportListIt = new GetMonitorReportListIt();
        monitorReportListIt.setPagemd(pageMD);
        monitorReportListIt.setType(SystemTypeEnum.GuoBaoHeQiTi.getType());
        System.out.println(JsonUtil.toJsonString(monitorReportListIt));
    }

    @Test
    public void parseArray() throws Exception {
    }

    @Test
    public void parse() throws Exception {
    }

    @Test
    public void parseObject() throws Exception {
    }

}