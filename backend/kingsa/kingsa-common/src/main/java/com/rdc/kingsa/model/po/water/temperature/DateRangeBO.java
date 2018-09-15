package com.rdc.kingsa.model.po.water.temperature;

import java.time.LocalDate;

/**
 * Created by lxf on 18/8/21.
 */
public class DateRangeBO {
    LocalDate start;
    LocalDate end;

    public LocalDate getStart() {
        return start;
    }

    public void setStart(LocalDate start) {
        this.start = start;
    }

    public LocalDate getEnd() {
        return end;
    }

    public void setEnd(LocalDate end) {
        this.end = end;
    }
}
