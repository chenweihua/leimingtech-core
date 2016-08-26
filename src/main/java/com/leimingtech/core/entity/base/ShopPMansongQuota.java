package com.leimingtech.core.entity.base;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.ToString;

import org.hibernate.validator.constraints.Length;

/**
 * 满就送套餐表Entity
 *
 * @author linm
 * @version 2015-11-19
 */
@Data
@ToString
public class ShopPMansongQuota extends BaseEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private Integer quotaId;		// 满就送套餐编号
	private Integer applyId;		// 申请编号
	private Integer memberId;		// 用户编号
	private Integer storeId;		// 店铺编号
	private String memberName;		// 用户名
	private String storeName;		// 店铺名称
	private Integer state;		// 配额状态(1-可用/2-取消/3-结束)

	@NotNull(message="申请编号不能为空")
	public Integer getApplyId() {
		return applyId;
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
	

	@Length(min=1, max=1, message="配额状态(1-可用/2-取消/3-结束)长度必须介于 1 和 1 之间")
	public Integer getState() {
		return state;
	}
	

}