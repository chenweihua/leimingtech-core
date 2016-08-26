package com.leimingtech.core.entity.apibean;

import com.leimingtech.core.entity.base.GoodsDetailBean;

import lombok.Data;
import lombok.ToString;

/**
 * ShopncFavorites entity. @author MyEclipse Persistence Tools
 */
@Data
@ToString
public class FavoritesGoodsApiBean{

	private Long favTime;
    private GoodsDetailBean goods;
}