package com.leimingtech.core.entity.vo;

import java.math.BigDecimal;
import java.util.List;

import lombok.Data;
import lombok.ToString;

import com.google.common.collect.Lists;

/**
 * 生成订单使用的订单超类
 * @author liukai
 */
@Data
@ToString
public class OrderVo{
	
	/**
	 * 购物车集合
	 */
	private List<CartOrderVo> cartOrderVoList = Lists.newArrayList();
	
	/**
	 * 商品总数量
	 */
    private int goodsNum;
    
    /**
     * 商品总价格
     */
    private BigDecimal goodsAmount;
    
    /**
     * 订单运费
     */
    private BigDecimal shippingFee;
    
    /**
     * 商品店铺id
     */
    private Integer storeId;
    
    /**
     * 商品店铺名称
     */
    private String storeName;
    
    /**
     * 订单总价(应付金额)
     */
    private BigDecimal orderAmount;
    
    /**
     * 余额支付金额
     */
    private BigDecimal predepositAmount;
    
    /**
	 * 优惠券id
	 */
	private Integer couponId;
	
	/**
	 * 优惠券金额
	 */
	private BigDecimal couponPrice;
	
	/**
	 * 促销金额
	 */
	private BigDecimal promoPrice;
	
	/**
	 * 优惠总金额
	 */
	private BigDecimal discount;
    
    public OrderVo(){
    	predepositAmount = BigDecimal.valueOf(0.0);
    	promoPrice  = BigDecimal.valueOf(0.0);
    }
}