package com.imti.service.impl;

import com.imti.dao.GoodsDao;
import com.imti.service.GoodsDaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class GoodsDaoServiceImpl implements GoodsDaoService {
    @Autowired
    private GoodsDao gd;
    @Autowired
    private JdbcTemplate jt;
    @Override
    @Transactional
    public int saleGoodsService(int id, int nums) {
        gd.updateAmount(nums,id);
        String sql = "INSERT INTO sale VALUES(0,?,?)";
        return jt.update(sql,id,nums);
    }
}
