package com.leimingtech.core.entity.base;

import lombok.Data;

/**   
 * @Title: Entity
 * @Description: 取现表
 * @author 
 * @date wayne
 * @version V1.0   
 *
 */
@Data
public class Withdraw extends BaseEntity implements java.io.Serializable {
	private static final long serialVersionUID = -4664047188086057817L;
	/**id*/
	private Integer id;
	/**账户名*/
	private String accountName;
	/**账号*/
	private String accountNo;
	/**账号属性*/
	private String accountProp;
	/**金额*/
	private String amount;
	/**银行代码*/
	private String bankCode;
	/**状态*/
	private String status;
	/**添加人*/
	private String createdby;
	/**修改人*/
	private String updateby;
	
}
