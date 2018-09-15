package com.rdc.kingsa.model.vo.atomization;

import com.rdc.kingsa.model.entity.atomization.FdaMonitorPhoto;

import java.util.List;

/**
 * Created by lxf on 18/8/2.
 */
public class AtomizationShapeResult {
    private String shapeDescription;

    List<FdaMonitorPhoto> photos;

    public String getShapeDescription() {
        return shapeDescription;
    }

    public void setShapeDescription(String shapeDescription) {
        this.shapeDescription = shapeDescription;
    }

    public List<FdaMonitorPhoto> getPhotos() {
        return photos;
    }

    public void setPhotos(List<FdaMonitorPhoto> photos) {
        this.photos = photos;
    }
}
