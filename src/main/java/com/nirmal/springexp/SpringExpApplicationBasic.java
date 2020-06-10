package com.nirmal.springexp;

import com.nirmal.springexp.byname.BinarySearchImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringExpApplicationBasic {
    private static Logger logger = LoggerFactory.getLogger(BinarySearchImpl.class);

    public static void main(String[] args) {

        ApplicationContext applicationContext = SpringApplication.run(SpringExpApplicationBasic.class, args);
        BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
        logger.info("{}",binarySearch);
        int result = binarySearch.binarySearch(new int[]{12, 4, 6}, 3);
        logger.info("{}",result);
    }

}
