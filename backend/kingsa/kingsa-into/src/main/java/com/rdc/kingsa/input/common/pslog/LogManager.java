package com.rdc.kingsa.input.common.pslog;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import com.rdc.kingsa.input.common.pslog.conts.CommonParams;
import com.rdc.kingsa.input.common.pslog.developerlog.DeveloperLogRecord;
import org.apache.log4j.PropertyConfigurator;


public class LogManager {

	private static final LogManager INSTANCE = new LogManager();

	public static LogManager getInstance() {
		return INSTANCE;
	}

	private LogManager() {
		try {
			this.init();
		} catch (IOException e) {
			DeveloperLogRecord record = new DeveloperLogRecord("LogManager", "", "");
			PsLog.DEVELOPER.error(record, e);
		} catch (Exception e) {
			DeveloperLogRecord record = new DeveloperLogRecord("LogManager", "", "");
			PsLog.DEVELOPER.error(record, e);
		}
	}

	public void init() throws Exception {
		InputStream in = null;
		in = LogManager.class.getResourceAsStream(CommonParams.FILE_LOG4J_PATH);
		init(in);
	}

	private void init(InputStream in) throws Exception {
		Properties props = new Properties();
		try {
			props.load(in);
			PropertyConfigurator.configure(props);
		} finally {
			try {
				in.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
