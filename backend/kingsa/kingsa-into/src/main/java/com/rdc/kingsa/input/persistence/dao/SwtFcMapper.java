package com.rdc.kingsa.input.persistence.dao;

import com.rdc.kingsa.input.persistence.beans.SwtFc;
import java.util.List;

public interface SwtFcMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SWT_FC
     *
     * @mbggenerated Sat Sep 29 22:44:50 CST 2018
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SWT_FC
     *
     * @mbggenerated Sat Sep 29 22:44:50 CST 2018
     */
    int insert(SwtFc record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SWT_FC
     *
     * @mbggenerated Sat Sep 29 22:44:50 CST 2018
     */
    SwtFc selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SWT_FC
     *
     * @mbggenerated Sat Sep 29 22:44:50 CST 2018
     */
    List<SwtFc> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SWT_FC
     *
     * @mbggenerated Sat Sep 29 22:44:50 CST 2018
     */
    int updateByPrimaryKey(SwtFc record);
}