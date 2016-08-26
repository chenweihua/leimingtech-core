package com.leimingtech.core.entity;

import java.math.BigDecimal;

import lombok.Data;
import lombok.ToString;

/**
 * 
 * @author ihui
 * 支付公用参数
 */
@Data
@ToString
public class PayCommon {
  /**
   * 支付订单号
   */
  private String outTradeNo;
  /**
   * 服务器异步通知页面路径
   */
  private String notifyUrl;
  /**
   * 服务器同步通知页面路径
   */
  private String returnUrl;
  /**
	* 支付金额
	*/
  private BigDecimal payAmount;

  
  
}
