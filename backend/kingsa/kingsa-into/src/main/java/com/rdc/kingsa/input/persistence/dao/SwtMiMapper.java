package com.rdc.kingsa.input.persistence.dao;

import com.rdc.kingsa.input.persistence.beans.SwtMi;
import java.util.List;

public interface SwtMiMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SWT_MI
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SWT_MI
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    int insert(SwtMi record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SWT_MI
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    SwtMi selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SWT_MI
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    List<SwtMi> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SWT_MI
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    int updateByPrimaryKey(SwtMi record);
}