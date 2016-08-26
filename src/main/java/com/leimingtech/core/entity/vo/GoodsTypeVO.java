package com.leimingtech.core.entity.vo;

import java.util.List;

import lombok.Data;
import lombok.ToString;

import com.leimingtech.core.entity.GoodsAttribute;
import com.leimingtech.core.entity.base.Brand;
import com.leimingtech.core.entity.base.Spec;

@Data
public class GoodsTypeVO {

	/**
     * 类型id
     */
    private Integer typeId;

    /**
     * 类型名称
     */
    private String typeName;

    /**
     * 类型排序
     */
    private Integer typeSort;
   /* *//**
     * 父级id
     *//*
    private Integer parentId;
    *//**
     * 层级id
     *//*
    private String idPath;
    *//**
     * 费用比例
     *//*
    private Float expenScale;*/
    
    /**
     * 商品属性List
     */
    private List<GoodsAttribute> attributes;
    
    /**
     * 商品品牌List
     */
    private List<Brand> brandList;
    
    /**
     * 商品规格List
     */
    private List<SpecVo> specList;
	
}
