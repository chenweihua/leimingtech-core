/**
 * 
 */
package com.leimingtech.core.entity.vo;

import java.util.List;

import lombok.Data;
import lombok.ToString;

import com.leimingtech.core.entity.base.Brand;

/**
 * <p>Title: BrandVo.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014-2018</p>
 * <p>Company: leimingtech.com</p>
 * @author linjm
 * @date 2015年9月15日
 * @version 1.0
 */
@Data
@ToString
public class BrandVo extends Brand{

	 private List<Brand> list;
}
