package com.rdc.kingsa.input.persistence.dao;

import com.rdc.kingsa.input.persistence.beans.RareEndemicFish;
import java.util.List;

public interface RareEndemicFishMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RARE_ENDEMIC_FISH
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RARE_ENDEMIC_FISH
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    int insert(RareEndemicFish record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RARE_ENDEMIC_FISH
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    RareEndemicFish selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RARE_ENDEMIC_FISH
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    List<RareEndemicFish> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RARE_ENDEMIC_FISH
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    int updateByPrimaryKey(RareEndemicFish record);
}