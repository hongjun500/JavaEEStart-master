package com.hongjun.chapter01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author hongjun500
 * @Time 2020/3/24 19:48
 * @Created with 2019.3.1.IntelliJ IDEA
 * @Description:
 */
@RequestMapping
@Controller
public class HelloController {
    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        String json = "{\"name\":\"hongjun500\",\"age\":\"22\"}";
        return json;
    }
}
