package com.hongjun.chapter04web.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.*;

/**
 * @author hongjun500
 * @date 2020/5/31 18:24
 * Created with 2019.3.2.IntelliJ IDEA
 * Description:
 */
// @EnableWebMvc 全面接管springmvc的配置
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    @Autowired
    private LoginHandlerInterceptor loginHandlerInterceptor;

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        // 将请求"/"隐射到login页面
        registry.addViewController("/login").setViewName("login");
        registry.addViewController("/main").setViewName("dashboard");

    }


    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(loginHandlerInterceptor).excludePathPatterns("/static/**");
    }

    @Bean
    public LocaleResolver localeResolver(){
        return new MyLocaleResolver();
    }
}
