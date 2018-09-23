package com.rdc.kingsa.input.common.constant;

/**
 * 水文生态环境系统
 */
public enum SystemTypeEnum {
    NO(-1, "_OVER"),
    ShuiZhi(10, "地表水水质"),
    ShuiWenT(20, "水温"),
    GuoBaoHeQiTi(30, "过饱和气体"),
    XieHongWuHua(40, "泄洪雾化"),
    ShuiShengShengTai(50, "水生生态"),
    LuShengShengTai(60, "陆生生态"),
    JuDiQiHou(70, "局地气候"),
    ShuiWenH(80, "水文"),;

    private Integer type;
    private String desc;

    SystemTypeEnum() {
    }

    SystemTypeEnum(Integer type, String desc) {
        this.type = type;
        this.desc = desc;
    }

    public SystemTypeEnum getEnum(int typeCode) {
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
}
