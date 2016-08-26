package com.leimingtech.core.entity.base;

import lombok.Data;

/**
 * 退货日志表
 * @author liukai
 */
@Data
public class ReturnLog extends BaseEntity{
	
	//退货日志表id
	private Integer id;
	
	//退货表id
	private Integer returnId;
	
	//退货状态信息
	private String returnState;
	
	//下一步退货状态信息
	private String changeState;
	
	//退货状态描述
	private String stateInfo;
	
	//操作人
	private String operator;
}
