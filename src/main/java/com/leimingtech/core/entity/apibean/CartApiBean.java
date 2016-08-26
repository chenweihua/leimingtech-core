package com.leimingtech.core.entity.apibean;

import java.util.List;

import com.leimingtech.core.entity.base.Address;
import com.leimingtech.core.entity.vo.CartVo;

import lombok.Data;
import lombok.ToString;

/**
 * 购物车api实体
 * @author liukai
 */
@Data
@ToString
public class CartApiBean {
	
	//购物车超类集合
	private List<CartVo> cartVoList;
	
	//用户收货地址集合
	private List<Address> addressList;
	
	//优惠券数量
	private int couponCount;
	
	//用户余额
	private String  memberAvailable;
	
}
