package com.leimingtech.core.entity.vo;

import java.util.List;

import lombok.Data;
import lombok.ToString;

import com.leimingtech.core.entity.Order;
import com.leimingtech.core.entity.base.OrderPay;

/**
 * 订单支付表,(父订单),多个订单一块支付
 * ShopOrderPay entity. @author MyEclipse Persistence Tools
 */
@Data
@ToString
public class OrderPayVo extends OrderPay{
	//订单集合
	private List<Order> orderList;

}