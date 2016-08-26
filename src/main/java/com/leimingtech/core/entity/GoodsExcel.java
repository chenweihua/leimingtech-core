package com.leimingtech.core.entity;

import java.math.BigDecimal;

import com.leimingtech.core.entity.base.BaseEntity;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class GoodsExcel extends BaseEntity{
	/**
	 * 商品ID
	 */
	private Integer goodsId;
	/**
	 * 商品名称
	 */
	private String goodsName;
	/**
	 * 商品分类id
	 */
	private Integer gcId;
	/**
	  * 商品类型,1为全新、2为二手
	  */
	private Integer goodsForm; 
	/**
	 * 商品副标题
	 */
	private String goodsSubtitle;	
	 /**
	  * 商品店铺价格
	  */
    private BigDecimal goodsStorePrice;
    /**
	  * 商品的库存,在存数据库的时候不用这个字段,只在取的时候用到
	  */
	//private Integer goodsTotalStorage;
	 /**
	  * 商品货号
	  */
    private String goodsSerial;
     
     /**
	  * 商品推荐 是:1 否:0
	  * 
	  */
	 private Integer goodsCommend;
	
	 /**
	  * 商品关键字
	  */
	 private String goodsKeywords;
	 
	 /**
	  * 商品描述 
	  */
	 private String goodsDescription;
	 /**
	  * 商品上架1下架0
	  */
	 private Integer goodsShow;
	 
}
