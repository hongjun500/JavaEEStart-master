package com.hongjun.chapter04web.controller;

import com.hongjun.chapter04web.pojo.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcProperties;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author hongjun500
 * @date 2020/5/30 18:28
 * Created with 2019.3.2.IntelliJ IDEA
 * Description:
 */
@Controller
public class HelloController {

    Logger logger = LoggerFactory.getLogger(getClass());

    private String name = "你好";
    private Boolean gender = true;
    private String address = "仙域";
    private Integer age = 22;

    /*@RequestMapping(value = {"/", "/login"})
    public String index(){
        return "login";
    }*/

    @RequestMapping(value = "/hello")
    @ResponseBody
    public String hello(){
        return "hello word!";
    }

    @GetMapping(value = "/success")
    public String success(Model model, Map<String, Object> map){

        User user = new User("li", 21);
        User user1 = new User("li", 21);

        List<Object> list = new ArrayList<>();
        list.add(name);
        list.add(gender);
        list.add(age);
        list.add(address);
        map.put("map","mapName:李青");
        model.addAttribute("user",name);
        model.addAttribute("list", list);
        HelloController helloController = new HelloController();
        map.put("helloObject", helloController);
        return "success";
    }

    @RequestMapping(value = "/testThHref")
    public ModelAndView testThHref(Model model){
        String textName = "testHref作用的展示页面!!!";
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("testThHref");
        model.addAttribute("test", textName);
        return modelAndView;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
