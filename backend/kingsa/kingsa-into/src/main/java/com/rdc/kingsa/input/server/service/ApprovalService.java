package com.rdc.kingsa.input.server.service;


import com.rdc.kingsa.input.server.controller.model.base.operate.ApprovalIt;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional(rollbackFor = Exception.class)
@Service("approvalService")
public class ApprovalService extends BaseService {

    public void approve(ApprovalIt input) {
        approvalMapper.insert(Convert.aprrovalItIt2Approval(input));
        approvalDetailMapper.insert(Convert.aprrovalItIt2ApprovalDetail(input));
    }
}
