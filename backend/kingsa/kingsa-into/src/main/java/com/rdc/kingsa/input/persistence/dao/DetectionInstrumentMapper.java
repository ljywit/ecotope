package com.rdc.kingsa.input.persistence.dao;

import com.rdc.kingsa.input.persistence.beans.DetectionInstrument;
import java.util.List;

public interface DetectionInstrumentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DETECTION_INSTRUMENT
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DETECTION_INSTRUMENT
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    int insert(DetectionInstrument record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DETECTION_INSTRUMENT
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    DetectionInstrument selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DETECTION_INSTRUMENT
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    List<DetectionInstrument> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DETECTION_INSTRUMENT
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    int updateByPrimaryKey(DetectionInstrument record);
}