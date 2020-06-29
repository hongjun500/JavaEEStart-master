package com.hongjun.service;

import com.hongjun.mapper.UserMapper;
import com.hongjun.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

/**
 * @author hongjun500
 * @date 2020/6/9 21:22
 * Created with 2019.3.2.IntelliJ IDEA
 * Description:
 */
@Service
public class UserServiceImpl {
    @Autowired
    private UserMapper userMapper;


    public User getUser(Integer id){

        User user = userMapper.getUser(id);
        return user;
    }
}
