package com.rdc.kingsa.input.server.inbound;

import com.base.utils.DateUtils;
import com.base.utils.StringUtil;
import jxl.Cell;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Date;
import java.util.Map;

/**
 * Created by jyliu on 2018/9/29.
 */
public class GssInboundProcessor extends AbstractInboudProcessor {
    public static void main(String[] args) {
        GssInboundProcessor processor = new GssInboundProcessor();
        InputStream in = null;
        try {
            in = new FileInputStream("kingsa-into/sample/gss.xls");
            processor.importFromStream(in);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected String getTemplatePath() {
        return "template/gss_inbound.xml";
    }

    @Override
    protected Map<String, Object> handleSingle(Cell[] current) {
        Map<String, Object> jobMap = super.handleSingle(current);
        Date monitorDate = (Date) jobMap.get("monitorDate");
        Date monitorTime = (Date) jobMap.get("monitorTime");
        monitorTime = DateUtils.string2Date(DateUtils.date2String(monitorDate, "yyyyMMdd") + DateUtils.date2String(monitorTime, "HHmm"), "yyyyMMddHHmm");
        jobMap.put("monitorTime", monitorTime);
        return jobMap;
    }

    /**
     * 判断是否结束解析
     *
     * @param previous
     * @param current
     * @return
     */
    protected boolean isEOF(Cell[] previous, Cell[] current) {
        return StringUtil.isBlank(readCell(current, 0))
                && (previous == null || StringUtil.isBlank(readCell(previous, 0)));
    }
}
