package com.hongjun.chapter04web.pojo;

import java.io.Serializable;

/**
 * @author hongjun500
 * @date 2020/5/31 19:43
 * Created with 2019.3.2.IntelliJ IDEA
 * Description:
 */
public class User implements Serializable {
    private String name;
    private Integer age;



    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
