/*
package com.nirmal.springexp;

import com.nirmal.componentscan.qualifier.BinarySearchImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

*/
/**
Remember to refactor the appropriate import for the BinarySearchImpl class(byname/primary/qulifier for component scan to work)
 *//*

@SpringBootApplication
@ComponentScan("com.nirmal.componentscan.qualifier")
public class SpringExpApplicationBasicComponentScan {

    private static Logger logger = LoggerFactory.getLogger(SpringExpApplicationBeanScope.class);

    public static void main(String[] args) {

        ApplicationContext applicationContext = SpringApplication.run(SpringExpApplicationBasicComponentScan.class, args);
        BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
        logger.info("{}", binarySearch);
        int result = binarySearch.binarySearch(new int[]{12, 4, 6}, 3);
        logger.info("{}", result);
    }

}
*/
