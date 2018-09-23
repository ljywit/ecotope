package com.rdc.kingsa.input.common.constant;

/**
 * 审批
 */
public enum ApprovalTypeEnum {
    _OVER(-1, "审批完成"),
    _0Ji(0, "未审批"),
    _1Ji(1, "一级审批"),
    _2Ji(2, "二级审批"),
    _3Ji(3, "三级审批");
    private Integer type;
    private String desc;

    ApprovalTypeEnum() {
    }

    ApprovalTypeEnum(Integer type, String desc) {
        this.type = type;
        this.desc = desc;
    }

    public ApprovalTypeEnum getEnum(int typeCode) {
        for (ApprovalTypeEnum type : ApprovalTypeEnum.values()) {
            if (typeCode == type.type) {
                return type;
            }
        }
        return _OVER;
    }

    public Integer getType() {
        return type;
    }

    public String getDesc() {
        return desc;
    }
}

