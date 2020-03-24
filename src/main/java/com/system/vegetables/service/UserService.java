package com.system.vegetables.service;


import com.system.vegetables.entity.Users;
import com.system.vegetables.mapper.UsersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    public UsersMapper usersMapper;


    public List<Users> selectAll(){
        return this.usersMapper.selectAll();
    }

}