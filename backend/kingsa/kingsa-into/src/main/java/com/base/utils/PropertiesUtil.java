package com.base.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 获取配置项工具<br/>
 * 从系统中的SysConfigUtil演变而来
 */
public class PropertiesUtil {

    /**
     * 配置缓存
     */
    private static final ConcurrentHashMap<String, Properties> CONFIG_MAP = new ConcurrentHashMap();

    /**
     * 从指定的配置文件（classpath）中获取配置项
     *
     * @param configPath 配置文件路径
     * @param strKey     配置项key
     * @return 配置项值
     */
    public static String getPropertyByClassPath(String configPath, String strKey) {
        String strValue = "";
        Properties properties = parseConfigProperty(configPath, true);
        if (properties != null) {
            Object obj = properties.get(strKey);
            if (obj != null) {
                strValue = String.valueOf(obj);
            }
        }
        return strValue;
    }

    /**
     * 从指定的配置文件（文件系统）中获取配置项
     *
     * @param configPath 配置文件路径
     * @param strKey     配置项key
     * @return 配置项值
     */
    public static String getPropertyByFilePath(String configPath, String strKey) {
        String strValue = "";
        Properties properties = parseConfigProperty(configPath, false);
        if (properties != null) {
            strValue = (String) properties.get(strKey);
        }
        return strValue;
    }

    /**
     * 根据文件路径或路径类型解析properties文件
     *
     * @param configPath    文件路径
     * @param fromClassPath 文件系统还是classpath
     * @return 配置项集合
     */
    private static Properties parseConfigProperty(String configPath, boolean fromClassPath) {
        String configPathKey = configPath + ":" + fromClassPath;
        if (!CONFIG_MAP.containsKey(configPathKey)) {
            synchronized (PropertiesUtil.class) {
                if (!CONFIG_MAP.containsKey(configPathKey)) {
                    Properties properties = new Properties();
                    try {
                        if (fromClassPath) {
                            properties.load(
                                    Thread.currentThread().getContextClassLoader().getResourceAsStream(configPath));
                        } else {
                            properties.load(new FileInputStream(configPath));
                        }
                        CONFIG_MAP.put(configPathKey, properties);
                    } catch (IOException e) {
                        // 不往外抛出异常
                        e.printStackTrace();
                    }

                }
            }
        }
        return CONFIG_MAP.get(configPathKey);
    }

    /**
     * 根据文件路径或路径类型获取配置项
     *
     * @param configPath    配置文件路径
     * @param fromClassPath 文件系统还是classpath
     * @return map
     */
    public static Map<String, String> getConfigProperties(String configPath, boolean fromClassPath) {
        Map<String, String> map = new HashMap();
        Properties properties = parseConfigProperty(configPath, fromClassPath);
        if (MapUtil.isNotEmpty(properties)) {
            Set<String> propNameList = properties.stringPropertyNames();
            if (!propNameList.isEmpty()) {
                String propValue;
                for (String propName : propNameList) {
                    propValue = properties.getProperty(propName);
                    map.put(propName, propValue);
                }
            }
        }
        return map;
    }
}
