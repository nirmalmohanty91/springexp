package com.nirmal.springexp;

import com.nirmal.springexp.byname.BinarySearchImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
//@ComponentScan("com.nirmal.componentscan.primary")
public class SpringExpApplicationBasicComponentScan {

    public static void main(String[] args) {

        ApplicationContext applicationContext = SpringApplication.run(SpringExpApplicationBasicComponentScan.class, args);
        BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
        System.out.println(binarySearch);
        int result = binarySearch.binarySearch(new int[]{12, 4, 6}, 3);
        System.out.println(result);
    }

}
