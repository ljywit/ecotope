package com.rdc.kingsa.input.persistence.dao;

import com.rdc.kingsa.input.persistence.beans.HydrWaterLevelYear;
import java.util.List;

public interface HydrWaterLevelYearMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table HYDR_WATER_LEVEL_YEAR
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table HYDR_WATER_LEVEL_YEAR
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    int insert(HydrWaterLevelYear record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table HYDR_WATER_LEVEL_YEAR
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    HydrWaterLevelYear selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table HYDR_WATER_LEVEL_YEAR
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    List<HydrWaterLevelYear> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table HYDR_WATER_LEVEL_YEAR
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    int updateByPrimaryKey(HydrWaterLevelYear record);
}