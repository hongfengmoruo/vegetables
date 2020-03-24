package com.system.vegetables.service;

import com.system.vegetables.entity.Orders;
import com.system.vegetables.mapper.OrdersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    public OrdersMapper ordersMapper;

    public List<Orders> selectAll(){
        return this.ordersMapper.selectAll();
    }
}
