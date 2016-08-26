package com.leimingtech.core.entity;

import lombok.Data;
import lombok.ToString;

/**
 * 
 * @author ihui
 * 订单销售量导出
 */
@Data
@ToString
public class OrderCount {
  /**
   * 时间
   */
  private String date;
  /**
   * 销量
   */
  private String num;
  /**
   * 订单价格
   */
  private String orderprice;
}
