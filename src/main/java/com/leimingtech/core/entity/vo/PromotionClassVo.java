/**
 * 
 */
package com.leimingtech.core.entity.vo;

import java.io.Serializable;
import java.util.List;

import lombok.Data;
import lombok.ToString;

import com.leimingtech.core.entity.base.Promotion;
import com.leimingtech.core.entity.base.PromotionClass;

/**
 * <p>Title: PromotionClass.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014-2018</p>
 * <p>Company: leimingtech.com</p>
 * @author linjm
 * @date 2015年7月21日
 * @version 1.0
 */
@Data
@ToString
public class PromotionClassVo extends PromotionClass implements Serializable{


	/**
	 * 
	 */
	private static final long serialVersionUID = 443138349404992304L;

	private List<Promotion> promotionList;

}
