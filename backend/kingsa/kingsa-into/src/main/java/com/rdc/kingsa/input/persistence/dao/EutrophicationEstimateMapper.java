package com.rdc.kingsa.input.persistence.dao;

import com.rdc.kingsa.input.persistence.beans.EutrophicationEstimate;
import java.util.List;

public interface EutrophicationEstimateMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table EUTROPHICATION_ESTIMATE
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table EUTROPHICATION_ESTIMATE
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    int insert(EutrophicationEstimate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table EUTROPHICATION_ESTIMATE
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    EutrophicationEstimate selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table EUTROPHICATION_ESTIMATE
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    List<EutrophicationEstimate> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table EUTROPHICATION_ESTIMATE
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    int updateByPrimaryKey(EutrophicationEstimate record);
}