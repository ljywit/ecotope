package com.rdc.kingsa.input.persistence.beans;

import java.util.Date;

public class DocFolder {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DOC_FOLDER.ID
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DOC_FOLDER.FOLDER_NAME
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    private String folderName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DOC_FOLDER.PARENT_ID
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    private String parentId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DOC_FOLDER.CREATE_TIME
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DOC_FOLDER.CREATOR_ID
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    private String creatorId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DOC_FOLDER.REMARKS
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    private String remarks;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DOC_FOLDER.CREATOR_DEPT_ID
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    private String creatorDeptId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DOC_FOLDER.CREATOR_NAME
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    private String creatorName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column DOC_FOLDER.CREATOR_DEPT_NAME
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    private String creatorDeptName;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DOC_FOLDER.ID
     *
     * @return the value of DOC_FOLDER.ID
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DOC_FOLDER.ID
     *
     * @param id the value for DOC_FOLDER.ID
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DOC_FOLDER.FOLDER_NAME
     *
     * @return the value of DOC_FOLDER.FOLDER_NAME
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public String getFolderName() {
        return folderName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DOC_FOLDER.FOLDER_NAME
     *
     * @param folderName the value for DOC_FOLDER.FOLDER_NAME
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public void setFolderName(String folderName) {
        this.folderName = folderName == null ? null : folderName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DOC_FOLDER.PARENT_ID
     *
     * @return the value of DOC_FOLDER.PARENT_ID
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public String getParentId() {
        return parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DOC_FOLDER.PARENT_ID
     *
     * @param parentId the value for DOC_FOLDER.PARENT_ID
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public void setParentId(String parentId) {
        this.parentId = parentId == null ? null : parentId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DOC_FOLDER.CREATE_TIME
     *
     * @return the value of DOC_FOLDER.CREATE_TIME
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DOC_FOLDER.CREATE_TIME
     *
     * @param createTime the value for DOC_FOLDER.CREATE_TIME
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DOC_FOLDER.CREATOR_ID
     *
     * @return the value of DOC_FOLDER.CREATOR_ID
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public String getCreatorId() {
        return creatorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DOC_FOLDER.CREATOR_ID
     *
     * @param creatorId the value for DOC_FOLDER.CREATOR_ID
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId == null ? null : creatorId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DOC_FOLDER.REMARKS
     *
     * @return the value of DOC_FOLDER.REMARKS
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DOC_FOLDER.REMARKS
     *
     * @param remarks the value for DOC_FOLDER.REMARKS
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DOC_FOLDER.CREATOR_DEPT_ID
     *
     * @return the value of DOC_FOLDER.CREATOR_DEPT_ID
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public String getCreatorDeptId() {
        return creatorDeptId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DOC_FOLDER.CREATOR_DEPT_ID
     *
     * @param creatorDeptId the value for DOC_FOLDER.CREATOR_DEPT_ID
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public void setCreatorDeptId(String creatorDeptId) {
        this.creatorDeptId = creatorDeptId == null ? null : creatorDeptId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DOC_FOLDER.CREATOR_NAME
     *
     * @return the value of DOC_FOLDER.CREATOR_NAME
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public String getCreatorName() {
        return creatorName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DOC_FOLDER.CREATOR_NAME
     *
     * @param creatorName the value for DOC_FOLDER.CREATOR_NAME
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName == null ? null : creatorName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column DOC_FOLDER.CREATOR_DEPT_NAME
     *
     * @return the value of DOC_FOLDER.CREATOR_DEPT_NAME
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public String getCreatorDeptName() {
        return creatorDeptName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column DOC_FOLDER.CREATOR_DEPT_NAME
     *
     * @param creatorDeptName the value for DOC_FOLDER.CREATOR_DEPT_NAME
     *
     * @mbggenerated Wed Sep 19 22:37:10 CST 2018
     */
    public void setCreatorDeptName(String creatorDeptName) {
        this.creatorDeptName = creatorDeptName == null ? null : creatorDeptName.trim();
    }
}