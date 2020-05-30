package com.hongjun.chapter03autoconfig;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author hongjun500
 */
@SpringBootApplication
public class Chapter03AutoconfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(Chapter03AutoconfigApplication.class, args);
        Logger logger = LoggerFactory.getLogger(Chapter03AutoconfigApplication.class);
        // logger.info();
    }

}
