package com.nirmal.springexp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringExpApplicationJunit {
    private static Logger logger = LoggerFactory.getLogger(SpringExpApplicationJunit.class);
    public static void main(String[] args) {
        SpringApplication.run(SpringExpApplicationJunit.class, args);
    }
}
