package com.leimingtech.core.entity.base;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.ToString;

import org.hibernate.validator.constraints.Length;

/**
 * 满就送套餐申请Entity
 *
 * @author linjm
 * @version 2015-11-19
 */
@Data
@ToString
public class ShopPMansongApply extends BaseEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private Integer applyId;		// 申请编号
	private Integer memberId;		// 用户编号
	private String memberName;		// 用户名
	private Integer storeId;		// 店铺编号
	private String storeName;		// 店铺名称
	private Integer applyQuantity;		// 申请数量
	private Integer applyDate;		// 申请时间
	private Integer state;		// 状态(1-新申请/2-审核通过/3-已取消/4-审核失败)

	@NotNull(message="用户编号不能为空")
	public Integer getMemberId() {
		return memberId;
	}
	

	@Length(min=1, max=50, message="用户名长度必须介于 1 和 50 之间")
	public String getMemberName() {
		return memberName;
	}
	

	@NotNull(message="店铺编号不能为空")
	public Integer getStoreId() {
		return storeId;
	}
	

	@Length(min=1, max=50, message="店铺名称长度必须介于 1 和 50 之间")
	public String getStoreName() {
		return storeName;
	}
	

	@NotNull(message="申请数量不能为空")
	public Integer getApplyQuantity() {
		return applyQuantity;
	}
	

	@NotNull(message="申请时间不能为空")
	public Integer getApplyDate() {
		return applyDate;
	}
	

	@NotNull(message="状态(1-新申请/2-审核通过/3-已取消/4-审核失败)不能为空")
	public Integer getState() {
		return state;
	}
	

}