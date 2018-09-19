package com.rdc.kingsa.input.persistence.dao;

import com.rdc.kingsa.input.persistence.beans.Department;
import java.util.List;

public interface DepartmentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DEPARTMENT
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DEPARTMENT
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    int insert(Department record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DEPARTMENT
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    Department selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DEPARTMENT
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    List<Department> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DEPARTMENT
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    int updateByPrimaryKey(Department record);
}