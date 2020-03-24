package com.system.vegetables.mapper;

import com.system.vegetables.entity.FunctionTable;
import java.util.List;

public interface FunctionTableMapper {
    int deleteByPrimaryKey(Integer sourceId);

    int insert(FunctionTable record);

    FunctionTable selectByPrimaryKey(Integer sourceId);

    List<FunctionTable> selectAll();

    int updateByPrimaryKey(FunctionTable record);
}