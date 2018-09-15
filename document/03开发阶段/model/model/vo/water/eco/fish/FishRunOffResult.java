package com.rdc.kingsa.model.vo.water.eco.fish;

/**
 * Created by lxf on 18/7/29.
 */
public class FishRunOffResult {
    String id;

    Double spawnRunoff;

    String speciesName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Double getSpawningRunoff() {
        return spawnRunoff;
    }

    public void setSpawningRunoff(Double spawningRunoff) {
        this.spawnRunoff = spawningRunoff;
    }

    public String getSpeciesName() {
        return speciesName;
    }

    public void setSpeciesName(String speciesName) {
        this.speciesName = speciesName;
    }
}
