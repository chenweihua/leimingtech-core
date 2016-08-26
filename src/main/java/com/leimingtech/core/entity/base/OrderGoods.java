package com.leimingtech.core.entity.base;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import lombok.Data;
import lombok.ToString;

import com.leimingtech.core.common.DateUtils;
import com.leimingtech.core.entity.base.BaseEntity;

/**
 * 订单商品(订单项)
 * @author Liuk  
 */
@Data
@ToString
public class OrderGoods extends BaseEntity implements Serializable{

    private static final long serialVersionUID = -2895477428850499265L;

    /**
     * 订单商品表索引id
     */
    private Integer recId;
    
    /**
     * 订单id
     */
    private Integer orderId;
    
    /**
     * 商品id
     */
    private Integer goodsId;
    
    /**
     * 商品名称
     */
    private String goodsName;
    
    /**
     * 规格id
     */
    private Integer specId;
    
    /**
     * 规格描述
     */
    private String specInfo;
    
    /**
     * 商品价格
     */
    private BigDecimal goodsPrice;
    
    /**
     * 商品数量
     */
    private Integer goodsNum;
    
    /**
     * 商品图片
     */
    private String goodsImage;
    
    /**
     * 退货数量
     */
    private Integer goodsReturnNum;
    
    /**
     * 店铺ID
     */
    private Integer storeId;
    
    /**
     * 用户ID
     */
    private Integer buyerId;
    
    /**
     * 评价状态 0为评价，1已评价
     */
    private Integer evaluationStatus;
    
    /**
     * 评价时间
     */
    private Long evaluationTime;
    
    /**
     * 评价时间-页面字段
     */
    private Timestamp evaluationTimeStr;
    
    /**
	 * 商品实际成交价
	 */
	private BigDecimal goodsPayPrice;
	
	/**
	 * 佣金比例
	 */
	private Float commisRate;
	
	/**
	 * 商品最底级分类ID
	 */
	private Integer gcId;

	public Long getEvaluationTime() {
		return evaluationTime;
	}

	public void setEvaluationTime(Long evaluationTime) {
		this.evaluationTime = evaluationTime;
		evaluationTimeStr = DateUtils.getTimestampByLong(evaluationTime);
		this.evaluationTimeStr = evaluationTimeStr;
	}
	
	public Timestamp getEvaluationTimeStr() {
		return evaluationTimeStr;
	}

	public void setEvaluationTimeStr(Timestamp evaluationTimeStr) {
		evaluationTimeStr = DateUtils.getTimestampByLong(evaluationTime);
		this.evaluationTimeStr = evaluationTimeStr;
	}
}