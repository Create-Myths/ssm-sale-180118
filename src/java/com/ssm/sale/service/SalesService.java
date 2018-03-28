package com.ssm.sale.service;

import com.ssm.sale.pojo.Sales;

import java.util.List;

public interface SalesService {
    void addSales(String name);

    List<Sales> getSalesList();
}
