package com.rdc.kingsa.input.server.service.base;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * description com.rdc.kingsa com.rdc.kingsa.input.server.service.base
 *
 * @since 2018/9/29.
 */
@Component
public final class SpringContextUtils implements ApplicationContextAware {
    /**
     * ApplicationContext
     */
    private static ApplicationContext applicationContext;

    /**
     * Constructor
     */
    private SpringContextUtils() {
    }

    /**
     * getBean
     *
     * @param name name
     * @param type type
     * @param <T>  type
     * @return bean
     */
    public static <T> T getBean(String name, Class<T> type) {
        return applicationContext.getBean(name, type);
    }

    /**
     * getBean By ClassType.
     *
     * @param type 类型
     * @param <T>  泛型
     * @return bean
     */
    public static <T> T getBean(Class<T> type) {
        return applicationContext.getBean(type);
    }

    /**
     * 根据bean的id获取实例对象，配置在applicationContext.xml的配置文件中
     * 注：参数objects不为空的时候，只能产生scope为prototype类型的对象
     *
     * @param <T>      type
     * @param beanName name
     * @param objects  构造方法参数
     * @return bean
     */
    public static <T> T getBean(String beanName, Object... objects) {
        if (objects.length == 0) {
            return (T) applicationContext.getBean(beanName);
        } else {
            return (T) applicationContext.getBean(beanName, objects);
        }
    }

    /**
     * 设置spring上下文
     *
     * @param applicationContext spring容器上下文
     * @throws BeansException e
     */
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        SpringContextUtils.applicationContext = applicationContext;
    }

}
