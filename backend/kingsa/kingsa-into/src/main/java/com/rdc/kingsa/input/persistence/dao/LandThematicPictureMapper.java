package com.rdc.kingsa.input.persistence.dao;

import com.rdc.kingsa.input.persistence.beans.LandThematicPicture;
import java.util.List;

public interface LandThematicPictureMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LAND_THEMATIC_PICTURE
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LAND_THEMATIC_PICTURE
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    int insert(LandThematicPicture record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LAND_THEMATIC_PICTURE
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    LandThematicPicture selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LAND_THEMATIC_PICTURE
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    List<LandThematicPicture> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LAND_THEMATIC_PICTURE
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    int updateByPrimaryKey(LandThematicPicture record);
}