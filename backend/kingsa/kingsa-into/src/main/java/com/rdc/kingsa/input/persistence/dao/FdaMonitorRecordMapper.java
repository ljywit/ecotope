package com.rdc.kingsa.input.persistence.dao;

import com.rdc.kingsa.input.persistence.beans.FdaMonitorRecord;
import java.util.List;

public interface FdaMonitorRecordMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FDA_MONITOR_RECORD
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FDA_MONITOR_RECORD
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    int insert(FdaMonitorRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FDA_MONITOR_RECORD
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    FdaMonitorRecord selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FDA_MONITOR_RECORD
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    List<FdaMonitorRecord> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FDA_MONITOR_RECORD
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    int updateByPrimaryKey(FdaMonitorRecord record);
}