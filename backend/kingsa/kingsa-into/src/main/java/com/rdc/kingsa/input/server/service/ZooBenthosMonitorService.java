package com.rdc.kingsa.input.server.service;

import com.rdc.kingsa.input.common.constant.KingsaInputConstant;
import com.rdc.kingsa.input.persistence.beans.ZoobenthosFc;
import com.rdc.kingsa.input.persistence.beans.ZoobenthosMi;
import com.rdc.kingsa.input.persistence.dao.ZoobenthosFcMapper;
import com.rdc.kingsa.input.persistence.dao.ZoobenthosMiMapper;
import com.rdc.kingsa.input.server.service.base.DefaultMonitorService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * description com.rdc.kingsa com.rdc.kingsa.input.server.service
 * 底栖动物监测
 *
 * @since 2018/9/30.
 */
@Transactional(rollbackFor = Exception.class)
@Service(KingsaInputConstant.ZOOBENTHOS_SERVICE)
public class ZooBenthosMonitorService
    extends DefaultMonitorService<ZoobenthosMi, ZoobenthosFc, ZoobenthosMiMapper, ZoobenthosFcMapper> {
    @Override
    protected ZoobenthosMi getMiBean() {
        return new ZoobenthosMi();
    }
}
