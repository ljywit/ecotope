package com.rdc.kingsa.input.server.service.base;

import com.base.utils.UUIDUtils;
import com.rdc.kingsa.input.persistence.beans.Approval;
import com.rdc.kingsa.input.persistence.beans.ApprovalDetail;
import com.rdc.kingsa.input.server.controller.model.base.operate.ApprovalIt;

/**
 * description com.rdc.kingsa com.rdc.kingsa.input.server.service
 */
public final class Convert {
    public static Approval aprrovalItIt2Approval(ApprovalIt input) {
        Approval approval = new Approval();
        approval.setStatue((short) input.getApprovalType());
        approval.setType((short) input.getType());
        approval.setId(input.getId());
        return approval;
    }

    public static ApprovalDetail aprrovalItIt2ApprovalDetail(ApprovalIt input) {
        ApprovalDetail approvalDetail = new ApprovalDetail();
        approvalDetail.setApprovalContent(input.getApprovalContent());
        approvalDetail.setApprovalId(input.getId());
        //TODO 用户暂未填写
        approvalDetail.setApprovalUser("");
        approvalDetail.setId(UUIDUtils.getUUID());
        approvalDetail.setSn((short) input.getApprovalType());
        return approvalDetail;
    }
}
