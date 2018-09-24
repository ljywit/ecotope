package com.rdc.kingsa.input.server.controller.model.base.data;

import java.util.List;

import com.rdc.kingsa.input.persistence.beans.Approval;
import com.rdc.kingsa.input.persistence.beans.ApprovalDetail;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiParam;

/**
 * description com.rdc.kingsa com.rdc.kingsa.input.server.controller.model.base.data
 */
@ApiModel("审批相关信息-包含详细信息")
public class ApprovalMD {
    @ApiParam("审批状态信息")
    private Approval approval;
    @ApiParam("审批详细信息")
    private List<ApprovalDetail> approvalDetailList;

    public ApprovalMD() {
    }

    public ApprovalMD(Approval approval, List<ApprovalDetail> approvalDetails) {
        this.approval = approval;
        this.approvalDetailList = approvalDetails;
    }

    /**
     * 获取 approval
     *
     * @return approval
     */
    public Approval getApproval() {
        return approval;
    }

    /**
     * 设置 approval
     *
     * @param approval approval
     */
    public void setApproval(Approval approval) {
        this.approval = approval;
    }

    /**
     * 获取 approvalDetailList
     *
     * @return approvalDetailList
     */
    public List<ApprovalDetail> getApprovalDetailList() {
        return approvalDetailList;
    }

    /**
     * 设置 approvalDetailList
     *
     * @param approvalDetailList approvalDetailList
     */
    public void setApprovalDetailList(List<ApprovalDetail> approvalDetailList) {
        this.approvalDetailList = approvalDetailList;
    }
}
