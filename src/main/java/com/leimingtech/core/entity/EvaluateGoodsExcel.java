package com.leimingtech.core.entity;

import lombok.Data;
import lombok.ToString;

/**
 * @author llf
 * @Package com.leimingtech.core.entity.trade
 * @Description:
 * @date 2014/11/12 10:12
 */
@Data
@ToString
public class EvaluateGoodsExcel{
    /**
     * 商品表编号
     */
    private Integer gevalGoodsId;
    /**
     * 1-5分
     */
    private Integer gevalScore;
    /**
     * 商品名称
     */
    private String gevalGoodsName;

    /**
     * 信誉评价内容
     */
    private String gevalContent;
    /**
     * 评价人名称
     */
    private String gevalFrommembername;
    /**
     * 订单表自增ID
     */
   // private Integer gevalOrderId;
    /**
     * 订单表order_sn
     */
   // private String gevalOrderNo;
    /**
     * 0表示不是  1表示是匿名评价
     */
    private Integer gevalIsAnonymous;
    /**
     * 评价信息的状态 0为正常 1为禁止显示
     */
    private Integer  gevalState;
    /**
     * 订单商品表编号
     */
   // private Integer gevalOrderGoodsId;
    /**
     * 规格描述
     */
    private String specInfo;
    /**
     * 评论时间
     */
    private Long createTime;
    
}
