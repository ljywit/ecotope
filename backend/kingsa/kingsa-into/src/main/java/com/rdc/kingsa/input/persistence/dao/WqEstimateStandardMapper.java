package com.rdc.kingsa.input.persistence.dao;

import com.rdc.kingsa.input.persistence.beans.WqEstimateStandard;
import java.util.List;

public interface WqEstimateStandardMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table WQ_ESTIMATE_STANDARD
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table WQ_ESTIMATE_STANDARD
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    int insert(WqEstimateStandard record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table WQ_ESTIMATE_STANDARD
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    WqEstimateStandard selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table WQ_ESTIMATE_STANDARD
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    List<WqEstimateStandard> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table WQ_ESTIMATE_STANDARD
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    int updateByPrimaryKey(WqEstimateStandard record);
}