package com.hongjun.chapter01;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ImportResource;

/**
 * @author hongjun500
 */
@ImportResource(value = "classpath:bean1.xml")
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class Chapter01Application {

    public static void main(String[] args) {
        SpringApplication.run(Chapter01Application.class, args);
    }

}
