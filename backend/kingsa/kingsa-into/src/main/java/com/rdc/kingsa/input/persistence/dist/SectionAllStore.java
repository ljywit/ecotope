package com.rdc.kingsa.input.persistence.dist;

import com.rdc.kingsa.input.common.constant.SystemTypeEnum;
import com.rdc.kingsa.input.persistence.dao.*;
import com.rdc.kingsa.input.server.controller.model.base.data.SectionMD;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

/**
 * description com.rdc.kingsa com.rdc.kingsa.input.persistence.dist
 *
 * @since 2018/9/21.
 */
@Transactional(rollbackFor = Exception.class)
@Service("sectionAllStore")
public class SectionAllStore {

    @Autowired
    private SectionMapper sectionMapper;

    /**
     * 水质断面
     */
    @Autowired
    private SecWqmMapper secWqmMapper;

    /**
     * 水温断面
     */
    @Autowired
    private SecWtmMapper secWtmMapper;
    @Autowired
    private SecGsmMapper secGsmMapper;
    /*@AutowiredXieHongWuHua(10, "泄洪雾化"),
    private SecGsmMapper secGsmMapper;*/
    @Autowired
    private SecAemMapper secAemMapper;
    @Autowired
    private SecTemMapper secTemMapper;
    /*@Autowired
    private SecWqmMapper secWqmMapper;*/
    @Autowired
    private SecHydrMapper secHydrMapper;

    public List<SectionMD> getAllSection() {
        List<SectionMD> sectionMDS = sectionMapper.selectAllForFront();
        List<SectionMD> result = sectionMDS.stream()
                .filter(sectionMD -> StringUtils.isNotEmpty(sectionMD.getId())
                        && StringUtils.isNotEmpty(sectionMD.getName())
                        && sectionMD.getType() != SystemTypeEnum.NO.getType())
                .collect(Collectors.toList());
        return result;
    }
}
