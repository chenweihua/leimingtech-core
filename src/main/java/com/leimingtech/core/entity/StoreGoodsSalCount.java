package com.leimingtech.core.entity;

import lombok.Data;
import lombok.ToString;

/**
 * 店铺成交商品统计
 * @author gyh
 */
@Data
@ToString
public class StoreGoodsSalCount {
	/**
     * 商品名称
     */
    private String goodsName;
    /**
     * 成交数量
     */
    private Integer goodsSales;
}
