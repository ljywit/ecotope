package com.rdc.kingsa.input.server.service;

import com.rdc.kingsa.input.common.constant.KingsaInputConstant;
import com.rdc.kingsa.input.persistence.beans.PhytoplanktonFc;
import com.rdc.kingsa.input.persistence.beans.PhytoplanktonMi;
import com.rdc.kingsa.input.persistence.dao.PhytoplanktonFcMapper;
import com.rdc.kingsa.input.persistence.dao.PhytoplanktonMiMapper;
import com.rdc.kingsa.input.server.service.base.DefaultMonitorService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * description com.rdc.kingsa com.rdc.kingsa.input.server.service
 * 浮游Zhi物监测
 *
 * @since 2018/9/30.
 */
@Transactional(rollbackFor = Exception.class)
@Service(KingsaInputConstant.PHYTOPLANKTON_SERVICE)
public class PhytoplanktonMonitorService
    extends DefaultMonitorService<PhytoplanktonMi, PhytoplanktonFc, PhytoplanktonMiMapper, PhytoplanktonFcMapper> {
    @Override
    protected PhytoplanktonMi getMiBean() {
        return new PhytoplanktonMi();
    }
}
