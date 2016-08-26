package com.leimingtech.core.entity.vo;


import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

import com.leimingtech.core.entity.GoodsClass;
import com.leimingtech.core.entity.base.Goods;

/**
 * @author llf
 * @Package com.leimingtech.service.module.website.vo
 * @Description:
 * @date 2014/12/16 9:47
 */
@Data
@ToString
public class FloorVo implements Serializable{

    private static final long serialVersionUID = -1642891037131737545L;

    /**
     * 楼层导航图片
     */
    private String bannerImg;
    
    /**
     * 分类id
     */
    private Integer gcId;

    /**
     * 楼层导航图片链接
     */
    private String bannerUrl;

    /**
     * 楼层名称
     */
    private String floorName;
    
    /**
     * 楼层副标题
     */
    private String subName;

    /**
     * 楼层主题图片
     */
    private String floorImg;

    /**
     * 楼层主题图片链接
     */
    private String floorUrl;
    
    /**
     * 楼层颜色
     */
    private String floorColor;

    /**
     * 分类
     */
    private List<GoodsClass> goodsClassList;

    /**
     * 商品
     */
    private List<Goods> goodsList;

    /**
     * 是否显示
     */
    private Integer isShow;

    /**
     * 排序
     */
    private Integer sort;
    /**
     * 区分PC端 手机端
     */
    private String type;
}
