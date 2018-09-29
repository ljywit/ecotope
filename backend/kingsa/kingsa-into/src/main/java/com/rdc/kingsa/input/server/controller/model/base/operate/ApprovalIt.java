package com.rdc.kingsa.input.server.controller.model.base.operate;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.apache.commons.lang3.builder.ToStringBuilder;

@ApiModel("审批请求信息")
public class ApprovalIt {
    @ApiModelProperty("审批记录ID")
    private String id;
    @ApiModelProperty("监测因子类型type,对应静态数据接口数据")
    private int type;
    @ApiModelProperty("审批类型,对应静态数据接口数据")
    private int approvalType;
    @ApiModelProperty("审批方向,打回或者下一步,对应填写的字符串是RESET、NEXT")
    private String direction;
    @ApiModelProperty("审批意见")
    private String approvalContent;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getApprovalType() {
        return approvalType;
    }

    public void setApprovalType(int approvalType) {
        this.approvalType = approvalType;
    }

    /**
     * 获取 approvalContent
     *
     * @return approvalContent
     */
    public String getApprovalContent() {
        return approvalContent;
    }

    /**
     * 设置 approvalContent
     *
     * @param approvalContent approvalContent
     */
    public void setApprovalContent(String approvalContent) {
        this.approvalContent = approvalContent;
    }

    /**
     * 获取 direction
     *
     * @return direction
     */
    public String getDirection() {
        return direction;
    }

    /**
     * 设置 direction
     *
     * @param direction direction
     */
    public void setDirection(String direction) {
        this.direction = direction;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
