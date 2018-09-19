package com.rdc.kingsa.input.persistence.dao;

import com.rdc.kingsa.input.persistence.beans.SpawningSiteAndFish;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SpawningSiteAndFishMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SPAWNING_SITE_AND_FISH
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    int deleteByPrimaryKey(@Param("id") String id, @Param("spawningId") String spawningId, @Param("fishId") String fishId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SPAWNING_SITE_AND_FISH
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    int insert(SpawningSiteAndFish record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SPAWNING_SITE_AND_FISH
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    SpawningSiteAndFish selectByPrimaryKey(@Param("id") String id, @Param("spawningId") String spawningId, @Param("fishId") String fishId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SPAWNING_SITE_AND_FISH
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    List<SpawningSiteAndFish> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SPAWNING_SITE_AND_FISH
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    int updateByPrimaryKey(SpawningSiteAndFish record);
}