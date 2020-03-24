package com.system.vegetables.mapper;

import com.system.vegetables.entity.RoleFunctionTable;
import java.util.List;

public interface RoleFunctionTableMapper {
    int deleteByPrimaryKey(Integer roleFunctionId);

    int insert(RoleFunctionTable record);

    RoleFunctionTable selectByPrimaryKey(Integer roleFunctionId);

    List<RoleFunctionTable> selectAll();

    int updateByPrimaryKey(RoleFunctionTable record);
}