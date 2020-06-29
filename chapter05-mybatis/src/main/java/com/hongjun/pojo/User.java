package com.hongjun.pojo;

/**
 * @author hongjun500
 * @date 2020/6/9 21:18
 * Created with 2019.3.2.IntelliJ IDEA
 * Description:
 */
public class User {
    private String lastName;
    private Boolean gender;
    private Integer id;


    @Override
    public String toString() {
        return "User{" +
                "lastName='" + lastName + '\'' +
                ", gender=" + gender +
                ", id=" + id +
                '}';
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
