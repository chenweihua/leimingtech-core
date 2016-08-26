package com.leimingtech.core.state.mansong;

/**
 *  满送状态
 *  状态(1-新申请/2-审核通过/3-已取消/4-审核失败)
 * @author linjianmao
 * 
 */
public class ManSongState {
	
	/**
	 * 新申请
	 */
	public static int MS_APPLY = 1;
	/**
	 * 审核通过
	 */
	public static int MS_AGREE = 2;
	/**
	 * 已取消
	 */
	public static int MS_CANCEL = 3;
	/**
	 * 审核失败
	 */
	public static int MS_FAIL = 4;
	
}
