package com.system.vegetables.controller;

import com.system.vegetables.entity.Orders;
import com.system.vegetables.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {
    @Autowired
    public OrderService orderService;

    @RequestMapping("/getOrderAll")
    public List<Orders> selectAll(){
        return this.orderService.selectAll();

    }
}
