package com.leimingtech.core.entity;



import lombok.Data;
import lombok.ToString;



/**
 * ImageSet admin系统设置的图片设置
 * 
 * @项目名称：leimingtech-entity
 * @类名称：ImageSet
 * @类描述：
 * @修改备注：
 * @version
 * 
 */
@Data
@ToString
public class ImageSet {
	//商品详细页小图尺寸
	private int tiny_pic_width;
	private int tiny_pic_height;
	//缩略图尺寸
	private int thumbnail_pic_width;
	private int thumbnail_pic_height;
	//商品详细页图片尺寸
	private int small_pic_width;
	private int small_pic_height;
	//商品相册图片尺寸
	private int big_pic_width;
	private int big_pic_height;
	

}
