package com.javaman.sharding.mapper;

import com.javaman.sharding.pojo.Goods0;

public interface Goods0Dao {
    int deleteByPrimaryKey(Long goodsId);

    int insert(Goods0 record);

    int insertSelective(Goods0 record);

    Goods0 selectByPrimaryKey(Long goodsId);

    int updateByPrimaryKeySelective(Goods0 record);

    int updateByPrimaryKey(Goods0 record);
}