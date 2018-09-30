package com.rdc.kingsa.input.server.service;

import com.rdc.kingsa.input.common.constant.KingsaInputConstant;
import com.rdc.kingsa.input.persistence.beans.GssFc;
import com.rdc.kingsa.input.persistence.beans.GssMi;
import com.rdc.kingsa.input.persistence.dao.GssFcMapper;
import com.rdc.kingsa.input.persistence.dao.GssMiMapper;
import com.rdc.kingsa.input.server.service.base.DefaultMonitorService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * description com.rdc.kingsa com.rdc.kingsa.input.server.service
 * 过饱和气体
 *
 * @since 2018/9/30.
 */
@Transactional(rollbackFor = Exception.class)
@Service(KingsaInputConstant.GSS_SERVICE)
public class GssMonitorService extends DefaultMonitorService<GssMi, GssFc, GssMiMapper, GssFcMapper> {
    @Override
    protected GssMi getMiBean() {
        return new GssMi();
    }
}
