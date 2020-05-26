package com.hongjun.chapter01.config;

import com.hongjun.chapter01.service.HelloServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author hongjun500
 * @date 2020/5/26 21:36
 * Created with 2019.3.2.IntelliJ IDEA
 * Description:
 */
@Configuration
public class ConfigProperties {

    /**
     * 方法名为·bean中的id
     * @return
     */
    @Bean
    public HelloServiceImpl hello1(){
        System.out.println("正在通过配置类的方式给sprin容器添加组件");
        return new HelloServiceImpl();
    }
}
