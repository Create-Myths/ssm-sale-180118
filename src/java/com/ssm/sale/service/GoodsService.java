package com.ssm.sale.service;

import com.ssm.sale.pojo.Goods;

import java.util.List;

public interface GoodsService {
    void addGoods(String name);

    List<Goods> getGoodsList();
}
