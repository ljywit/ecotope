package com.rdc.kingsa.input.persistence.dao;

import java.util.List;

import com.base.dal.mybatis.BaseDao;
import com.rdc.kingsa.input.persistence.beans.GssMi;

public interface GssMiMapper extends BaseDao<GssMi, String> {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table GSS_MI
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table GSS_MI
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    int insert(GssMi record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table GSS_MI
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    GssMi selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table GSS_MI
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    List<GssMi> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table GSS_MI
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    int updateByPrimaryKey(GssMi record);
}