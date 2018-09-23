package com.base.utils;

import com.rdc.kingsa.input.common.constant.SystemTypeEnum;
import com.rdc.kingsa.input.server.controller.model.base.data.PageMD;
import com.rdc.kingsa.input.server.controller.model.base.operate.MonitorReportListIt;
import org.junit.Test;

public class JsonUtilTest {
    @Test
    public void toJsonString() throws Exception {
        PageMD pageMD = new PageMD();
        pageMD.setPageNum(2);
        pageMD.setPageSize(10);
        pageMD.setSum(23);
        MonitorReportListIt monitorReportListIt = new MonitorReportListIt();
        monitorReportListIt.setPagemd(pageMD);
        monitorReportListIt.setShuiWencode(SystemTypeEnum.GuoBaoHeQiTi.getType());
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