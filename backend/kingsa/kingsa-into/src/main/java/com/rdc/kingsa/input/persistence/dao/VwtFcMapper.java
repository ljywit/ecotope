package com.rdc.kingsa.input.persistence.dao;

import java.util.List;

import com.base.dal.mybatis.BaseDao;
import com.rdc.kingsa.input.persistence.beans.VwtFc;

public interface VwtFcMapper extends BaseDao<VwtFc, String> {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table VWT_FC
     *
     * @mbggenerated Sat Sep 29 22:44:50 CST 2018
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table VWT_FC
     *
     * @mbggenerated Sat Sep 29 22:44:50 CST 2018
     */
    int insert(VwtFc record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table VWT_FC
     *
     * @mbggenerated Sat Sep 29 22:44:50 CST 2018
     */
    VwtFc selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table VWT_FC
     *
     * @mbggenerated Sat Sep 29 22:44:50 CST 2018
     */
    List<VwtFc> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table VWT_FC
     *
     * @mbggenerated Sat Sep 29 22:44:50 CST 2018
     */
    int updateByPrimaryKey(VwtFc record);
}