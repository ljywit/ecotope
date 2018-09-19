package com.rdc.kingsa.input.persistence.dao;

import com.rdc.kingsa.input.persistence.beans.SecWqm;
import java.util.List;

public interface SecWqmMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SEC_WQM
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SEC_WQM
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    int insert(SecWqm record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SEC_WQM
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    SecWqm selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SEC_WQM
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    List<SecWqm> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SEC_WQM
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    int updateByPrimaryKey(SecWqm record);
}