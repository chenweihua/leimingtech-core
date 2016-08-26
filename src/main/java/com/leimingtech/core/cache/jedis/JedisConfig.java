/**
 * 
 */
package com.leimingtech.core.cache.jedis;

import com.leimingtech.core.common.PropertiesLoader;
import com.leimingtech.core.common.StringUtils;

/**
 * <p>Title: JedisStatus.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014-2018</p>
 * <p>Company: leimingtech.com</p>
 * @author linjm
 * @date 2015年10月13日
 * @version 1.0
 */
public class JedisConfig {
	
	private static PropertiesLoader propertiesLoader = new PropertiesLoader("conf/redis.properties");
	
	//服务开启状态
	public static boolean JEDIS_STATUS;
	/**
	 * 所有缓存统一默认10分钟 
	 * 需要设置其它时间请自行修改
	 */
	public static int JEDIS_EXPIRE = 600;
	
	 //redis键示例: dic:xx:xxx
	/**
	 * 字典前缀
	 */
	public static String DIC_PREFIX = "dic:";
	
	/**
	 * 广告前缀
	 */
	public static String ADV_PREFIX = "adv:";
	
	/**
	 * 分类前缀
	 */
	public static String GCLZ_PREFIX = "gclz:";
	
	/**
	 * 分类前缀
	 */
	public static String AREAS_PREFIX = "areas:";
	
	/**
	 * 其它前缀
	 */
	public static String OTHER_PREFIX = "other:";

	//####是否开启Redis服务应用
	//redis.unlock=false
	static {
		String redis_unlock = propertiesLoader.getProperty("redis.unlock");
		JEDIS_STATUS = StringUtils.isEmpty(redis_unlock) ? false : Boolean.parseBoolean(redis_unlock);
		JEDIS_EXPIRE = Integer.valueOf(propertiesLoader.getProperty("redis.expire"));
	}
	
}
