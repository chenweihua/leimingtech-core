package com.leimingtech.core.entity.vo;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

import com.leimingtech.core.entity.base.Admin;


/**
 * admin 管理员表
 *    
 * 项目名称：leimingtech-entity   
 * 类名称：Admin   
 * 类描述：   
 * 修改备注：   
 * @version    
 *
 */
@Data
@ToString
public class AdminVo extends Admin implements Serializable {
	
	private String gname;

}