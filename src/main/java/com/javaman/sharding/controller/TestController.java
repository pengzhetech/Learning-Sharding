package com.javaman.sharding.controller;

import com.javaman.sharding.mapper.GoodsDao;
import com.javaman.sharding.pojo.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

/**
 * @author pengzhe
 * @date 2020/4/18 12:21
 * @description
 */
@RestController
public class TestController {

    @Autowired
    private GoodsDao goodsDao;

    @GetMapping("/test")
    public String test() {
        return "OK";
    }

    @GetMapping("/my")
    public Goods test0() {
        return goodsDao.selectByPrimaryKey(1L);
    }

    @GetMapping("/all")
    public List<Goods> selectAll() {
        return goodsDao.selectAll();
    }

    @GetMapping("/between")
    public List<Goods> selectBetween() {
        Map<String, Long> param = new HashMap<>();
        param.put("begin", 10L);
        param.put("end", 20L);
        return goodsDao.selectBetween(param);
    }

    @GetMapping("/in")
    public List<Goods> selectIn() {
        List<Long> param = new ArrayList<>();
        param.add(10L);
        param.add(11L);
        param.add(12L);
        param.add(13L);
        param.add(30L);
        return goodsDao.selectIn(param);
    }

    @GetMapping("/batchInsert")
    public int batchInsert() {
        List<Goods> goods = new ArrayList<>();
        IntStream.rangeClosed(1, 2).forEach(index -> {
            Goods good = new Goods();
            good.setGoodsName("goodName" + index);
            good.setGoodsType(Long.valueOf(String.valueOf(index)));
            goods.add(good);
        });
        return goodsDao.batchInsert(goods);
    }

    @GetMapping("/insert")
    public int insert() {
        Goods good = new Goods();
        good.setGoodsType(10L);
        good.setGoodsName("testInsert");
        return goodsDao.insert(good);
        // return goodsDao.insert(good);
    }
}

