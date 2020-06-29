package com.hongjun.controller;

import com.hongjun.mapper.UserMapper;
import com.hongjun.pojo.User;
import com.hongjun.service.UserServiceImpl;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author hongjun500
 * @date 2020/6/9 21:24
 * Created with 2019.3.2.IntelliJ IDEA
 * Description:
 */
@RestController
public class UserController {

    @Autowired
    JdbcTemplate jdbcTemplate;
    @Autowired
    private UserServiceImpl userService;
    @Autowired
    UserMapper userMapper;

    @GetMapping(value = "/getUser/{id}")
    public User getUser(@PathVariable(value = "id") Integer id){
        User user = userService.getUser(id);
        return user;
    }

    @GetMapping(value = "/findUser")
    public List<User> findUser(){
        List<User> user = userMapper.findUser();
        return user;
    }
    @GetMapping(value = "/saveUser")
    public Integer saveUser(String lastName, Boolean gender){
        int i = userMapper.saveUser(lastName, gender);
        return i;
    }

}
