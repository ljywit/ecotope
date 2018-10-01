package com.rdc.kingsa.input.server.service;

import com.rdc.kingsa.input.common.constant.KingsaInputConstant;
import com.rdc.kingsa.input.persistence.beans.SwtFc;
import com.rdc.kingsa.input.persistence.beans.SwtMi;
import com.rdc.kingsa.input.persistence.dao.SwtFcMapper;
import com.rdc.kingsa.input.persistence.dao.SwtMiMapper;
import com.rdc.kingsa.input.server.service.base.DefaultMonitorService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * description com.rdc.kingsa com.rdc.kingsa.input.server.service
 * 表层水温
 *
 * @since 2018/9/30.
 */
@Transactional(rollbackFor = Exception.class)
@Service(KingsaInputConstant.SWT_SERVICE)
public class SwtMonitorService extends DefaultMonitorService<SwtMi, SwtFc, SwtMiMapper, SwtFcMapper> {
    @Override
    protected SwtMi getMiBean() {
        return new SwtMi();
    }
}
