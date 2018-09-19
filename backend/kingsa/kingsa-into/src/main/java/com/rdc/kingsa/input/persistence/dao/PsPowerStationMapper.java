package com.rdc.kingsa.input.persistence.dao;

import com.rdc.kingsa.input.persistence.beans.PsPowerStation;
import java.util.List;

public interface PsPowerStationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PS_POWER_STATION
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PS_POWER_STATION
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    int insert(PsPowerStation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PS_POWER_STATION
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    PsPowerStation selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PS_POWER_STATION
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    List<PsPowerStation> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PS_POWER_STATION
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    int updateByPrimaryKey(PsPowerStation record);
}