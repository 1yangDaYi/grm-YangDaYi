package com.imti.service.impl;

import com.imti.dao.SaleDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SaleDaoServiceImpl implements SaleDao {
    @Autowired
    private SaleDao sd;
    @Override
    public int addSaleDao(int gid, int nums) {
        sd.addSaleDao(gid,nums);
        return 0;
    }
}
