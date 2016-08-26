package com.leimingtech.core.entity.base;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.ToString;

import org.hibernate.validator.constraints.Length;

/**
 * 满就送活动规则Entity
 *
 * @author linmj
 * @version 2015-11-19
 */
@Data
@ToString
public class ShopPMansongRule extends BaseEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private Integer ruleId;		// 规则编号
	private Integer mansongId;		// 活动编号
	private Integer level;		// 规则级别(1/2/3)
	private BigDecimal price;		// 级别价格
	private Integer shippingFree;		// 免邮标志(0-不免邮/1-免邮费)
	private BigDecimal discount;		// 减现金优惠金额
	private String giftName;		// 礼品名称
	private String giftLink;		// 礼品链接

	@NotNull(message="活动编号不能为空")
	public Integer getMansongId() {
		return mansongId;
	}
	

	@Length(min=1, max=1, message="规则级别(1/2/3)长度必须介于 1 和 1 之间")
	public Integer getLevel() {
		return level;
	}
	

	@NotNull(message="级别价格不能为空")
	public BigDecimal getPrice() {
		return price;
	}
	

	@Length(min=1, max=1, message="免邮标志(0-不免邮/1-免邮费)长度必须介于 1 和 1 之间")
	public Integer getShippingFree() {
		return shippingFree;
	}
	

	@NotNull(message="减现金优惠金额不能为空")
	public BigDecimal getDiscount() {
		return discount;
	}
	

	@Length(min=1, max=50, message="礼品名称长度必须介于 1 和 50 之间")
	public String getGiftName() {
		return giftName;
	}
	

	@Length(min=1, max=100, message="礼品链接长度必须介于 1 和 100 之间")
	public String getGiftLink() {
		return giftLink;
	}
	

}