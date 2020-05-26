package com.hongjun.chapter01.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author hongjun500
 * @date 2020/5/26 20:44
 * Created with 2019.3.2.IntelliJ IDEA
 * Description:
 */
@Component
// 类路径下的demoData.properties配置文件
@PropertySource(value = "classpath:demoData.properties")
public class DemoDataByValue {
    @Value("${demodata.user-name}")
    private String userName;
    @Value("${demodata.age}")
    private Integer age;
    @Value("${demodata.gender}")
    private Boolean gender;
    @Value("${demodata.birth}")
    private Date birth;
    private Map<String, Object> map;
    @Value("${demodata.list}")
    private List<Object> list;
    private People people;

    @Override
    public String toString() {
        return "DemoDataByValue{" +
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
}
