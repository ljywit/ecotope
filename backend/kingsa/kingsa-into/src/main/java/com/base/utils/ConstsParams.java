package com.base.utils;

import java.io.File;

public class ConstsParams {
	// 默认分隔符
	public static final String DEFAULT_SPLIT = ",";

	// 敏感词在配置文件中的key
	public static final String SENSITIVE_KEY = "sensitiveWords";

	public static final int CLICK_SHOW_NUM = 10;

	public static final int DEFAULT_SHOW_LENGTH = 1000;
	public static final String UID2UID_SPLIT = ",";
	/**
	 * 模板类型中父节点和子节点见分隔符
	 */
	public static final String TEMPLATE_8TO2 = "-";
	public static final String UID2POSTID_PREFIX = "|";
	public static final String UID2PMID_SPLIT = "\\|";
	public static final String UID2PMID_PREFIX = "|";
	public static final String UID2UID_PREFIX = ",";
	public static final String UID2FOCUSEUID_PREFIX = ",";
	public static final int UID2POSTID_LENGTH = 200;

	public static final int RESULT_CODE_SUC = 0;

	public static final String TEMPLATE_INPUT_TYPE = "template";
	public static final String POST_INPUT_TYPE = "post";

	public static final String RANKCOUNT = "rankCount";
	public static final String COUNT = "count";
	public static final String KEYS = "keys";
	public static final String TEMPLATE = "template";
	public static final String MARK_INDEX = "markIndex";
	public static final int NOT_MINE_POST = 0;
	public static final String MINE = "item";// "mine";
	public static final String MINE_REF = "item";// "mineref";

	public static final String ITEM = "item";
	public static final String PHONE = "phone";
	public static final String PAGENUM = "pageNum";
	public static final String PAGESIZE = "pageSize";
	public static final String KEYWORD = "keyword";
	public static final String SORT = "sort";

	public static final String POSTID = "postId";
	public static final String AUTHORNAME = "authorName";
	public static final String HEADPIC = "headPic";
	public static final String ISVIP = "isVip";
	public static final String ITEMTIME = "itemTime";
	public static final String POSTPIC = "postPic";
	public static final String URL = "url";
	public static final String POST_MINPIC = "postMinPic";
	public static final String POST_SHUIYINPIC = "PostShuiyinPic";
	public static final String ITEMTYPE = "itemType";
	public static final String ITEMNAME = "itemName";
	public static final String USER_ID = "user_id";
	public static final String DES = "des";
	public static final String FLAG = "flag";
	public static final String CLICKCOUNT = "clickCount";
	public static final String READERCOUNT = "readerCount";
	public static final String MARKCOUNT = "markCount";

	public static final String RANK = "rank";
	public static final String SCORE = "score";

	public static final String CLICKS = "clicks";

	public static final String MARK = "mark";
	public static final String MARKID = "markId";
	public static final String MARKUSERID = "markUserId";
	public static final String MARKUSERNAME = "markUserName";
	public static final String TOUSERID = "toUserId";
	public static final String TOUSERNAME = "toUserName";
	public static final String MARKTIME = "markTime";
	public static final String MARKDESC = "markDesc";
	public static final String MARKPIC = "markPic";
	public static final String MARK_MINPIC = "markMinPic";
	public static final String MARK_SHUIYINPIC = "markShuiyinPic";

	public static final String BG_PIC_PATH_SIGN = "bg_pic" + File.separator;
	public static final String POST_PIC_PATH_SIGN = "post_pic" + File.separator;
	public static final String MARK_PIC_PATH_SIGN = "mark_pic" + File.separator;

	public static final String GOODS_PIC_PATH_SIGN = "goods" + File.separator;

	public static final String WEBAPPS = System
			.getProperty("pitoo.root");/* + "webapps" + File.separator; */
	public static final String PIC_SHUIYIN_FILEPATH = WEBAPPS + "pic" + File.separator + "pitoo_shuiyin.png";
	public static final String POST_PIC_PATH = WEBAPPS + "pic" + File.separator + POST_PIC_PATH_SIGN;
	public static final String MARK_PIC_PATH = WEBAPPS + "pic" + File.separator + MARK_PIC_PATH_SIGN;

	public static final String PIC_SUFFIX_JPG = ".jpg";
	public static final String PIC_SUFFIX_PNG = ".png";
	public static final String PIC_MIN_SUFFIX = "min_";
	public static final String PIC_SHUIYIN_SUFFIX = "shuiyin_";
	public static final int PIC_SHUIYIN_DEGREE = 220;
	public static final float PIC_POST_DEFAULT_QUALITY = 0.9f;
	public static final float PIC_MARK_DEFAULT_QUALITY = 0.9f;
	public static final int PIC_POST_DEFAULT_WIDTH = 180;
	public static final int PIC_MARK_DEFAULT_WIDTH = 180;
	public static final String PIC_PATH_URL_INDEX = "picPathUrlIndex";
	public static final String PIC_SPLIT = ",";

	public static final String ITEM_KEY = "itemKey";
	public static final String WEEK_TIME = "weekTime";
	public static final String FORMAT_TYPE = "formatType";

	public static final String DATE_KEY = "date_key";
	public static final String DATE_VALUE = "date_value";

	/**
	 * 查看帖子详情时，默认加载的帖子个数
	 */
	public static final int DEFAULT_PAGESIEZ = 10;

	/**
	 * 评论积分 2
	 */
	public static final int MARK_SCORE = 2;

	/**
	 * 发帖积分 1
	 */
	public static final int POST_SCORE = 1;

	/**
	 * 被赞积分 1
	 */
	public static final int CLICK_SCORE = 1;

	/**
	 * 分享积分 3
	 */
	public static final int SHARE_SCORE = 3;
}
