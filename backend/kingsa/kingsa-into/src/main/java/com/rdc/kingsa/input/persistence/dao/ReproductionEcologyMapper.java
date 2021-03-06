package com.rdc.kingsa.input.persistence.dao;

import java.util.List;

import com.base.dal.mybatis.BaseDao;
import com.rdc.kingsa.input.persistence.beans.ReproductionEcology;

public interface ReproductionEcologyMapper extends BaseDao<ReproductionEcology, String> {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table REPRODUCTION_ECOLOGY
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table REPRODUCTION_ECOLOGY
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    int insert(ReproductionEcology record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table REPRODUCTION_ECOLOGY
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    ReproductionEcology selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table REPRODUCTION_ECOLOGY
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    List<ReproductionEcology> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table REPRODUCTION_ECOLOGY
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    int updateByPrimaryKey(ReproductionEcology record);
}