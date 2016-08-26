package com.leimingtech.core.entity.vo;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.leimingtech.core.common.DateUtils;

import lombok.Data;
import lombok.ToString;

/**
 * 结算管理总账单vo
 * @author liukai
 */
@Data
public class BillVo {
	
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
	 * 店铺ID
	 */
	private Integer storeId;
	
	/**
	 * 店铺名
	 */
	private String storeName;
	
	/**
	 * 开始日期
	 */
	private Long obStartTime;
	
	/**
	 * 结束日期
	 */
	private Long obEndTime;
	
	/**
	 * 结算状态:10默认20店家已确认30平台已审核40结算完成(仅供查询传值使用)
	 */
	private Integer obState;
	
	/**
	 * 开始日期-页面字段
	 */
	private Timestamp obStartTimeStr;
	
	/**
	 * 结束日期-页面字段
	 */
	private Timestamp obEndTimeStr;
	
	public void setObStartTime(Long obStartTime) {
		this.obStartTime = obStartTime;
		if (null != obStartTime) {
			obStartTimeStr = DateUtils.getTimestampByLong(obStartTime);
		}
	}
	
	public void setObEndTime(Long obEndTime) {
		this.obEndTime = obEndTime;
		if (null != obEndTime) {
			obEndTimeStr = DateUtils.getTimestampByLong(obEndTime);
		}
	}
}
