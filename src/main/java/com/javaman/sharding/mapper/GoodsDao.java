package com.javaman.sharding.mapper;

import com.javaman.sharding.pojo.Goods;

import java.util.List;
import java.util.Map;

public interface GoodsDao {
    int deleteByPrimaryKey(Long goodsId);

    int insert(Goods record);

    int insertSelective(Goods record);

    Goods selectByPrimaryKey(Long goodsId);

    int updateByPrimaryKeySelective(Goods record);

    int updateByPrimaryKey(Goods record);

    List<Goods> selectAll();

    List<Goods> selectBetween(Map<String, Long> param);
}