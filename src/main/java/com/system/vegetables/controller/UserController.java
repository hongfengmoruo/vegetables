package com.system.vegetables.controller;


import com.system.vegetables.entity.Users;
import com.system.vegetables.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    public UserService userService;

    @RequestMapping("/getAll")
    public List<Users> selectAll(){
        return this.userService.selectAll();
    }
}
