package com.ssm.sale.service.impl;

import com.ssm.sale.dao.SalesDAO;
import com.ssm.sale.pojo.Sales;
import com.ssm.sale.service.SalesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalesServiceImpl implements SalesService {

    @Autowired
    private SalesDAO salesDAO;

    @Override
    public void addSales(String name) {
        salesDAO.addSales(name);
    }

    @Override
    public List<Sales> getSalesList() {
        return salesDAO.getSalesList();
    }
}
