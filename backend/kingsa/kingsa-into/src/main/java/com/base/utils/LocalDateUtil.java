package com.base.utils;

import java.time.Clock;
import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Date;

/**
 * jdk 8的日期时间工具类.
 *
 * <p>日期对象: LocalDate LocalDate.now() 获取当前日期 LocalDate.of(int year,int month,int
 * day) 构建指定日期.</p>
 *
 * <p>时间对象: LocalTime LocalTime.now() 获取当前时间 LocalDate.of(int hour,int minute,int
 * second) 构建指定时间.</p>
 *
 * <p>时间日期对象: LocalDateTime LocalDateTime.now() 获取当前时间日期 LocalDate.of(int year,int
 * month,int day，int hour,int minute,int second) 构建指定时间日期 LocalDate.of(LocalDate
 * date,LocalTime time) 构建指定时间日期.</p>
 *
 * <p>带时区的时间日期对象: ZoneDateTime.</p>
 *
 * <p>机器时间: Instant.</p>
 */
public class LocalDateUtil {
	/**
	 * HH_MM_SS
	 */
	public static final String HH_MM_SS = "HH:mm:ss";
	/**
	 * YEAR
	 */
	public static final String YEAR = "yyyy";
	/**
	 * MONTH
	 */
	public static final String MONTH = "MM";
	/**
	 * DAY
	 */
	public static final String DAY = "dd";
	/**
	 * HOUR
	 */
	public static final String HOUR = "HH";
	/**
	 * MINUTE
	 */
	public static final String MINUTE = "mm";
	/**
	 * SECOND
	 */
	public static final String SECOND = "ss";

	/**
	 * YYYYMM
	 */
	public static final String YYYYMM = "yyyyMM";
	/**
	 * YYYY_MM
	 */
	public static final String YYYY_MM = "yyyy-MM";
	/**
	 * YYYY_MM_DD
	 */
	public static final String YYYY_MM_DD = "yyyy-MM-dd";
	/**
	 * YYYY_M_D
	 */
	public static final String YYYY_M_D = "yyyy-M-d";
	/**
	 * YYYYMMDD
	 */
	public static final String YYYYMMDD = "yyyyMMdd";

	/**
	 * 日期时间格式 小时
	 */
	public static final String YYYYMMDDHH = "yyyyMMddHH";
	/**
	 * YYYYMMDDHHMMSS
	 */
	public static final String YYYYMMDDHHMMSS = "yyyyMMddHHmmss";
	/**
	 * YYYY_MM_DD_HH_MM_SS
	 */
	public static final String YYYY_MM_DD_HH_MM_SS = "yyyy-MM-dd HH:mm:ss";

	/**
	 * YYYY_MM_DD_HH_MM_SS_SSS
	 */
	public static final String YYYY_MM_DD_HH_MM_SS_SSS = "yyyy-MM-dd HH:mm:ss:SSS";

	/**
	 * UTC Timezone string
	 */
	public static final String TIMEZONE_UTC = "UTC";

	/**
	 * 一天中的开始时间
	 */
	public static final String DAY_START_TIME = "00:00:00";

	/**
	 * 一天中的结束时间
	 */
	public static final String DAY_END_TIME = "23:59:59";

	/**
	 * ONEDAY_MILLISECONDS
	 */
	public static final long ONEDAY_MILLISECONDS = 86400000L;
	/**
	 * ONEHOUR_MILLISECONDS
	 */
	public static final long ONEHOUR_MILLISECONDS = 3600000L;

	/**
	 * number
	 */
	public static final int ONE = 1;
	/**
	 * number
	 */
	public static final int TWO = 2;
	/**
	 * number
	 */
	public static final int FOUR = 4;
	/**
	 * number
	 */
	public static final int FIVE = 5;
	/**
	 * number
	 */
	public static final int SIX = 6;
	/**
	 * number
	 */
	public static final int SEVEN = 7;
	/**
	 * number
	 */
	public static final int EIGHT = 8;
	/**
	 * number
	 */
	public static final int NINE = 9;
	/**
	 * number
	 */
	public static final int TEN = 10;
	/**
	 * number
	 */
	public static final int ELEVEN = 11;
	/**
	 * number
	 */
	public static final int TWELVE = 12;
	/**
	 * number
	 */
	public static final int TWENTY_EIGHT = 28;
	/**
	 * number
	 */
	public static final int TWENTY_NINE = 29;
	/**
	 * number
	 */
	public static final int THIRTY = 30;
	/**
	 * number
	 */
	public static final int THIRTY_ONE = 31;
	/**
	 * weeks of one year
	 */
	public static final int FIFTY_TWO_WEEKS = 52;

	/**
	 * 构造器
	 */
	private LocalDateUtil() {
	}

