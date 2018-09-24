package com.rdc.kingsa.input.server.service;

import java.util.List;

import com.rdc.kingsa.input.persistence.beans.Approval;
import com.rdc.kingsa.input.persistence.beans.ApprovalDetail;
import com.rdc.kingsa.input.persistence.dao.ApprovalDetailMapper;
import com.rdc.kingsa.input.persistence.dao.ApprovalMapper;
import com.rdc.kingsa.input.server.controller.model.base.data.ApprovalMD;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * description com.rdc.kingsa com.rdc.kingsa.input.server.service
 */
public class BaseService {
    @Autowired
    protected ApprovalMapper approvalMapper;
    @Autowired
    protected ApprovalDetailMapper approvalDetailMapper;

    public ApprovalMD approveDetail(String id) throws Exception {
        Approval approval = approvalMapper.selectByPrimaryKey(id);
        ApprovalDetail query = new ApprovalDetail();
        query.setApprovalId(id);
        List<ApprovalDetail> approvalDetails = approvalDetailMapper.findPageBreakByBean(query, RowBounds.DEFAULT);
        ApprovalMD approvalMD = new ApprovalMD(approval, approvalDetails);
        return approvalMD;
    }
}
