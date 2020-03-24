package com.system.vegetables.mapper;

import com.system.vegetables.entity.Roles;
import java.util.List;

public interface RolesMapper {
    int deleteByPrimaryKey(Integer roleId);

    int insert(Roles record);

    Roles selectByPrimaryKey(Integer roleId);

    List<Roles> selectAll();

    int updateByPrimaryKey(Roles record);
}