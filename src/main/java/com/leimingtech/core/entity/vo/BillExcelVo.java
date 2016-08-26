package com.leimingtech.core.entity.vo;

import java.math.BigDecimal;

import lombok.Data;

/**
 * 结算管理总账单excel超类
 * @author liukai
 */
@Data
public class BillExcelVo {

	/**
	 * 店铺名
	 */
	private String storeName;
	
	/**
	 * 订单金额
	 */
	private BigDecimal obOrderTotals;
	
	/**
	 * 运费
	 */
	private BigDecimal obShippingTotals;
	
	/**
	 * 退单金额
	 */
	private BigDecimal obOrderReturnTotals;
	
	/**
	 * 佣金金额
	 */
	private BigDecimal obCommisTotals;
	
	/**
	 * 退还佣金
	 */
	private BigDecimal obCommisReturnTotals;
	
	/**
	 * 店铺促销活动费用
	 */
	private BigDecimal obStoreCostTotals;
	
	/**
	 * 应结金额
	 */
	private BigDecimal obResultTotals;
}