	/**
	 * 获取当前时间戳 UTC时间从1970年1月1日午夜时分开始经历的时间，不受时区影响
	 *
	 * @return long
	 */
	public static long getCurrentTimeStamp() {
		return Instant.now().toEpochMilli();
	}

	/**
	 * 将时间戳转换为Instant 实际代表的是UTC时间
	 *
	 * @param timeStamp time
	 * @return Instant
	 */
	public static Instant parseCurrentTimeStamp(long timeStamp) {
		return Instant.ofEpochMilli(timeStamp);
	}

	/**
	 * 获取当前服务器时区日期对象 LocalDate 默认时区下
	 *
	 * @return LocalDate
	 */
	public static LocalDate getCurrentDate() {
		return LocalDate.now();
	}

	/**
	 * 将LocalDate对象 转换成字符串
	 *
	 * @param localDate localDate
	 * @param dateFormat dateFormat
	 * @return String
	 */
	public static String formatDate(LocalDate localDate, String dateFormat) {
		return localDate.format(DateTimeFormatter.ofPattern(dateFormat));
	}

	/**
	 * 将字符串 按自定义格式 转成 LocalDate
	 *
	 * @param date date
	 * @param dateFormat format
	 * @return LocalDate
	 */
	public static LocalDate parseDate(String date, String dateFormat) {
		return LocalDate.parse(date, DateTimeFormatter.ofPattern(dateFormat));
	}

	/**
	 * 获取当前服务器时区时间对象
	 *
	 * @return currentTime
	 */
	public static LocalTime getCurrentDateTime() {
		return LocalTime.now();
	}

