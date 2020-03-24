package com.system.vegetables.mapper;

import com.system.vegetables.entity.UserRoleTable;
import java.util.List;

public interface UserRoleTableMapper {
    int insert(UserRoleTable record);

    List<UserRoleTable> selectAll();
}