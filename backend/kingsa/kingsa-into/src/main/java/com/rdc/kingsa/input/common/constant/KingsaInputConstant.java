package com.rdc.kingsa.input.common.constant;

/**
 * @author wangcai
 * @since 2018/9/18 20:14
 */
public class KingsaInputConstant {
    public static final String ROOT_PATH_PROPERTY = "kingsa-into.root";

    public static final String SECTION = "section";
    public static final String DOWNLOAD_TEMPLATE = "download_template";
    public static final String MONITOR_TYPE = "monitor_type";
    public static final String APPROVAL_TYPE = "approval_type";

    public static final String STATIC_PARAM_KEY = "key";
    public static final String STATIC_PARAM_VALUE = "value";

    /****************************服务名*************************************/
    /**
     * 过饱和气体
     */
    public static final String GSS_SERVICE = "gssService";
    /**
     * 表层水温
     */
    public static final String SWT_SERVICE = "swtService";
    /**
     * 垂向水温
     */
    public static final String VWT_SERVICE = "vwtService";
    /**
     * 渔获记录
     */
    public static final String FISH_RECORD_SERVICE = "fishRecordService";
    /**
     * 底栖动物监测
     */
    public static final String ZOOBENTHOS_SERVICE = "zooBenthosService";
    /**
     * 浮游动物监测
     */
    public static final String ZOOPLANKTON_SERVICE = "zooPlanktonService";
    /**
     * 浮游Zhi物监测
     */
    public static final String PHYTOPLANKTON_SERVICE = "phytoplanktonService";
    /**
     * 鱼类早期资源
     */
    public static final String REPRODUCTION_SERVICE = "reproductionService";

    /*****************************数据库字段相关*******************************************/
    /**
     * 数据库中记录是否属于此项标志位
     */
    public static final Short RECORD_FALG_YES = 1;
    /**
     * 数据库中记录是否属于此项标志位
     */
    public static final Short RECORD_FALG_NO = 0;

    public static final String REPORT_ID_PARAM = "reportId";

    /**
     * 默认页面显示大小
     */
    public static final int DEFAULT_PAGE_SIZE = 20;

    /**
     * 默认页面开始下标
     */
    public static final int DEFAULT_PAGE_START_NUM = 0;
}
