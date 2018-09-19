package com.base.dal.object;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;


public abstract class AbstractDO implements Serializable {

	private static final long serialVersionUID = -3942149913171834745L;

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	public abstract Serializable getId();
}
