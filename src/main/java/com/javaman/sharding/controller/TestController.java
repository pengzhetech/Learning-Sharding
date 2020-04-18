package com.javaman.sharding.controller;

import com.javaman.sharding.mapper.Goods0Dao;
import com.javaman.sharding.pojo.Goods0;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author pengzhe
 * @date 2020/4/18 12:21
 * @description
 */
@RestController
public class TestController {

    @Autowired
    private Goods0Dao goods0Dao;

    @GetMapping("/test")
    public String test() {
        return "OK";
    }

    @GetMapping("/my")
    public Goods0 test0() {
        return goods0Dao.selectByPrimaryKey(1L);
    }

}

