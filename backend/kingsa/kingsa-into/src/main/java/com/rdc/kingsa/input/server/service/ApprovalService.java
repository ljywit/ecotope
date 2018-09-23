package com.rdc.kingsa.input.server.service;


import com.rdc.kingsa.input.persistence.dao.ApprovalDetailMapper;
import com.rdc.kingsa.input.persistence.dao.ApprovalMapper;
import com.rdc.kingsa.input.server.controller.model.base.operate.AprrovalIt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional(rollbackFor = Exception.class)
@Service("approvalService")
public class ApprovalService {

    @Autowired
    private ApprovalMapper approvalMapper;
    @Autowired
    private ApprovalDetailMapper approvalDetailMapper;

    public void approve(AprrovalIt input) {
        approvalMapper.insert(Convert.aprrovalItIt2Approval(input));
        approvalDetailMapper.insert(Convert.aprrovalItIt2ApprovalDetail(input));
    }
}
