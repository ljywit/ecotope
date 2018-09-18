package com.rdc.kingsa.input.thirds.spring.config;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;

import java.util.Properties;

/***
 * 属性文件读取类
 * 
 * @author Administrator
 *
 */
public class PropertyConfigurer extends PropertyPlaceholderConfigurer {

	private static PropertyConfigurer instance;

	/** 属性文件 */
	private Properties props;

	@SuppressWarnings("static-access")
	public PropertyConfigurer() {
		this.instance = this;
	}

	public static PropertyConfigurer getInstance() {
		return instance;
	}

	@Override
	protected void processProperties(ConfigurableListableBeanFactory beanFactoryToProcess, Properties props)
			throws BeansException {
		this.props = props;
		super.processProperties(beanFactoryToProcess, props);
	}

	/**
	 * 读取属性文件
	 * 
	 * @param key
	 * @return
	 */
	public String getString(String key) {
		return props.getProperty(key);
	}

	/**
	 * 读取属性文件，转为long型
	 * 
	 * @param key
	 * @return
	 */
	public long getLong(String key) {
		String value = getString(key);
		return Long.parseLong(value);
	}

	/**
	 * 读取属性文件，转为int型
	 * 
	 * @param key
	 * @return
	 */
	public int getInt(String key) {
		String value = getString(key);
		return Integer.parseInt(value);
	}

	/**
	 * 读取属性文件，转为boolean型
	 * 
	 * @param key
	 * @return
	 */
	public boolean getBoolean(String key) {
		String value = getString(key);
		return Boolean.parseBoolean(value);
	}

}
