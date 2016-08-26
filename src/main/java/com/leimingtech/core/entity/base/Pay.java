package com.leimingtech.core.entity.base;

import java.math.BigDecimal;

import lombok.Data;
import lombok.ToString;

/**
 * 支付信息实体
 * @author liukai
 */
@Data
@ToString
public class Pay {
	
	/**
	 * 单号
	 */
	private String paySn;
	
	/**
	 * 支付金额
	 */
	private BigDecimal payAmount;
	
	
	/**
	 * 支付描述
	 */
	private String beWrite;
	
	/**
	 * 支付订单状态
	 */
	private Integer orderState;
	
	/**
	 * 支付状态:0:未支付,1:已支付
	 */
	private Integer payState;
}
