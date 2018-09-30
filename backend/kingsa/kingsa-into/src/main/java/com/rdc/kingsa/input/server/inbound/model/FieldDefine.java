package com.rdc.kingsa.input.server.inbound.model;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamConverter;
import com.thoughtworks.xstream.converters.basic.BooleanConverter;
import com.thoughtworks.xstream.converters.basic.IntConverter;

/**
 * Created by jyliu on 2018/9/29.
 */
@XStreamAlias("field")
public class FieldDefine {
    @XStreamAsAttribute
    @XStreamAlias("name")
    private String name;

    @XStreamAsAttribute
    @XStreamAlias("label")
    private String label;

    @XStreamAsAttribute
    @XStreamAlias("col")
    @XStreamConverter(IntConverter.class)
    private int col;

    @XStreamAsAttribute
    @XStreamAlias("row")
    @XStreamConverter(IntConverter.class)
    private int row;

    @XStreamAsAttribute
    @XStreamAlias("mandatory")
    @XStreamConverter(BooleanConverter.class)
    private boolean mandatory = true;

    @XStreamAsAttribute
    @XStreamAlias("checkLabel")
    @XStreamConverter(BooleanConverter.class)
    private boolean checkLabel = true;

    @XStreamAsAttribute
    @XStreamAlias("type")
    private String type = "java.lang.String";

    @XStreamAsAttribute
    @XStreamAlias("format")
    private String format;

    @XStreamAsAttribute
    @XStreamAlias("mappingType")
    private String mappingType;

    @XStreamAsAttribute
    @XStreamAlias("mappingCode")
    private String mappingCode;

    @XStreamAsAttribute
    @XStreamAlias("mappingFieldName")
    private String mappingFieldName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public boolean isMandatory() {
        return mandatory;
    }

    public void setMandatory(boolean mandatory) {
        this.mandatory = mandatory;
    }

    public boolean isCheckLabel() {
        return checkLabel;
    }

    public void setCheckLabel(boolean checkLabel) {
        this.checkLabel = checkLabel;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getMappingType() {
        return mappingType;
    }

    public void setMappingType(String mappingType) {
        this.mappingType = mappingType;
    }

    public String getMappingCode() {
        return mappingCode;
    }

    public void setMappingCode(String mappingCode) {
        this.mappingCode = mappingCode;
    }

    public String getMappingFieldName() {
        return mappingFieldName;
    }

    public void setMappingFieldName(String mappingFieldName) {
        this.mappingFieldName = mappingFieldName;
    }
}
