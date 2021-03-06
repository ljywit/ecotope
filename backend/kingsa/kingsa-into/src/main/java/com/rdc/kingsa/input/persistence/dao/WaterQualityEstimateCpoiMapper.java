package com.rdc.kingsa.input.persistence.dao;

import com.rdc.kingsa.input.persistence.beans.WaterQualityEstimateCpoi;
import java.util.List;

public interface WaterQualityEstimateCpoiMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table WATER_QUALITY_ESTIMATE_CPOI
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table WATER_QUALITY_ESTIMATE_CPOI
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    int insert(WaterQualityEstimateCpoi record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table WATER_QUALITY_ESTIMATE_CPOI
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    WaterQualityEstimateCpoi selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table WATER_QUALITY_ESTIMATE_CPOI
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    List<WaterQualityEstimateCpoi> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table WATER_QUALITY_ESTIMATE_CPOI
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    int updateByPrimaryKey(WaterQualityEstimateCpoi record);
}