package com.rdc.kingsa.input.persistence.dao;

import com.rdc.kingsa.input.persistence.beans.PsFile;
import java.util.List;

public interface PsFileMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PS_FILE
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    int insert(PsFile record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PS_FILE
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    List<PsFile> selectAll();
}