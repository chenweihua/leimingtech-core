package com.leimingtech.core.entity;

import java.io.Serializable;
import java.util.List;

import lombok.Data;
import lombok.ToString;

import com.leimingtech.core.entity.base.TypeBrand;
import com.leimingtech.core.entity.base.TypeSpec;

/**
 * Created by ss on 2014/10/15.
 */
@Data
@ToString
public class GoodsType implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 5529721245302844483L;

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
    
    /**
     * 父级id
     */
    private Integer parentId;
    /**
     * 层级id
     */
    private String idPath;
    /**
     * 费用比例
     */
    private Float expenScale;
    /**
     * 子节点树龄
     */
    private int hasChild;
    
    private int deep;

    private List<GoodsType> typeList;
    /**
     * 商品属性List
     */
    private List<GoodsAttribute> attributes;
    
    /**
     * 商品品牌List
     */
    private List<TypeBrand> tbs;
    
    /**
     * 商品规格List
     */
    private List<TypeSpec> tsList;

    
}
