package com.rdc.kingsa.input.persistence.beans;

public class ApprovalDetail {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column APPROVAL_DETAIL.ID
     *
     * @mbggenerated Sat Sep 22 20:23:37 CST 2018
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column APPROVAL_DETAIL.APPROVAL_ID
     *
     * @mbggenerated Sat Sep 22 20:23:37 CST 2018
     */
    private String approvalId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column APPROVAL_DETAIL.APPROVAL_CONTENT
     *
     * @mbggenerated Sat Sep 22 20:23:37 CST 2018
     */
    private String approvalContent;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column APPROVAL_DETAIL.SN
     *
     * @mbggenerated Sat Sep 22 20:23:37 CST 2018
     */
    private Short sn;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column APPROVAL_DETAIL.APPROVAL_USER
     *
     * @mbggenerated Sat Sep 22 20:23:37 CST 2018
     */
    private String approvalUser;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column APPROVAL_DETAIL.ID
     *
     * @return the value of APPROVAL_DETAIL.ID
     *
     * @mbggenerated Sat Sep 22 20:23:37 CST 2018
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column APPROVAL_DETAIL.ID
     *
     * @param id the value for APPROVAL_DETAIL.ID
     *
     * @mbggenerated Sat Sep 22 20:23:37 CST 2018
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column APPROVAL_DETAIL.APPROVAL_ID
     *
     * @return the value of APPROVAL_DETAIL.APPROVAL_ID
     *
     * @mbggenerated Sat Sep 22 20:23:37 CST 2018
     */
    public String getApprovalId() {
        return approvalId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column APPROVAL_DETAIL.APPROVAL_ID
     *
     * @param approvalId the value for APPROVAL_DETAIL.APPROVAL_ID
     *
     * @mbggenerated Sat Sep 22 20:23:37 CST 2018
     */
    public void setApprovalId(String approvalId) {
        this.approvalId = approvalId == null ? null : approvalId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column APPROVAL_DETAIL.APPROVAL_CONTENT
     *
     * @return the value of APPROVAL_DETAIL.APPROVAL_CONTENT
     *
     * @mbggenerated Sat Sep 22 20:23:37 CST 2018
     */
    public String getApprovalContent() {
        return approvalContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column APPROVAL_DETAIL.APPROVAL_CONTENT
     *
     * @param approvalContent the value for APPROVAL_DETAIL.APPROVAL_CONTENT
     *
     * @mbggenerated Sat Sep 22 20:23:37 CST 2018
     */
    public void setApprovalContent(String approvalContent) {
        this.approvalContent = approvalContent == null ? null : approvalContent.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column APPROVAL_DETAIL.SN
     *
     * @return the value of APPROVAL_DETAIL.SN
     *
     * @mbggenerated Sat Sep 22 20:23:37 CST 2018
     */
    public Short getSn() {
        return sn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column APPROVAL_DETAIL.SN
     *
     * @param sn the value for APPROVAL_DETAIL.SN
     *
     * @mbggenerated Sat Sep 22 20:23:37 CST 2018
     */
    public void setSn(Short sn) {
        this.sn = sn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column APPROVAL_DETAIL.APPROVAL_USER
     *
     * @return the value of APPROVAL_DETAIL.APPROVAL_USER
     *
     * @mbggenerated Sat Sep 22 20:23:37 CST 2018
     */
    public String getApprovalUser() {
        return approvalUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column APPROVAL_DETAIL.APPROVAL_USER
     *
     * @param approvalUser the value for APPROVAL_DETAIL.APPROVAL_USER
     *
     * @mbggenerated Sat Sep 22 20:23:37 CST 2018
     */
    public void setApprovalUser(String approvalUser) {
        this.approvalUser = approvalUser == null ? null : approvalUser.trim();
    }
}