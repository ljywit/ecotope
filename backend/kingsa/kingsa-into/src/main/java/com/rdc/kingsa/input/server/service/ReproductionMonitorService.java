package com.rdc.kingsa.input.server.service;

import com.rdc.kingsa.input.common.constant.KingsaInputConstant;
import com.rdc.kingsa.input.persistence.beans.ReproductionEcology;
import com.rdc.kingsa.input.persistence.beans.ReproductionEcologyFc;
import com.rdc.kingsa.input.persistence.dao.ReproductionEcologyFcMapper;
import com.rdc.kingsa.input.persistence.dao.ReproductionEcologyMapper;
import com.rdc.kingsa.input.server.service.base.DefaultMonitorService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * description com.rdc.kingsa com.rdc.kingsa.input.server.service
 * 鱼类早期资源监测
 *
 * @since 2018/9/30.
 */
@Transactional(rollbackFor = Exception.class)
@Service(KingsaInputConstant.REPRODUCTION_SERVICE)
public class ReproductionMonitorService
    extends DefaultMonitorService<ReproductionEcology, ReproductionEcologyFc, ReproductionEcologyMapper,
    ReproductionEcologyFcMapper> {
    @Override
    protected ReproductionEcology getMiBean() {
        return new ReproductionEcology();
    }
}
