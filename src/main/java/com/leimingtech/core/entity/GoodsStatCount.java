package com.leimingtech.core.entity;

import lombok.Data;
import lombok.ToString;

/**
 * 
 * @author ihui
 * 店铺商品浏览统计
 */
@Data
@ToString
public class GoodsStatCount {
  /**
   * 商品名称
   */
  private String goodsName;
  /**
   * 商品浏览数
   */
  private Integer goodsStatCount;
}
