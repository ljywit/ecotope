package com.rdc.kingsa.model.entity.doc;

public class DocTag {
    private String id;

    private String tagName;

    private String tagPinyin;

    private String tagPy;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName == null ? null : tagName.trim();
    }

    public String getTagPinyin() {
        return tagPinyin;
    }

    public void setTagPinyin(String tagPinyin) {
        this.tagPinyin = tagPinyin == null ? null : tagPinyin.trim();
    }

    public String getTagPy() {
        return tagPy;
    }

    public void setTagPy(String tagPy) {
        this.tagPy = tagPy == null ? null : tagPy.trim();
    }
}