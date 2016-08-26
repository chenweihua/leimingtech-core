package com.leimingtech.core.common;

public class CommonConstants {
	private static PropertiesLoader propertiesLoader = new PropertiesLoader("conf/leimingtech.properties");

	/**
	 * 系统常量
	 */
    public static final String IMG_SERVER = propertiesLoader.getProperty("img.server");
    public static final String FILE_BASEPATH = propertiesLoader.getProperty("file.basepath");
    public static final String ADMIN_SERVER = propertiesLoader.getProperty("admin.server");
    public static final String FRONT_SERVER = propertiesLoader.getProperty("front.server");
    public static final String SELLER_SERVER = propertiesLoader.getProperty("seller.server");
    public static final String LUCENE_BASEPATH = propertiesLoader.getProperty("lucene.server");
    public static final String REPORT_BASEPATH = propertiesLoader.getProperty("report.basepath");
    public static final String MODEL_BASEPATH = propertiesLoader.getProperty("model.basepath");
    public static final String STATIC_PAGE_BASEPATH = propertiesLoader.getProperty("staticpage.basepath");
    public static final String COMMON_IMAGE = propertiesLoader.getProperty("commom.image"); //商品详细资料中显示公共图片
    
    /**
     * 微信登录请求参数
     */
    private static PropertiesLoader weixinPropertiesLoader = new PropertiesLoader("conf/weixinconnect.properties");
    public static final String WEIXIN_APPID = weixinPropertiesLoader.getProperty("AppID");
    public static final String WEIXIN_APPSECRET = weixinPropertiesLoader.getProperty("AppSecret");
    public static final String WEIXIN_REDIRECT_URI = weixinPropertiesLoader.getProperty("redirect_uri");
    public static final String WEIXIN_SCOPE = weixinPropertiesLoader.getProperty("scope");
    public static final String WEIXIN_RESPONSE_TYPE = weixinPropertiesLoader.getProperty("response_type");
    public static final String WEIXIN_AUTHORIZATIONCODEURL = weixinPropertiesLoader.getProperty("authorizationCodeURL");
    public static final String WEIXIN_ACCESSTOKEN = weixinPropertiesLoader.getProperty("accessToken");
    public static final String WEIXIN_REFRESHTOKEN = weixinPropertiesLoader.getProperty("refreshToken");
    public static final String WEIXIN_CHECKACCESSTOKEN = weixinPropertiesLoader.getProperty("checkAccessToken");
    public static final String WEIXIN_USERINFO = weixinPropertiesLoader.getProperty("userInfo");
}
