package com.leimingtech.core.entity;



import lombok.Data;
import lombok.ToString;



/**
 * SiteSet admin系统设置的站点设置
 * 
 * @项目名称：leimingtech-entity
 * @类名称：SiteSet
 * @类描述：
 * @修改备注：
 * @version
 * 
 */
@Data
@ToString
public class SiteSet {
	//网站名称
	private String siteName;
	//网站标题
	private String siteTitle;
	//关键字
	private String siteKey;
	//描述
	private String siteDiscription;
	//网站Logo
	private String logo;
	
	

}