	/**
	 * 获取当前服务器时区 LocalDateTime 时间日期对象,转换成字符串
	 *
	 * @param dateTimeFormat dateTimeFormat
	 * @return currentDateTime currentDateTime
	 */
	public static String formatCurrentDateTime(String dateTimeFormat) {
		String currentDateTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern(dateTimeFormat));
		return currentDateTime;
	}

	/**
	 * 将LocalDateTime时间对象转成默认String格式
	 *
	 * @param dateTime dateTime
	 * @param dateTimeFormat dateTimeFormat
	 * @return String
	 */
	public static String formatDateTime(LocalDateTime dateTime, String dateTimeFormat) {
		return dateTime.format(DateTimeFormatter.ofPattern(dateTimeFormat));
	}

	/**
	 * 将字符串的日期时间转换成另外一种格式的字符串日期时间.
	 *
	 * @param dateTime 字符串的日期时间
	 * @param srcFormatter dateTime对应的格式
	 * @param dstFormatter 输出格式
     * @return 转换后的字符日期时间
     */
	public static String formatDateTime(String dateTime, String srcFormatter, String dstFormatter) {
		return LocalDateTime.parse(dateTime, DateTimeFormatter.ofPattern(srcFormatter))
			.format(DateTimeFormatter.ofPattern(dstFormatter));
	}

	/**
	 * 将字符串 按 自定义格式 转成 LocalDateTime 对象
	 *
	 * @param localDateTime localDateTime
	 * @param dateTimeFormat format
	 * @return LocalDateTime
	 */
	public static LocalDateTime parseDateTime(String localDateTime, String dateTimeFormat) {
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(dateTimeFormat);
		return LocalDateTime.parse(localDateTime, dateTimeFormatter);
	}

	/**
	 * 时间计算
	 *
	 * @param dateTime LocalDateTime
	 * @param num long
	 * @param unit ChronoUnit
	 * @return LocalDate
	 */
	public static LocalDate plusOrMinus(LocalDate dateTime, long num, ChronoUnit unit) {
		if (dateTime != null) {
			if (num > 0) {
				return dateTime.plus(num, unit);
			}
			if (num < 0) {
				return dateTime.minus(Math.abs(num), unit);
			}
		}
		return dateTime;
	}

	/**
	 * 时间计算
	 *
	 * @param dateTime LocalDateTime
	 * @param num long
	 * @param unit ChronoUnit
	 * @return LocalDateTime
	 */
	public static LocalDateTime plusOrMinus(LocalDateTime dateTime, long num, ChronoUnit unit) {
		if (dateTime != null) {
			if (num > 0) {
				return dateTime.plus(num, unit);
			}
			if (num < 0) {
				return dateTime.minus(Math.abs(num), unit);
			}
		}
		return dateTime;
	}

	/**
	 * 获取当前(默认) 时区时间
	 *
	 * @return ZonedDateTime
	 */
	public static ZonedDateTime getCurrentZoneDateTime() {
		return ZonedDateTime.now();
	}

	/**
	 * 获得指定时区时间
	 *
	 * @param zoneId zoneId
	 * @return ZonedDateTime
	 */
	public static ZonedDateTime getZoneDateTime(String zoneId) {
		return ZonedDateTime.now(ZoneId.of(zoneId));
	}

	/**
	 * 获取时区偏移量(单位：second) 负数表示 time1 在 time2 前面
	 *
	 * @param zoneId1 zone String
	 * @param zoneId2 zone String
	 * @return offset
	 */
	public static int getTimeZoneOffset(String zoneId1, String zoneId2) {
		if (StringUtil.isEmpty(zoneId1) || StringUtil.isEmpty(zoneId2)) {
			throw new RuntimeException("zoneId cannot be empty!");
		}
		ZonedDateTime dateTime1 = ZonedDateTime.of(LocalDateTime.now(), ZoneId.of(zoneId1));
		ZonedDateTime dateTime2 = ZonedDateTime.of(LocalDateTime.now(), ZoneId.of(zoneId1));
		ZoneOffset offset1 = dateTime1.getOffset();
		ZoneOffset offset2 = dateTime2.getOffset();
		return offset1.compareTo(offset2);
	}

	/**
	 * isBefore
	 *
	 * @param dateTime1 dateTime1
	 * @param dateTime2 dateTime2
	 * @return boolean
	 */
	public static boolean isBefore(LocalDateTime dateTime1, LocalDateTime dateTime2) {
		if (dateTime1 == null && dateTime2 == null) {
			return false;
		} else if (dateTime1 == null) {
			return true;
		} else if (dateTime2 == null) {
			return false;
		} else {
			return dateTime1.isBefore(dateTime2);
		}
	}

	/**
	 * isAfter
	 *
	 * @param dateTime1 dateTime1
	 * @param dateTime2 dateTime2
	 * @return boolean
	 */
	public static boolean isAfter(LocalDateTime dateTime1, LocalDateTime dateTime2) {
		if (dateTime1 == null && dateTime2 == null) {
			return false;
		} else if (dateTime1 == null) {
			return false;
		} else if (dateTime2 == null) {
			return true;
		} else {
			return dateTime1.isAfter(dateTime2);
		}
	}

	/**
	 * isEqual
	 *
	 * @param dateTime1 dateTime1
	 * @param dateTime2 dateTime2
	 * @return boolean
	 */
	public static boolean isEqual(String dateTime1, String dateTime2) {
		if (dateTime1 == null && dateTime2 == null) {
			return true;
		} else if (dateTime1 == null || dateTime2 == null) {
			return false;
		} else {
			return dateTime1.equals(dateTime2);
		}
	}

	/**
	 * 将时间进行时区转换
	 *
	 * @param dateTime LocalDateTime
	 * @param fromZoneId String
	 * @param toZoneId String
	 * @return LocalDateTime
	 */
	public static LocalDateTime convertTimezone(LocalDateTime dateTime, String fromZoneId, String toZoneId) {
		if (dateTime == null || StringUtil.isEmpty(fromZoneId) || StringUtil.isEmpty(toZoneId)) {
			throw new RuntimeException("zoneDateTime or zoneId cannot be empty!");
		}
		return ZonedDateTime.of(dateTime, ZoneId.of(fromZoneId)).withZoneSameInstant(ZoneId.of(toZoneId))
				.toLocalDateTime();
	}

	/**
	 * 将时间进行时区转换
	 *
	 * @param dateTime LocalDateTime
	 * @param fromZoneId String
	 * @param toZoneId String
	 * @param formatter 入参的日期格式以及返回的格式
	 * @return LocalDateTime
	 */
	public static String convertTimezone(
		String dateTime, String fromZoneId, String toZoneId, String formatter) {
		LocalDateTime localDateTime = parseDateTime(dateTime, formatter);
		LocalDateTime iosDateTime = LocalDateTime.parse(localDateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));

		return formatDateTime(convertTimezone(iosDateTime, fromZoneId, toZoneId), formatter);
	}

	/**
	 * 获取UTC时间
	 *
	 * @return ZonedDateTime
	 */
	public static ZonedDateTime getUTCtime() {
		return ZonedDateTime.now(Clock.systemUTC());
	}

	/**
	 * 获取UTC时间
	 *
	 * @return LocalDate
	 */
	public static LocalDate getCurrentUTCDate() {
		return ZonedDateTime.now(Clock.systemUTC()).toLocalDate();
	}

	/**
	 * 获取UTC时间
	 *
	 * @return LocalDateTime
	 */
	public static LocalDateTime getCurrentUTCDateTime() {
		return ZonedDateTime.now(Clock.systemUTC()).toLocalDateTime();
	}

	/**
	 * 将 LocalDateTime转成 Date
	 *
	 * @param localDateTime localDateTime
	 * @return Date
	 */
	public static Date localDateTimeToDate(LocalDateTime localDateTime) {
		ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime, ZoneId.systemDefault());
		return Date.from(zonedDateTime.toInstant());
	}

	/**
	 * 将 Date 转成 LocalDateTime
	 *
	 * @param date date
	 * @return LocalDateTime
	 */
	public static LocalDateTime dateToLocalDateTime(Date date) {
		Instant instant = date.toInstant();
		LocalDateTime localDateTime = instant.atZone(ZoneId.systemDefault()).toLocalDateTime();
		return localDateTime;
	}

	/**
	 * 将 LocalDate 转成 Date
	 *
	 * @param localDate LocalDate
	 * @return Date
	 */
	public Date localDateToDate(LocalDate localDate) {
		ZonedDateTime zonedDateTime = localDate.atStartOfDay(ZoneId.systemDefault());
		Instant instant1 = zonedDateTime.toInstant();
		Date from = Date.from(instant1);
		return from;
	}

	/**
	 * 将 Date 转成 LocalDate
	 *
	 * @param date date
	 * @return LocalDate
	 */
	public LocalDate dateToLocalDate(Date date) {
		Instant instant = date.toInstant();
		ZonedDateTime zdt = instant.atZone(ZoneId.systemDefault());
		LocalDate localDate = zdt.toLocalDate();
		return localDate;
	}

	/**
	 * 截取时间，支持日、时、分、秒
	 * 
	 * @param dateTime LocalDateTime
	 * @param unit ChronoUnit
	 * @return LocalDateTime
	 */
	public LocalDateTime truncate(LocalDateTime dateTime, ChronoUnit unit) {
		if (dateTime == null) {
			return null;
		}
		if (ChronoUnit.DAYS.equals(unit)) {
			return LocalDateTime.of(dateTime.getYear(), dateTime.getMonth(), dateTime.getDayOfMonth(), 0, 0);
		} else if (ChronoUnit.HOURS.equals(unit)) {
			return LocalDateTime.of(dateTime.getYear(), dateTime.getMonth(), dateTime.getDayOfMonth(),
					dateTime.getHour(), 0);
		} else if (ChronoUnit.MINUTES.equals(unit)) {
			return LocalDateTime.of(dateTime.getYear(), dateTime.getMonth(), dateTime.getDayOfMonth(),
					dateTime.getHour(), dateTime.getMinute());
		} else if (ChronoUnit.SECONDS.equals(unit)) {
			return LocalDateTime.of(dateTime.getYear(), dateTime.getMonth(), dateTime.getDayOfMonth(),
					dateTime.getHour(), dateTime.getMinute(), dateTime.getSecond());
		}
		return dateTime;
	}

	/**
	 * 获取月第一天
	 * 
	 * @param date LocalDate
	 * @return LocalDate
	 */
	public LocalDate getStartDayOfMonth(LocalDate date) {
		return date.with(TemporalAdjusters.firstDayOfMonth());
	}

	/**
	 * 获取月最后一天
	 * 
	 * @param date LocalDate
	 * @return LocalDate
	 */
	public LocalDate getEndDayOfMonth(LocalDate date) {
		return date.with(TemporalAdjusters.lastDayOfMonth());
	}

	/**
	 * 一天的开始
	 * 
	 * @param dateTime String
	 * @return LocalDateTime
	 */
	public LocalDateTime getStartOfDay(LocalDateTime dateTime) {
		LocalDate localDate = LocalDate.from(dateTime);
		return localDate.atStartOfDay();
	}

	/**
	 * 获取每天的最后一微秒
	 * 
	 * @param date LocalDateTime
	 * @return LocalDateTime
	 */
	public LocalDateTime getEndOfDay(LocalDateTime date) {
		LocalDate localDate = LocalDate.from(date);
		return localDate.atStartOfDay().plusDays(1L).minusNanos(1L);
	}

	/**
	 * 获取当周的第一天
	 * 
	 * @param date LocalDate
	 * @param isMonday isMonday
	 * @return LocalDate
	 */
	public LocalDate getStartDayOfWeek(LocalDate date, boolean isMonday) {
		DayOfWeek dayOfWeek = date.getDayOfWeek();
		if (isMonday) {
			return date.minusDays(dayOfWeek.getValue() - 1);
		} else {
			if (DayOfWeek.SUNDAY.equals(dayOfWeek)) {
				return date;
			} else {
				return date.minusDays(dayOfWeek.getValue());
			}
		}
	}

	/**
	 * 判断是否为闰年
	 * 
	 * @param date LocalDate
	 * @return boolean
	 */
	public boolean isLeapYear(LocalDate date) {
		return date.isLeapYear();
	}
}
