package com.hongjun;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.hongjun.mapper")
public class Chapter05MybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(Chapter05MybatisApplication.class, args);
    }

}
