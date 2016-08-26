package com.leimingtech.core.entity.base;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.ToString;

import org.hibernate.validator.constraints.Length;

/**
 * 满就送Entity
 *
 * @author linjm
 * @version 2015-11-19
 */
@Data
@ToString
public class ShopPMansong extends BaseEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private Integer mansongId;		// 满送活动编号
	private String mansongName;		// 活动名称
	private Integer quotaId;		// 套餐编号
	private Integer memberId;		// 用户编号
	private Integer storeId;		// 店铺编号
	private String memberName;		// 用户名
	private String storeName;		// 店铺名称
	private Integer state;		// 活动状态(1-未发布/2-正常/3-取消/4-失效/5-结束)
	private String remark;		// 备注

	@Length(min=1, max=50, message="活动名称长度必须介于 1 和 50 之间")
	public String getMansongName() {
		return mansongName;
	}
	

	@NotNull(message="套餐编号不能为空")
	public Integer getQuotaId() {
		return quotaId;
	}
	

	@NotNull(message="用户编号不能为空")
	public Integer getMemberId() {
		return memberId;
	}
	

	@NotNull(message="店铺编号不能为空")
	public Integer getStoreId() {
		return storeId;
	}
	

	@Length(min=1, max=50, message="用户名长度必须介于 1 和 50 之间")
	public String getMemberName() {
		return memberName;
	}
	

	@Length(min=1, max=50, message="店铺名称长度必须介于 1 和 50 之间")
	public String getStoreName() {
		return storeName;
	}
	

	@Length(min=1, max=1, message="活动状态(1-未发布/2-正常/3-取消/4-失效/5-结束)长度必须介于 1 和 1 之间")
	public Integer getState() {
		return state;
	}
	

	@Length(min=1, max=200, message="备注长度必须介于 1 和 200 之间")
	public String getRemark() {
		return remark;
	}
	

}