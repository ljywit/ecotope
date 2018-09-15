package com.rdc.kingsa.model.vo.doc;

/**
 * Created by lxf on 18/8/8.
 */
public class DocFolderTreeVO {
    private String id;

    private String folderName;

    private String parentId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
