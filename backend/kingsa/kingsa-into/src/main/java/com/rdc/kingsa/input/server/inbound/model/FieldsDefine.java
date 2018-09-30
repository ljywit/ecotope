package com.rdc.kingsa.input.server.inbound.model;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

import java.util.List;

/**
 * Created by jyliu on 2018/9/29.
 */
@XStreamAlias("fields")
public class FieldsDefine {

    @XStreamImplicit(itemFieldName = "field")
    private List<FieldDefine> fields;

    public List<FieldDefine> getFields() {
        return fields;
    }

    public void setFields(List<FieldDefine> fields) {
        this.fields = fields;
    }
}
