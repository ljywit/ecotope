package com.rdc.kingsa.input.common;

import com.rdc.kingsa.input.common.constant.KingsaInputConstant;
import com.rdc.kingsa.input.common.constant.SystemTypeEnum;
import com.rdc.kingsa.input.server.controller.model.base.data.PageMD;
import com.rdc.kingsa.input.server.service.base.AbstractMonitorService;
import com.rdc.kingsa.input.server.service.base.SpringContextUtils;
import org.apache.ibatis.session.RowBounds;

/**
 * description com.rdc.kingsa com.rdc.kingsa.input.common
 */
public class KingsaUtil {
    public static RowBounds rowBounds(PageMD page) {
        int pageSize = page.getPageSize();
        if (0 == pageSize) {
            page.setPageSize(KingsaInputConstant.DEFAULT_PAGE_SIZE);
        }
        return new RowBounds(page.getPageNum() * page.getPageSize(), page.getPageSize());
    }

    public static AbstractMonitorService getService(int type) {
        SystemTypeEnum typeEnum = SystemTypeEnum.getEnum(type);
        String serviceV = typeEnum.getService();
        AbstractMonitorService service = SpringContextUtils.getBean(serviceV);
        return service;
    }
}
