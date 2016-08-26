package com.leimingtech.core.entity.vo;

import java.util.List;

import lombok.Data;

import com.leimingtech.core.entity.base.OrderDaddress;
import com.leimingtech.core.entity.base.RefundReturn;
import com.leimingtech.core.entity.base.ReturnLog;

/**
 * 退货详情超类
 * @author liukai
 */
@Data
public class ReturnDetailVo extends RefundReturn{
	
	/**
	 * 订单发货地址
	 */
	private OrderDaddress orderDaddress;
	
	/**
	 * 退货日志
	 */
	private List<ReturnLog> returnLogList;
}
