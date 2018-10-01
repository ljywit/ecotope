package com.rdc.kingsa.input.server.service;

import com.rdc.kingsa.input.common.constant.KingsaInputConstant;
import com.rdc.kingsa.input.persistence.beans.VwtFc;
import com.rdc.kingsa.input.persistence.beans.VwtMi;
import com.rdc.kingsa.input.persistence.dao.VwtFcMapper;
import com.rdc.kingsa.input.persistence.dao.VwtMiMapper;
import com.rdc.kingsa.input.server.service.base.DefaultMonitorService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * description com.rdc.kingsa com.rdc.kingsa.input.server.service
 * 垂向水温
 *
 * @since 2018/9/30.
 */
@Transactional(rollbackFor = Exception.class)
@Service(KingsaInputConstant.VWT_SERVICE)
public class VwtMonitorService extends DefaultMonitorService<VwtMi, VwtFc, VwtMiMapper, VwtFcMapper> {
    @Override
    protected VwtMi getMiBean() {
        return new VwtMi();
    }
}
