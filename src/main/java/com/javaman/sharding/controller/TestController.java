package com.javaman.sharding.controller;

import com.javaman.sharding.mapper.GoodsDao;
import com.javaman.sharding.pojo.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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

}

