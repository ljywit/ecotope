package com.rdc.kingsa.input.server.service;


import com.rdc.kingsa.input.persistence.beans.Section;
import com.rdc.kingsa.input.persistence.dao.SectionMapper;
import com.rdc.kingsa.input.server.controller.model.SectionMD;
import com.rdc.kingsa.input.thirds.spring.config.PropertyConfigurer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 业务处理类
 *
 * @author Administrator
 */
@Transactional(rollbackFor = Exception.class)
@Service("kingsaDemoService")
public class DemoService {

    /**
     * 配置文件读取类
     */
    @Autowired
    private PropertyConfigurer propertys;

    @Autowired
    private SectionMapper sectionMapper;

    public SectionMD detail(SectionMD sectionMD) {
        Section section = sectionMapper.selectByPrimaryKey(sectionMD.getId());
        SectionMD result = new SectionMD();
        result.setAeMonitor(section.getAeMonitor());
        result.setId(section.getId());
        return result;
    }
}
