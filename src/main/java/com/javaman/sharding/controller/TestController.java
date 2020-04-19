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

/**
 * @author pengzhe
 * @date 2020/4/18 12:21
 * @description
 */
@RestController
public class TestController {

    @Autowired
    private GoodsDao goods0Dao;

    @GetMapping("/test")
    public String test() {
        return "OK";
    }

    @GetMapping("/my")
    public Goods test0() {
        return goods0Dao.selectByPrimaryKey(1L);
    }

    @GetMapping("/all")
    public List<Goods> selectAll() {
        return goods0Dao.selectAll();
    }

    @GetMapping("/between")
    public List<Goods> selectBetween() {
        Map<String, Long> param = new HashMap<>();
        param.put("begin", 10L);
        param.put("end", 20L);
        return goods0Dao.selectBetween(param);
    }

    @GetMapping("/in")
    public List<Goods> selectIn() {
        List<Long> param = new ArrayList<>();
        param.add(10L);
        param.add(11L);
        param.add(12L);
        param.add(13L);
        param.add(30L);
        return goods0Dao.selectIn(param);
    }

}

