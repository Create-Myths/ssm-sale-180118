package com.ssm.sale.dao;

import com.ssm.sale.pojo.Sales;

import java.util.List;

public interface SalesDAO {
    void addSales(String name);

    List<Sales> getSalesList();
}
