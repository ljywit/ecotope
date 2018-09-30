package com.rdc.kingsa.input.persistence.dao;

import com.rdc.kingsa.input.persistence.beans.PhytoplanktonFc;
import java.util.List;

public interface PhytoplanktonFcMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PHYTOPLANKTON_FC
     *
     * @mbggenerated Sat Sep 29 23:18:49 CST 2018
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PHYTOPLANKTON_FC
     *
     * @mbggenerated Sat Sep 29 23:18:49 CST 2018
     */
    int insert(PhytoplanktonFc record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PHYTOPLANKTON_FC
     *
     * @mbggenerated Sat Sep 29 23:18:49 CST 2018
     */
    PhytoplanktonFc selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PHYTOPLANKTON_FC
     *
     * @mbggenerated Sat Sep 29 23:18:49 CST 2018
     */
    List<PhytoplanktonFc> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PHYTOPLANKTON_FC
     *
     * @mbggenerated Sat Sep 29 23:18:49 CST 2018
     */
    int updateByPrimaryKey(PhytoplanktonFc record);
}