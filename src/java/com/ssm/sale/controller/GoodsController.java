package com.ssm.sale.controller;

import com.ssm.sale.pojo.Goods;
import com.ssm.sale.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class GoodsController {
    @Autowired
    private GoodsService goodsService;

    @RequestMapping("/add_goods.html")
    public String addGoods(String name){
        goodsService.addGoods(name);
        return "redirect:/list_goods.html";
    }

    @RequestMapping("/list_goods.html")
    public ModelAndView list(){
        List<Goods> goodsList = goodsService.getGoodsList();
        return new ModelAndView("goods_list","goodsList",goodsList);
    }

}
