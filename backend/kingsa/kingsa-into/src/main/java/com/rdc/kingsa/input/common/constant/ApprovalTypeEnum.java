package com.rdc.kingsa.input.common.constant;

/**
 * 审批
 */
public enum ApprovalTypeEnum {
    _OVER(0, "未提交"),
    _10Ji(10, "已提交，待一级审批"),
    _20Ji(20, "一级审批完成，待二级审批"),
    _30Ji(30, "二级审批完成，待三级级审批"),
    _40Ji(40, "三级级审批完成，已完成审批"),
    _50Ji(50, "审批未通过，回到未提交状态"),
    ;
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

