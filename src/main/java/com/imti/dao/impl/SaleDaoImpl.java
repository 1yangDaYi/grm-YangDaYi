package com.imti.dao.impl;

import com.imti.dao.SaleDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class SaleDaoImpl implements SaleDao {
    @Autowired
    private JdbcTemplate jt;
    @Override
    public int addSaleDao(int gid, int nums) {
        String sql = "INSERT INTO sale VALUES(0,?,?)";
        return jt.update(sql,gid,nums);
    }
}
