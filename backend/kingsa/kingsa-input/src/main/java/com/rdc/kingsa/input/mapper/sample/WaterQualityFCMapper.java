package com.rdc.kingsa.input.mapper.sample;

import com.rdc.kingsa.model.entity.water.quality.WaterQualityFC;

import java.util.List;

public interface WaterQualityFCMapper {
    int deleteByPrimaryKey(String id);

    int insert(WaterQualityFC record);

    int insertSelective(WaterQualityFC record);

    WaterQualityFC selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(WaterQualityFC record);

    int updateByPrimaryKey(WaterQualityFC record);

    List<WaterQualityFC> selectByReportId(String reportId);
}