package com.rdc.kingsa.model.dto.doc;

/**
 * Created by lxf on 18/8/8.
 */
public class DocFolderDTO {

    private String tags;

    private String folderName;

    private String parentId;

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getFolderName() {
        return folderName;
    }

    public void setFolderName(String folderName) {
        this.folderName = folderName;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }
}
