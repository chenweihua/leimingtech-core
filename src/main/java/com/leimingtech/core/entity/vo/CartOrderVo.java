package com.leimingtech.core.entity.vo;

import java.math.BigDecimal;

import com.leimingtech.core.entity.base.Cart;

import lombok.Data;

/**
 * 购物车订单商品转换过渡实体
 * @author liukai
 */
@Data
public class CartOrderVo extends Cart{
	
	/**
	 * 商品实际成交价
	 */
	private BigDecimal goodsPayPrice;
}
