package com.hongjun.chapter01;

import com.hongjun.chapter01.pojo.DemoData;
import com.hongjun.chapter01.pojo.DemoDataByValue;
import com.hongjun.chapter01.service.HelloServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.BeanCreationNotAllowedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.servlet.filter.ApplicationContextHeaderFilter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import javax.annotation.Resource;
import javax.security.auth.login.AppConfigurationEntry;
import javax.security.auth.login.Configuration;

// (2.*版本不需要RunWith)
@SpringBootTest
class Chapter01ApplicationTests {

    @Autowired
    private DemoData demoData;

    @Test
    void contextLoads() {
        System.out.println(demoData);
    }

    @Autowired
    private DemoDataByValue demoDataByValue;

    @Test
    void testDemoDataByValue(){
        System.out.println(demoDataByValue);
    }


    @Resource
    ApplicationContext applicationContext;

    @Test
    void testHelloBean(){
        boolean hello1 = applicationContext.containsBean("hello1");
        boolean hello = applicationContext.containsBean("hello");
        System.out.println(hello1);
        System.out.println(hello);
    }

}
