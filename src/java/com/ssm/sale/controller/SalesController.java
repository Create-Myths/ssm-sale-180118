package com.ssm.sale.controller;

import com.ssm.sale.pojo.Sales;
import com.ssm.sale.service.SalesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class SalesController {
    @Autowired
    private SalesService salesService;

    @RequestMapping("/add_sales.html")
    public String addSales(String name){
        salesService.addSales(name);
        return "redirect:/list_sales.html";
    }

    @RequestMapping("/list_sales.html")
    public ModelAndView list(){
        List<Sales> salesList = salesService.getSalesList();
        return new ModelAndView("sales_list","salesList",salesList);
    }

}
