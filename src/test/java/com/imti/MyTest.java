package com.imti;

import com.imti.config.SpringConfig;

import com.imti.controller.GoodsController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig(classes = SpringConfig.class)
public class MyTest {
@Autowired
    private GoodsController bc;

@Test
public void test1(){
    bc.saleGoods(2,3);
}

}
