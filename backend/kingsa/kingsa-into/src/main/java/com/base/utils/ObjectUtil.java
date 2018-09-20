package com.base.utils;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Description: ObjectUtil null会被认为是任何值，简化代码中对null的判断
 *
 */
public class ObjectUtil {

	/**
	 * isString
	 * 
	 * @param obj obj
	 * @return boolean
	 */
	public static boolean isString(Object obj) {
		if (obj == null) {
			return true;
		} else {
			return obj instanceof String;
		}
	}

	/**
	 * isInt
	 * 
	 * @param obj obj
	 * @return boolean
	 */
	public static boolean isInt(Object obj) {
		if (obj == null) {
			return true;
		} else {
			return obj instanceof Integer;
		}
	}

	/**
	 * isLong
	 * 
	 * @param obj obj
	 * @return boolean
	 */
	public static boolean isLong(Object obj) {
		if (obj == null) {
			return true;
		} else {
			return obj instanceof Long;
		}
	}

	/**
	 * isFloat
	 * 
	 * @param obj obj
	 * @return boolean
	 */
	public static boolean isFloat(Object obj) {
		if (obj == null) {
			return true;
		} else {
			return obj instanceof Float;
		}
	}

	/**
	 * isDouble
	 * 
	 * @param obj obj
	 * @return boolean
	 */
	public static boolean isDouble(Object obj) {
		if (obj == null) {
			return true;
		} else {
			return obj instanceof Double;
		}
	}

	/**
	 * isBigDecimal
	 * 
	 * @param obj obj
	 * @return boolean
	 */
	public static boolean isBigDecimal(Object obj) {
		if (obj == null) {
			return true;
		} else {
			return obj instanceof BigDecimal;
		}
	}

	/**
	 * isDate
	 * 
	 * @param obj obj
	 * @return boolean
	 */
	public static boolean isDate(Object obj) {
		if (obj == null) {
			return true;
		} else {
			return obj instanceof Date;
		}
	}

	/**
	 * areEqual
	 * 
	 * @param o1 o1
	 * @param o2 o2
	 * @return boolean
	 */
	public static boolean areEqual(Object o1, Object o2) {
		Object o11 = o1;
		if ("".equals(o11)) {
			o11 = null;
		}
		Object o21 = o2;
		if ("".equals(o21)) {
			o21 = null;
		}

		if (o11 == null && o21 == null) {
			return true;
		} else if (o11 != null) {
			if (o21 != null && o11 instanceof BigDecimal && o21 instanceof BigDecimal) {
				return (((BigDecimal) o11).doubleValue() == ((BigDecimal) o21).doubleValue());
			}
			return o11.equals(o21);
		} else {
			return o21.equals(o11);
		}
	}
}
