package com.mall.product.bean;

import java.io.Serializable;
import java.util.List;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

/**
 * pms_category
 * @author 
 */
@Data
public class PmsCategory implements Serializable {
    /**
     * 分类id
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 分类名称
     */
    private String name;

    /**
     * 父分类id
     */
    private Long parentId;
//
//    /**
//     * 层级
//     */
//    private Integer catLevel;

    /**
     * 是否显示[0-不显示，1显示]
     */
    private Byte status;

    /**
     * 排序
     */
    private Integer sort;

    /**
     * 图标地址
     */
    private String icon;

    /**
     * 计量单位
     */
    private String unit;

//    /**
//     * 商品数量
//     */
//    private Integer productCount;

    @TableField(exist = false)
    private List<PmsCategory> child;

    private static final long serialVersionUID = 1L;
}