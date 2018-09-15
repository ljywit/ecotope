package com.rdc.kingsa.constants;

/**
 * @ClassName:RegexString
 * @Description:正则表达式字符串
 * @Author:Shelly Chan
 * @CreateTime:2018年4月17日上午11:14:39
 */
public interface RegexString {

	/**
	 * yyyy-MM-dd
	 */
	public static final String DATE_REGEX = "((((19|20)\\d{2})-(0?(1|[3-9])|1[012])-(0?[1-9]|[12]\\d|30))|(((19|20)\\d{2})-(0?[13578]|1[02])-31)|(((19|20)\\d{2})-0?2-(0?[1-9]|1\\d|2[0-8]))|((((19|20)([13579][26]|[2468][048]|0[48]))|(2000))-0?2-29))";

	/**
	 * yyyy-MM
	 */
	public static final String MONTH_REGEX = "((?:19|20)\\d\\d)-(0[1-9]|1[012])";

	/**
	 * 实数
	 */
	public static final String REAL_NUMBER_REGEX = "\\d+(\\.\\d+)?";

}