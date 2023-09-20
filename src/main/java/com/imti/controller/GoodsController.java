package com.imti.controller;

import com.imti.service.GoodsDaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class GoodsController {
    @Autowired
    private GoodsDaoService gd;
    public int saleGoods(int gid,int nums){
        int i = gd.saleGoodsService(gid, nums);
        return 0;
    }
}
