package com.rdc.kingsa.input.common.pslog.developerlog;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class DeveloperLog {
	public static final String CLASS_NAME = DeveloperLog.class.getName();

	private static final Log LOG = LogFactory.getLog("developer");

	public void debug(DeveloperLogRecord record) {
		String message = record.toLogMsg(CLASS_NAME);
		LOG.debug(message);
	}

	public void error(DeveloperLogRecord record) {
		LOG.error(record.toLogMsg(CLASS_NAME));
	}

	public void error(DeveloperLogRecord record, Throwable e) {
		LOG.error(record.toLogMsg(CLASS_NAME), e);
	}

	public void info(DeveloperLogRecord record) {
		LOG.info(record.toLogMsg(CLASS_NAME));
	}

	public void warn(DeveloperLogRecord record) {
		LOG.warn(record.toLogMsg(CLASS_NAME));
	}

	public void warn(DeveloperLogRecord record, Throwable e) {
		LOG.warn(record.toLogMsg(CLASS_NAME), e);
	}

	public boolean isDebugEnabled() {
		return LOG.isDebugEnabled();
	}

	public boolean isInfoEnabled() {
		return LOG.isInfoEnabled();
	}

	public boolean isWarnEnabled() {
		return LOG.isWarnEnabled();
	}

	public boolean isErrorEnabled() {
		return LOG.isErrorEnabled();
	}
}
