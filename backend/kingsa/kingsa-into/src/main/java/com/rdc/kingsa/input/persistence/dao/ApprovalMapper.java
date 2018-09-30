package com.rdc.kingsa.input.persistence.dao;

import com.rdc.kingsa.input.persistence.beans.Approval;
import java.util.List;

public interface ApprovalMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table APPROVAL
     *
     * @mbggenerated Sat Sep 29 22:44:50 CST 2018
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table APPROVAL
     *
     * @mbggenerated Sat Sep 29 22:44:50 CST 2018
     */
    int insert(Approval record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table APPROVAL
     *
     * @mbggenerated Sat Sep 29 22:44:50 CST 2018
     */
    Approval selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table APPROVAL
     *
     * @mbggenerated Sat Sep 29 22:44:50 CST 2018
     */
    List<Approval> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table APPROVAL
     *
     * @mbggenerated Sat Sep 29 22:44:50 CST 2018
     */
    int updateByPrimaryKey(Approval record);
}