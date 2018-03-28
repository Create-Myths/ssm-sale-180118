package com.ssm.sale.service.impl;

import com.ssm.sale.dao.GoodsDAO;
import com.ssm.sale.pojo.Goods;
import com.ssm.sale.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    private GoodsDAO goodsDAO;

    @Override
    public void addGoods(String name) {
        goodsDAO.addGoods(name);
    }

    @Override
    public List<Goods> getGoodsList() {
        return goodsDAO.getGoodsList();
    }
}
