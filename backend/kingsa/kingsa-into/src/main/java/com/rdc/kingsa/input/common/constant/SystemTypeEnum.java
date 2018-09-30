package com.rdc.kingsa.input.common.constant;

/**
 * 水文生态环境系统
 */
public enum SystemTypeEnum {
    NO(-1, "_OVER"),

    ShuiZhi(10, "水质"),
    ShuiZhi_WQ(101, "水质-干流"),
    ShuiZhi_DO(102, "水质-排污口"),
    ShuiZhi_BM(103, "水质-底泥"),

    ShuiWenT(20, "水温"),
    ShuiWen_SWT(201, "水温-表层"),
    ShuiWen_VWT(202, "水温-垂向"),

    GuoBaoHeQiTi(30, "过饱和气体", KingsaInputConstant.GSS_SERVICE),

    XieHongWuHua(40, "泄洪雾化"),

    ShuiShengShengTai(50, "水生生态"),
    ShuiShengShengTai_FR(501, "水生生态-鱼类资源"),
    ShuiShengShengTai_FE(502, "水生生态-渔业生态环境"),
    ShuiShengShengTai_FY(503, "水生生态-鱼类早期资源"),

    LuShengShengTai(60, "陆生生态"),

    JuDiQiHou(70, "局地气候"),

    ShuiWenH(80, "水文");

    //TODO 每个明细都有自己的service，只是不同的接口实现：导入接口和增删查改的接口

    private Integer type;
    private String desc;
    private String service;

    SystemTypeEnum() {
    }

    SystemTypeEnum(Integer type, String desc) {
        this.type = type;
        this.desc = desc;
    }

    SystemTypeEnum(Integer type, String desc, String service) {
        this.type = type;
        this.desc = desc;
        this.service = service;
    }

    public static SystemTypeEnum getEnum(int typeCode) {
        for (SystemTypeEnum type : SystemTypeEnum.values()) {
            if (typeCode == type.type) {
                return type;
            }
        }
        return NO;
    }

    public Integer getType() {
        return type;
    }

    public String getDesc() {
        return desc;
    }

    public String getService() {
        return service;
    }
}
