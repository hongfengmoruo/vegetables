package com.system.vegetables.mapper;

import com.system.vegetables.entity.Merchants;
import java.util.List;

public interface MerchantsMapper {
    int deleteByPrimaryKey(Integer posId);

    int insert(Merchants record);

    Merchants selectByPrimaryKey(Integer posId);

    List<Merchants> selectAll();

    int updateByPrimaryKey(Merchants record);
}