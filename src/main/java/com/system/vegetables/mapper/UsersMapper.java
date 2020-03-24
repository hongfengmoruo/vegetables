package com.system.vegetables.mapper;

import com.system.vegetables.entity.Users;
import java.util.List;

public interface UsersMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(Users record);

    Users selectByPrimaryKey(Integer userId);

    List<Users> selectAll();

    int updateByPrimaryKey(Users record);
}