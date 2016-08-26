package com.leimingtech.core.entity.base;

import java.math.BigDecimal;

import lombok.Data;
import lombok.ToString;

/**
 * 退款退货
 *
 * @author liukai
 * @version 2015-11-02
 */
@Data
@ToString
public class RefundReturn extends BaseEntity{
	private Integer refundId;		// 记录ID
	private Integer orderId;		// 订单ID
	private String orderSn;		// 订单编号
	private String refundSn;		// 申请编号
	private Integer storeId;		// 店铺ID
	private String storeName;		// 店铺名称
	private Integer buyerId;		// 买家ID
	private String buyerName;		// 买家会员名
	private Integer goodsId;		// 商品ID
	private Integer orderGoodsId;		// 订单商品ID
	private String goodsName;		// 商品名称
	private Integer goodsNum;		// 商品数量
	private BigDecimal refundAmount;		// 退款金额
	private String goodsImage;		// 商品图片
	private Integer orderGoodsType;		// 订单商品类型:1默认2团购商品3限时折扣商品4组合套装
	private Integer refundType;		// 申请类型:1为退款,2为退货
	private Integer sellerState;		// 卖家处理状态:1为待审核,2为同意,3为不同意
	private Integer refundState;		// 申请状态:1为未申请,2为待管理员处理,3为已完成
	private Integer returnType;		// 退货类型:1为不用退货,2为需要退货
	private Integer orderLock;		// 订单锁定类型:1为不用锁定,2为需要锁定
	private Integer goodsState;		// 物流状态:1为待发货,2为待收货,3为未收到,4为已收货
	private Long sellerTime;		// 卖家处理时间
	private Long adminTime;		// 管理员处理时间
	private Integer reasonId;		// 原因ID:0为其它
	private String reasonInfo;		// 原因内容
	private String picInfo;		// 图片
	private String buyerMessage;		// 申请原因
	private String sellerMessage;		// 卖家备注
	private String adminMessage;		// 管理员备注
	private Integer expressId;		// 物流公司编号
	private String expressName;     //物流公司名称
	private String invoiceNo;		// 物流单号
	private Long shipTime;		// 发货时间
	private Long delayTime;		// 收货延迟时间
	private Long receiveTime;		// 收货时间
	private String receiveMessage;		// 收货备注
	private Integer commisRate;		// 佣金比例
	private String batchNo; //退款批次号
}