package com.rdc.kingsa.input.server.controller.model.base.operate;

import com.rdc.kingsa.input.persistence.beans.CatchRecord;
import com.rdc.kingsa.input.persistence.beans.FreshRecord;
import com.rdc.kingsa.input.persistence.beans.GssMi;
import com.rdc.kingsa.input.persistence.beans.HeavyMetalMi;
import com.rdc.kingsa.input.persistence.beans.PhytoplanktonMi;
import com.rdc.kingsa.input.persistence.beans.ReproductionEcology;
import com.rdc.kingsa.input.persistence.beans.SwtMi;
import com.rdc.kingsa.input.persistence.beans.VwtMi;
import com.rdc.kingsa.input.persistence.beans.WaterQualityFc;
import com.rdc.kingsa.input.persistence.beans.ZoobenthosMi;
import com.rdc.kingsa.input.persistence.beans.ZooplanktonMi;
import io.swagger.annotations.ApiModelProperty;

/**
 * description com.rdc.kingsa com.rdc.kingsa.input.server.controller.model.base.operate
 */
public class MonitorDataBeanOt {
    @ApiModelProperty("过饱和气体监测记录")
    private GssMi gssMi;
    @ApiModelProperty("渔获记录")
    private FreshRecord freshRecord;
    @ApiModelProperty("渔获物记录-（渔获记录的一个属性）")
    private CatchRecord catchRecord;
    @ApiModelProperty("底栖动物监测信息-注释未提供")
    private ZoobenthosMi zoobenthosMi;
    @ApiModelProperty("浮游动物监测信息-注释未提供")
    private ZooplanktonMi zooplanktonMi;
    @ApiModelProperty("浮游植物监测")
    private PhytoplanktonMi phytoplanktonMi;
    @ApiModelProperty("鱼类早期资源监测-鱼类产卵场和繁殖生态-和客户确认，这一块他们还没理清楚")
    private ReproductionEcology reproductionEcology;

    @ApiModelProperty("表层水温监测信息")
    private SwtMi swtMi;
    @ApiModelProperty("垂向水温监测信息")
    private VwtMi vwtMi;
    @ApiModelProperty("底泥重金属监测信息")
    private HeavyMetalMi heavyMetalMi;
    @ApiModelProperty("水质填报信息")
    private WaterQualityFc waterQualityFc;

    /**
     * 获取 gssMi
     *
     * @return gssMi
     */
    public GssMi getGssMi() {
        return gssMi;
    }

    /**
     * 设置 gssMi
     *
     * @param gssMi gssMi
     */
    public void setGssMi(GssMi gssMi) {
        this.gssMi = gssMi;
    }

    /**
     * 获取 freshRecord
     *
     * @return freshRecord
     */
    public FreshRecord getFreshRecord() {
        return freshRecord;
    }

    /**
     * 设置 freshRecord
     *
     * @param freshRecord freshRecord
     */
    public void setFreshRecord(FreshRecord freshRecord) {
        this.freshRecord = freshRecord;
    }

    /**
     * 获取 catchRecord
     *
     * @return catchRecord
     */
    public CatchRecord getCatchRecord() {
        return catchRecord;
    }

    /**
     * 设置 catchRecord
     *
     * @param catchRecord catchRecord
     */
    public void setCatchRecord(CatchRecord catchRecord) {
        this.catchRecord = catchRecord;
    }

    /**
     * 获取 zoobenthosMi
     *
     * @return zoobenthosMi
     */
    public ZoobenthosMi getZoobenthosMi() {
        return zoobenthosMi;
    }

    /**
     * 设置 zoobenthosMi
     *
     * @param zoobenthosMi zoobenthosMi
     */
    public void setZoobenthosMi(ZoobenthosMi zoobenthosMi) {
        this.zoobenthosMi = zoobenthosMi;
    }

    /**
     * 获取 zooplanktonMi
     *
     * @return zooplanktonMi
     */
    public ZooplanktonMi getZooplanktonMi() {
        return zooplanktonMi;
    }

    /**
     * 设置 zooplanktonMi
     *
     * @param zooplanktonMi zooplanktonMi
     */
    public void setZooplanktonMi(ZooplanktonMi zooplanktonMi) {
        this.zooplanktonMi = zooplanktonMi;
    }

    /**
     * 获取 phytoplanktonMi
     *
     * @return phytoplanktonMi
     */
    public PhytoplanktonMi getPhytoplanktonMi() {
        return phytoplanktonMi;
    }

    /**
     * 设置 phytoplanktonMi
     *
     * @param phytoplanktonMi phytoplanktonMi
     */
    public void setPhytoplanktonMi(PhytoplanktonMi phytoplanktonMi) {
        this.phytoplanktonMi = phytoplanktonMi;
    }

    /**
     * 获取 reproductionEcology
     *
     * @return reproductionEcology
     */
    public ReproductionEcology getReproductionEcology() {
        return reproductionEcology;
    }

    /**
     * 设置 reproductionEcology
     *
     * @param reproductionEcology reproductionEcology
     */
    public void setReproductionEcology(ReproductionEcology reproductionEcology) {
        this.reproductionEcology = reproductionEcology;
    }

    /**
     * 获取 swtMi
     *
     * @return swtMi
     */
    public SwtMi getSwtMi() {
        return swtMi;
    }

    /**
     * 设置 swtMi
     *
     * @param swtMi swtMi
     */
    public void setSwtMi(SwtMi swtMi) {
        this.swtMi = swtMi;
    }

    /**
     * 获取 vwtMi
     *
     * @return vwtMi
     */
    public VwtMi getVwtMi() {
        return vwtMi;
    }

    /**
     * 设置 vwtMi
     *
     * @param vwtMi vwtMi
     */
    public void setVwtMi(VwtMi vwtMi) {
        this.vwtMi = vwtMi;
    }

    /**
     * 获取 heavyMetalMi
     *
     * @return heavyMetalMi
     */
    public HeavyMetalMi getHeavyMetalMi() {
        return heavyMetalMi;
    }

    /**
     * 设置 heavyMetalMi
     *
     * @param heavyMetalMi heavyMetalMi
     */
    public void setHeavyMetalMi(HeavyMetalMi heavyMetalMi) {
        this.heavyMetalMi = heavyMetalMi;
    }

    /**
     * 获取 waterQualityFc
     *
     * @return waterQualityFc
     */
    public WaterQualityFc getWaterQualityFc() {
        return waterQualityFc;
    }

    /**
     * 设置 waterQualityFc
     *
     * @param waterQualityFc waterQualityFc
     */
    public void setWaterQualityFc(WaterQualityFc waterQualityFc) {
        this.waterQualityFc = waterQualityFc;
    }
}
