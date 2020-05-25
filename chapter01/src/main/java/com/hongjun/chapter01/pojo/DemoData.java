package com.hongjun.chapter01.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author hongjun500
 * @date 2020/5/25 21:09
 * Created with 2019.3.2.IntelliJ IDEA
 * Description: @ConfigurationProperties将配置文件中的值于pojo进行绑定(需要添加依赖)
 */
@ConfigurationProperties(prefix = "demodata")
@Component
public class DemoData {
    private String userName;
    private Integer age;
    private Boolean gender;
    private Date birth;
    private Map<String, Object> map;
    private List<Object> list;
    private People people;

    @Override
    public String toString() {
        return "Demo{" +
                "userName='" + userName + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", birth=" + birth +
                ", map=" + map +
                ", list=" + list +
                ", people=" + people +
                '}';
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    public List<Object> getList() {
        return list;
    }

    public void setList(List<Object> list) {
        this.list = list;
    }

    public People getPeople() {
        return people;
    }

    public void setPeople(People people) {
        this.people = people;
    }

    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        // System.out.println(now.format(DateTimeFormatter.ISO_DATE));
    }
}
