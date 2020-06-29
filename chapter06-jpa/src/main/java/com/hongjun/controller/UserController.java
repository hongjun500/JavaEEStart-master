package com.hongjun.controller;

import com.hongjun.entity.User;
import com.hongjun.mapper.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hongjun500
 * @date 2020/6/8 21:59
 * Created with 2019.3.2.IntelliJ IDEA
 * Description:
 */
@RestController
public class UserController {

    @Autowired
    UserDao userDao;

    @GetMapping("/getUser/{id}")
    public User getUser(@PathVariable(value = "id") Long id){
        User one = userDao.findUserById(id);
        User one1 = userDao.getOne(id);
        return one;
    }

    @GetMapping(value = "/save")
    public User save(User user){
        User save = userDao.save(user);
        return save;
    }


    @GetMapping("/delete/{id}")
    public void delete(@PathVariable(value = "id") Long id){
        User one = userDao.getOne(id);
        userDao.delete(one);
    }
}
