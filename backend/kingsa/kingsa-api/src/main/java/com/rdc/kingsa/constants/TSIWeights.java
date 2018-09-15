package com.rdc.kingsa.constants;

/**
 * @ClassName:TSIWeights
 * @Description:富营养化指数权重
 * @Author:Shelly Chan
 * @CreateTime:2018年3月29日下午2:15:19
 */
public interface TSIWeights {

	/**
	 * 叶绿素a权重
	 */
	public static final double CHLA_WEIGHT = 0.266;

	/**
	 * TP权重
	 */
	public static final double TP_WEIGHT = 0.187;

	/**
	 * TN权重
	 */
	public static final double TN_WEIGHT = 0.179;

	/**
	 * 透明度权重
	 */
	public static final double SD_WEIGHT = 0.183;

	/**
	 * 高锰酸盐权重
	 */
	public static final double CODMN_WEIGHT = 0.183;

}