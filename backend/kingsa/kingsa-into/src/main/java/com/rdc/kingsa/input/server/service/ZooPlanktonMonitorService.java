package com.rdc.kingsa.input.server.service;

import com.rdc.kingsa.input.common.constant.KingsaInputConstant;
import com.rdc.kingsa.input.persistence.beans.ZooplanktonFc;
import com.rdc.kingsa.input.persistence.beans.ZooplanktonMi;
import com.rdc.kingsa.input.persistence.dao.ZooplanktonFcMapper;
import com.rdc.kingsa.input.persistence.dao.ZooplanktonMiMapper;
import com.rdc.kingsa.input.server.service.base.DefaultMonitorService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * description com.rdc.kingsa com.rdc.kingsa.input.server.service
 * 浮游动物监测
 *
 * @since 2018/9/30.
 */
@Transactional(rollbackFor = Exception.class)
@Service(KingsaInputConstant.ZOOPLANKTON_SERVICE)
public class ZooPlanktonMonitorService
    extends DefaultMonitorService<ZooplanktonMi, ZooplanktonFc, ZooplanktonMiMapper, ZooplanktonFcMapper> {
    @Override
    protected ZooplanktonMi getMiBean() {
        return new ZooplanktonMi();
    }
}
