package com.rdc.kingsa.input.persistence.dao;

import com.rdc.kingsa.input.persistence.beans.FdaStationSpot;
import java.util.List;

public interface FdaStationSpotMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FDA_STATION_SPOT
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FDA_STATION_SPOT
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    int insert(FdaStationSpot record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FDA_STATION_SPOT
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    FdaStationSpot selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FDA_STATION_SPOT
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    List<FdaStationSpot> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FDA_STATION_SPOT
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    int updateByPrimaryKey(FdaStationSpot record);
}