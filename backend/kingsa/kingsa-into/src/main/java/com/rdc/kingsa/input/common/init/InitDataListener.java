package com.rdc.kingsa.input.common.init;

import com.rdc.kingsa.input.thirds.spring.config.PropertyConfigurer;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.ServletContextAware;

import javax.servlet.ServletContext;
import java.util.Timer;

/**
 * 项目启动加载类
 *
 * @author Administrator
 */
public class InitDataListener implements InitializingBean, ServletContextAware {
    private static Timer timer = new Timer();
    /**
     * 配置文件读取类
     */
    @Autowired
    private PropertyConfigurer propertys;

    @Override
    public void setServletContext(ServletContext arg0) {

    }

    @Override
    public void afterPropertiesSet() throws Exception {
        /*// CacheService.getInstance().reload();
        // 第二天的一点重新刷新此任务
        Date date = DateUtils.addDays(
            com.base.utils.DateUtils.parseDate(com.base.utils.DateUtils.YYYY_MM_DD_HH_MM_SS,
                com.base.utils.DateUtils.getTodayTimeString(com.base.utils.DateUtils.YYYY_MM_DD) + " 01:00:00"),
            1);

        timer.scheduleAtFixedRate(null, date, 24 * 60 * 60 * 1000);*/
    }
}
