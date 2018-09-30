package com.rdc.kingsa.input.server.inbound.model;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamConverter;
import com.thoughtworks.xstream.converters.basic.BooleanConverter;
import com.thoughtworks.xstream.converters.basic.IntConverter;

/**
 * Created by jyliu on 2018/9/29.
 */
@XStreamAlias("header")
public class HeaderDefine {


    @XStreamAsAttribute
    @XStreamAlias("sheetName")
    private String sheetName;

    @XStreamAsAttribute
    @XStreamAlias("fromUp2Down")
    @XStreamConverter(BooleanConverter.class)
    private boolean fromUp2Down;

    @XStreamAsAttribute
    @XStreamAlias("headerRowNum")
    @XStreamConverter(IntConverter.class)
    private int headerRowNum;

    @XStreamAsAttribute
    @XStreamAlias("headerColNum")
    @XStreamConverter(IntConverter.class)
    private int headerColNum;

    @XStreamAsAttribute
    @XStreamAlias("titleRowNum")
    @XStreamConverter(IntConverter.class)
    private int titleRowNum;

    public String getSheetName() {
        return sheetName;
    }

    public void setSheetName(String sheetName) {
        this.sheetName = sheetName;
    }

    public boolean isFromUp2Down() {
        return fromUp2Down;
    }

    public void setFromUp2Down(boolean fromUp2Down) {
        this.fromUp2Down = fromUp2Down;
    }

    public int getHeaderRowNum() {
        return headerRowNum;
    }

    public void setHeaderRowNum(int headerRowNum) {
        this.headerRowNum = headerRowNum;
    }

    public int getHeaderColNum() {
        return headerColNum;
    }

    public void setHeaderColNum(int headerColNum) {
        this.headerColNum = headerColNum;
    }

    public int getTitleRowNum() {
        return titleRowNum;
    }

    public void setTitleRowNum(int titleRowNum) {
        this.titleRowNum = titleRowNum;
    }
}
