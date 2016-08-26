package com.leimingtech.core.entity.vo;

import java.math.BigDecimal;

import lombok.Data;

/**
 * 结算打印excel超类
 * @author liukai
 */
@Data
public class OrderBillExcelVo {
	
	/**
	 * 结算单编号(年月店铺ID)
	 */
	private String obNo;
	
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
	
	/**
	 * 结算单年月份
	 */
	private Integer osMonth;
	
	/**
	 * 结算单年份
	 */
	private Integer osYear;
	
	/**
	 * 店铺ID
	 */
	private Integer obStoreId;
	
	/**
	 * 店铺名
	 */
	private String obStoreName;
}
