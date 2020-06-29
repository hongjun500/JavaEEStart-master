package com.hongjun.chapter04web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @author hongjun500
 * @date 2020/6/1 19:53
 * Created with 2019.3.2.IntelliJ IDEA
 * Description:登录控制器
 */
@Controller
public class LoginController {

    @PostMapping(value = "/user/login")
    public String login(@RequestParam(value = "username") String username,
                        @RequestParam(value = "password") String password,
                        Map<String, Object>  map, HttpSession session){
        if (!StringUtils.isEmpty(username) && "123".equals(password)){
            session.setAttribute("loginUser", username);
            return "redirect:/main";
        }else {
            // 失败
            map.put("msg", "用户名或密码错误!");
            return "login";
        }
    }
}
