package com.rdc.kingsa.input.persistence.dao;

import com.rdc.kingsa.input.persistence.beans.SpawningSite;
import java.util.List;

public interface SpawningSiteMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SPAWNING_SITE
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SPAWNING_SITE
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    int insert(SpawningSite record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SPAWNING_SITE
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    SpawningSite selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SPAWNING_SITE
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    List<SpawningSite> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SPAWNING_SITE
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    int updateByPrimaryKey(SpawningSite record);
}