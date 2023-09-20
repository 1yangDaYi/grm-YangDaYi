package com.imti.dao.impl;

import com.imti.dao.GoodsDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class GoodsDaoImpl implements GoodsDao {
    @Autowired
    private JdbcTemplate jt;
    @Override
    public int updateAmount(int id, int nums) {
        String sql = "UPDATE goods SET amount = amount -? WHERE id = ?";
        return jt.update(sql,nums,id);
    }
}
