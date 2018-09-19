package com.base.utils;


import com.rdc.kingsa.input.common.pslog.PsLog;
import com.rdc.kingsa.input.common.pslog.developerlog.DeveloperLogRecord;

import java.io.Closeable;
import java.io.IOException;

public class CommonTools {

	/**
	 * 关闭数据流
	 * 
	 * @param close
	 */
	public static void closeCloseable(Closeable close) {
		if (null != close) {
			try {
				close.close();
			} catch (IOException e) {
				DeveloperLogRecord record = new DeveloperLogRecord("CommonTools", "closeCloseable", "close error!");
				PsLog.DEVELOPER.error(record, e);
			}
		}
	}

}
