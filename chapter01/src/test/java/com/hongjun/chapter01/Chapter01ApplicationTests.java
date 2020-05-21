package com.hongjun.chapter01;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Chapter01ApplicationTests {
    @Value("${number1}")
    private String number1;

    @Value("${number2}")
    private Integer number2;
    @Value("${number}")
    private String number;
    @Test
    void contextLoads() {
        System.out.println(number);
        System.out.println(number1);
        System.out.println(number2);
    }

}
