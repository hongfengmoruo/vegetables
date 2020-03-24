package com.system.vegetables.mapper;

import com.system.vegetables.entity.GoodsType;
import java.util.List;

public interface GoodsTypeMapper {
    int deleteByPrimaryKey(Integer goodsTypeId);

    int insert(GoodsType record);

    GoodsType selectByPrimaryKey(Integer goodsTypeId);

    List<GoodsType> selectAll();

    int updateByPrimaryKey(GoodsType record);
}