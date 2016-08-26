package com.leimingtech.core.entity.vo;

import java.util.List;

import lombok.Data;

import com.leimingtech.core.entity.base.Cart;

/**
 * 购物车按店铺id和商品所在一级分类id分组
 * @author liukai
 */
@Data
public class CartCouponVo {
	
	private List<Cart> cartList;
	
	/**
     * 商品所在一级分类id(购物车商品按storeId和一级分类id分组时使用,优惠券查询时)
     */
    private Integer firstGcId;
    
    /**
     * 店铺id
     */
    private Integer storeId;
    
    /**
     * 该分组下的商品总价格
     */
    private double goodsTotalPrice;
}
