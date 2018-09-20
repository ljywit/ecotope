package com.base.utils;

import com.alibaba.fastjson.JSON;

import java.util.List;

/**
 * Json工具
 * 
 */
public class JsonUtil {
	/**
	 * 将对象转换为json字符串
	 * 
	 * @param object 待转换的对象
	 * @return json字符串
	 */
	public static String toJsonString(Object object) {
		return JSON.toJSONString(object);
	}

	/**
	 * 将字符串数组转换为对象列表
	 * 
	 * @param text json 字符串
	 * @param clazz 类
	 * @param <T> 反序列化的类型
	 * @return 对象列表
	 */
	public static final <T> List<T> parseArray(String text, Class<T> clazz) {
		return JSON.parseArray(text, clazz);
	}

	/**
	 * 将字符串转换为对象
	 * 
	 * @param text json
	 * @return 对象
	 */
	public static final Object parse(String text) {
		return JSON.parse(text);
	}

	/**
	 * 将字符串转换为对象
	 * 
	 * @param text json字符串
	 * @param clazz 对象class
	 * @param <T> T
	 * @return 对象
	 */
	public static final <T> T parseObject(String text, Class<T> clazz) {
		return JSON.parseObject(text, clazz);
	}

}
