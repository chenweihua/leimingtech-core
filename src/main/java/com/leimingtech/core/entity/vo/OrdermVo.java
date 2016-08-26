package com.leimingtech.core.entity.vo;

import lombok.Data;
import lombok.ToString;

import com.leimingtech.core.entity.Order;

/**
 * 包含买家用户名的
 * @authorgyh
 */
@Data
@ToString
public class OrdermVo extends Order{
   /**
    * 用户名
    */
   private String membername;
}
