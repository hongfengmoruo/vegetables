package com.system.vegetables.mapper;

import com.system.vegetables.entity.PosGoodsTable;
import java.util.List;

public interface PosGoodsTableMapper {
    int insert(PosGoodsTable record);

    List<PosGoodsTable> selectAll();
}