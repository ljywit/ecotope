package com.base.utils;

import com.rdc.kingsa.input.common.pslog.PsLog;
import com.rdc.kingsa.input.common.pslog.developerlog.DeveloperLogRecord;
import org.apache.commons.lang3.StringUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;




/**
 * 日期工具类
 * 
 * @author Administrator
 *
 */
public class DateUtils {
	public static final String HH_MM_SS = "HH:mm:ss";
	public static final String YEAR = "yyyy";
	public static final String MOUTH = "MM";
	public static final String DAY = "dd";
	public static final String HOUR = "HH";
	public static final String MINUTE = "mm";
	public static final String YYYY_MM_DD = "yyyy-MM-dd";
	public static final String YYYYMM = "yyyyMM";
	public static final String YYYY_M_D = "yyyy-M-d";
	public static final String YYYY_MM_DD_HH_MM_SS = "yyyy-MM-dd HH:mm:ss";
	public static final String YYYY_MM = "yyyy-MM";
	public static final String YYYYMMDD = "yyyyMMdd";
	public static final String YYYYMMDDHH = "yyyyMMddHH";
	public static final String YYYYMMDDHHMMSS = "yyyyMMddHHmmss";
	public static final String YYYYMMDDHHMMSSSSS = "yyyyMMddHHmmsssss";
	public static final String SECOND = "ss";
	public static final String WEEK_EEEE = "EEEE";
	public static final long ONEDAY_MILLISECONDS = 86400000L;
	public static final long ONEHOUR_MILLISECONDS = 3600000L;
	public static final int ONE = 1;
	public static final int TWO = 2;
	public static final int FOUR = 4;
	public static final int FIVE = 5;
	public static final int SIX = 6;
	public static final int SEVEN = 7;
	public static final int EIGHT = 8;
	public static final int NINE = 9;
	public static final int TEN = 10;
	public static final int ELEVEN = 11;
	public static final int TWELVE = 12;
	public static final int TWENTY_EIGHT = 28;
	public static final int TWENTY_NINE = 29;
	public static final int THIRTY = 30;
	public static final int THIRTY_ONE = 31;
	public static final int FIFTY_TWO = 52;

	/**
	 * 毫秒数转为日期
	 * 
	 * @param millis
	 * @return
	 */
	public static String millis2String(long millis) {
		Date date = new Date(millis);
		return date2String(date, YYYYMMDDHHMMSSSSS);
	}

	/***
	 * 日期转为毫秒数
	 * 
	 * @throws ParseException
	 */
	public static long String2Millis(String dateStr, String format) {
		if (StringUtils.isEmpty(format)) {
			format = YYYYMMDDHHMMSSSSS;
		}
		Date date = string2Date(dateStr, format);
		return date.getTime();
	}

	public static Date string2Date(String dateStr, String format) {
		Date date = null;
		try {
			SimpleDateFormat sdf = new SimpleDateFormat(format);
			date = sdf.parse(dateStr);
		} catch (ParseException e) {
			System.err.println("格式转换失败!");
		}
		return date;
	}

	/**
	 * 格式化日期
	 * 
	 * @param date
	 * @param pattern
	 * @return
	 */
	public static String date2String(Date date, String pattern) {
		if (date == null) {
			return null;
		}
		if (pattern == null) {
			pattern = YYYYMMDDHHMMSSSSS;
		}
		return new SimpleDateFormat(pattern).format(date);
	}

	public static int daysBetween(Date begin, Date end) {
		GregorianCalendar pFormer = new GregorianCalendar();

		GregorianCalendar pLatter = new GregorianCalendar();

		pFormer.setTime(begin);

		pLatter.setTime(end);

		GregorianCalendar vFormer = pFormer;
		GregorianCalendar vLatter = pLatter;

		if (!pFormer.before(pLatter)) {
			vFormer = pLatter;
			vLatter = pFormer;
		}

		vFormer.set(14, 0);

		vFormer.set(13, 0);

		vFormer.set(12, 0);

		vFormer.set(11, 0);

		vLatter.set(14, 0);

		vLatter.set(13, 0);

		vLatter.set(12, 0);

		vLatter.set(11, 0);

		int vCounter = 0;

		boolean flag = vFormer.before(vLatter);
		while (flag) {
			vFormer.add(5, 1);
			vCounter++;

			flag = vFormer.before(vLatter);
		}

		return vCounter - 1;
	}

	public static String getTodayTimeString(String formatStr) {
		if ((null == formatStr) || ("".equals(formatStr))) {
			formatStr = YYYY_MM_DD_HH_MM_SS;
		}
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat format = new SimpleDateFormat(formatStr);
		String date = format.format(calendar.getTime());
		return date;
	}

	/**
	 * 
	 * @param time
	 * @param formatStr
	 * @param month
	 * @return
	 */
	public static String addDayTimeString(String time, String formatStr, int month) {
		SimpleDateFormat format = new SimpleDateFormat(formatStr);
		Calendar calendar = Calendar.getInstance();
		Date date;
		try {
			date = format.parse(time);
			calendar.setTime(date);
		} catch (ParseException e) {
			DeveloperLogRecord record = new DeveloperLogRecord("VipChangeTime", "addDayTimeString()",
					"change vip end time by matul！");
			PsLog.DEVELOPER.error(record, e);
		}

		calendar.add(Calendar.MONTH, month);
		String timeS = format.format(calendar.getTime());
		return timeS;
	}

	public static String addDayTimeString(String formatStr, int month) {
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat format = new SimpleDateFormat(formatStr);
		calendar.add(Calendar.MONTH, month);
		String date = format.format(calendar.getTime());
		return date;
	}

	public static String[] addDayTimeStrings(String formatStr, int month) {
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat format = new SimpleDateFormat(formatStr);
		String date1 = format.format(calendar.getTime());
		calendar.add(Calendar.MONTH, month);
		String date2 = format.format(calendar.getTime());
		return new String[] { date1, date2 };
	}

	public static Date parseDate(String pattern, String date) {
		Date d = null;
		try {
			if (null != date) {
				d = new SimpleDateFormat(pattern).parse(date.trim());
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return d;
	}
}
