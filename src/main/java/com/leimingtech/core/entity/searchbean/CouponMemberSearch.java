package com.leimingtech.core.entity.searchbean;
/**
 * 会员优惠券查询条件
 * @author yangxp
 * 2015年12月4日 上午11:32:19
 */
public class CouponMemberSearch {
	//会员id
	private Integer memberId;
	//店铺id列表，逗号分隔的字符串
	private String storeIds;
	//商品分类id，逗号分隔的字符串
	private String goodsClassIds;
	//时间查询条件，用于查询已过期优惠券，可不设置
	private Long searchTime;
	
	public Integer getMemberId() {
		return memberId;
	}
	public void setMemberId(Integer memberId) {
		this.memberId = memberId;
	}
	public String getStoreIds() {
		return storeIds;
	}
	public void setStoreIds(String storeIds) {
		this.storeIds = storeIds;
	}
	public String getGoodsClassIds() {
		return goodsClassIds;
	}
	public void setGoodsClassIds(String goodsClassIds) {
		this.goodsClassIds = goodsClassIds;
	}
	public Long getSearchTime() {
		return searchTime;
	}
	public void setSearchTime(Long searchTime) {
		this.searchTime = searchTime;
	}
}
