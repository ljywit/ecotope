package com.base.utils;

import java.util.Map;

/**
 * 字符串工具
 *
 */
public class MapUtil {

	/**
	 * 判断数据对象是否为Map
	 * 
	 * @param data 判断对象
	 * @return 是否是map
	 */
	public static boolean isMap(Object data) {
		if (data == null) {
			return false;
		} else {
			return data instanceof Map;
		}
	}

	/**
	 * Map判空
	 * 
	 * @param data map对象
	 * @return 是否为空
	 */
	public static boolean isEmpty(Map data) {
		boolean isEmpty = true;
		if (data != null && data.size() > 0) {
			isEmpty = false;
		}
		return isEmpty;
	}

	/**
	 * Map判非空
	 * 
	 * @param data map对象
	 * @return 是否不为空
	 */
	public static boolean isNotEmpty(Map data) {
		return !isEmpty(data);
	}


	/**
	 * 获取Map中的value，为空时默认设为空字符串
	 *
	 * @param key key
	 * @param map map
	 * @return str
	 */
	public static String getNotNullValue(Map<String, Object> map, String key) {
		String value = (String) map.get(key);
		if (value == null) {
			return "";
		}
		return value;
	}
}
