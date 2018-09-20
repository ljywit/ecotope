package com.rdc.kingsa.input.common.constant;

/**
 * 水文生态环境系统
 */
public class ShuiWenSTHYEnum {
    public enum SystemType {
        NO(-1, "NO"),
        ShuiZhi(10, "地表水水质"),
        ShuiWenT(10, "水温"),
        GuoBaoHeQiTi(10, "过饱和气体"),
        XieHongWuHua(10, "泄洪雾化"),
        ShuiShengShengTai(10, "水生生态"),
        LuShengShengTai(10, "陆生生态"),
        JuDiQiHou(10, "局地气候"),
        ShuiWenH(10, "水文"),;

        private Integer code;
        private String desc;

        SystemType(Integer code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public SystemType getEnum(int code) {
            for (SystemType type : SystemType.values()) {
                if (code == type.code) {
                    return type;
                }
            }
            return NO;
        }

        public Integer getCode() {
            return code;
        }

        public String getDesc() {
            return desc;
        }
    }

    public enum ShenPiType {
        NO(-1, "NO"),
        _0Ji(0, "审批完成"),
        _1Ji(1, "一级审批"),
        _2Ji(2, "二级审批"),
        _3Ji(3, "三级审批");
        private Integer code;
        private String desc;

        ShenPiType(Integer code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public ShenPiType getEnum(int code) {
            for (ShenPiType type : ShenPiType.values()) {
                if (code == type.code) {
                    return type;
                }
            }
            return NO;
        }

        public Integer getCode() {
            return code;
        }

        public String getDesc() {
            return desc;
        }
    }
}
