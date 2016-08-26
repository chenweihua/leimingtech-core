package com.leimingtech.core.entity.base;

import java.math.BigDecimal;
import java.sql.Timestamp;

import lombok.Data;

import com.leimingtech.core.common.DateUtils;

/**
 * 结算表
 * @author liukai
 */
@Data
public class OrderBill extends BaseEntity{
	/**
	 * 结算单id
	 */
	private Integer obId;
	
	/**
	 * 结算单编号(年月店铺ID)
	 */
	private String obNo;
	 
	/**
	 * 开始日期
	 */
	private Long obStartTime;
	
	/**
	 * 结束日期
	 */
	private Long obEndTime;
	
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
	 * 结算状态:10默认20店家已确认30平台已审核40结算完成
	 */
	private Integer obState;
	
	/**
	 * 付款日期
	 */
	private Long obPayTime;
	
	/**
	 * 支付备注
	 */
	private String obPayContent;
	
	/**
	 * 店铺ID
	 */
	private Integer obStoreId;
	
	/**
	 * 店铺名
	 */
	private String obStoreName;
	
	/**
	 * 开始日期-页面字段
	 */
	private Timestamp obStartTimeStr;
	
	/**
	 * 结束日期-页面字段
	 */
	private Timestamp obEndTimeStr;
	
	/**
	 * 付款日期-页面字段
	 */
	private Timestamp obPayTimeStr;
	
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
	
	public void setObPayTime(Long obPayTime) {
		this.obPayTime = obPayTime;
		if (null != obPayTime) {
			obPayTimeStr = DateUtils.getTimestampByLong(obPayTime);
		}
	}
}