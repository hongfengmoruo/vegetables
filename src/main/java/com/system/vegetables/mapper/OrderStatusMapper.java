package com.system.vegetables.mapper;

import com.system.vegetables.entity.OrderStatus;
import java.util.List;

public interface OrderStatusMapper {
    int deleteByPrimaryKey(Integer orderStatusId);

    int insert(OrderStatus record);

    OrderStatus selectByPrimaryKey(Integer orderStatusId);

    List<OrderStatus> selectAll();

    int updateByPrimaryKey(OrderStatus record);
}