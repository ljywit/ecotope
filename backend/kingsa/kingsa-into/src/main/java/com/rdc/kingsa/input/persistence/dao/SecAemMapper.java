package com.rdc.kingsa.input.persistence.dao;

import com.rdc.kingsa.input.persistence.beans.SecAem;
import java.util.List;

public interface SecAemMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SEC_AEM
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SEC_AEM
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    int insert(SecAem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SEC_AEM
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    SecAem selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SEC_AEM
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    List<SecAem> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SEC_AEM
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    int updateByPrimaryKey(SecAem record);
}