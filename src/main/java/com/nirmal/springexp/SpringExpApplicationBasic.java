package com.nirmal.springexp;

import com.nirmal.springexp.basic.BinarySearchImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
//@SpringBootApplication
public class SpringExpApplicationBasic {
    private static Logger logger = LoggerFactory.getLogger(BinarySearchImpl.class);

    public static void main(String[] args) {

        //ApplicationContext applicationContext = SpringApplication.run(SpringExpApplicationBasic.class, args);
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringExpApplicationBasic.class);
        BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
        logger.info("{}",binarySearch);
        int result = binarySearch.binarySearch(new int[]{12, 4, 6}, 3);
        logger.info("{}",result);
    }

}
