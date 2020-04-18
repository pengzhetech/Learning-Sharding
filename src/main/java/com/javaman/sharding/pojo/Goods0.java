package com.javaman.sharding.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * goods_0
 * @author 
 */
@Data
public class Goods0 implements Serializable {
    private Long goodsId;

    private String goodsName;

    private Long goodsType;

    private static final long serialVersionUID = 1L;
}