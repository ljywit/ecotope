package com.rdc.kingsa.input.server.inbound.model;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * Created by jyliu on 2018/9/29.
 */
@XStreamAlias("template")
public class TemplateDefine {
    @XStreamAlias("header")
    private HeaderDefine header;

    @XStreamAlias("fields")
    private FieldsDefine fields;

    public HeaderDefine getHeader() {
        return header;
    }

    public void setHeader(HeaderDefine header) {
        this.header = header;
    }

    public FieldsDefine getFields() {
        return fields;
    }

    public void setFields(FieldsDefine fields) {
        this.fields = fields;
    }
}
