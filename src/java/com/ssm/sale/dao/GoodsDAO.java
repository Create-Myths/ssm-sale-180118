package com.ssm.sale.dao;

import com.ssm.sale.pojo.Goods;

import java.util.List;

public interface GoodsDAO {
    void addGoods(String name);

    List<Goods> getGoodsList();
}
