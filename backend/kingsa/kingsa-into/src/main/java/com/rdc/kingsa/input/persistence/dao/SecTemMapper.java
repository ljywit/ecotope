package com.rdc.kingsa.input.persistence.dao;

import com.rdc.kingsa.input.persistence.beans.SecTem;
import java.util.List;

public interface SecTemMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SEC_TEM
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SEC_TEM
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    int insert(SecTem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SEC_TEM
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    SecTem selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SEC_TEM
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    List<SecTem> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SEC_TEM
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    int updateByPrimaryKey(SecTem record);
}