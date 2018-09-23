package com.rdc.kingsa.input.server.controller.model.base;

import org.apache.commons.lang3.builder.ToStringBuilder;

public abstract class AbstractMD {
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
