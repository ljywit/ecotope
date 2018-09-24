package com.rdc.kingsa.input.common;

import com.rdc.kingsa.input.server.controller.model.base.data.PageMD;
import org.apache.ibatis.session.RowBounds;

/**
 * description com.rdc.kingsa com.rdc.kingsa.input.common
 */
public class KingsaUtil {
    public static RowBounds rowBounds(PageMD page) {
        return new RowBounds(page.getPageNum() * page.getPageSize(), page.getPageSize());
    }
}
