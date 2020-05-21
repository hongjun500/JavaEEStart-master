package com.hongjun.chapter01;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class Chapter01Application {

    public static void main(String[] args) {
        SpringApplication.run(Chapter01Application.class, args);
    }

}
