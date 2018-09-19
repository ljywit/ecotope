package com.rdc.kingsa.input.persistence.dao;

import com.rdc.kingsa.input.persistence.beans.DocTag;
import java.util.List;

public interface DocTagMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DOC_TAG
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DOC_TAG
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    int insert(DocTag record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DOC_TAG
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    DocTag selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DOC_TAG
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    List<DocTag> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DOC_TAG
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    int updateByPrimaryKey(DocTag record);
}