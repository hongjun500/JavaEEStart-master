package com.hongjun.chapter01;

import com.hongjun.chapter01.pojo.DemoData;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
// (2.*版本不需要RunWith)
@SpringBootTest
class Chapter01ApplicationTests {

    @Autowired
    private DemoData demoData;

    @Test
    void contextLoads() {
        System.out.println(demoData);
    }

}
