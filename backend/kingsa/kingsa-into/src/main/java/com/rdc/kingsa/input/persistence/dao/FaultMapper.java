package com.rdc.kingsa.input.persistence.dao;

import com.rdc.kingsa.input.persistence.beans.Fault;
import java.util.List;

public interface FaultMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FAULT
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FAULT
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    int insert(Fault record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FAULT
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    Fault selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FAULT
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    List<Fault> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FAULT
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    int updateByPrimaryKey(Fault record);
}