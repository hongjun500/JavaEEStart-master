package com.hongjun.chapter01.pojo;

/**
 * @author hongjun500
 * @date 2020/5/25 21:20
 * Created with 2019.3.2.IntelliJ IDEA
 * Description:
 */
public class People {
    private String name;
    private Integer age;

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
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
