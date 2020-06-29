package com.hongjun.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import sun.dc.pr.PRError;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author hongjun500
 * @date 2020/6/8 21:48
 * Created with 2019.3.2.IntelliJ IDEA
 * Description:
 */
@Entity
@Table(name = "t_user")
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "last_name")
    private String  lastName;

    private Boolean gender;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
}
