package com.rdc.kingsa.model.dto.doc;

/**
 * Created by lxf on 18/8/8.
 */
public class DocFileDTO {

    private String fileName;

    private String remarks;

    private String folderId;

    public String getFolderId() {
        return folderId;
    }

    public void setFolderId(String folderId) {
        this.folderId = folderId;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
