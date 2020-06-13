/*
package com.nirmal.springexp;

import com.nirmal.componentscan.byname.BinarySearchImpl;
import com.nirmal.springexp.cdi.CdiBusiness;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringExpApplicationCdi {
    private static Logger logger = LoggerFactory.getLogger(BinarySearchImpl.class);

    public static void main(String[] args) {

        ApplicationContext applicationContext = SpringApplication.run(SpringExpApplicationCdi.class, args);
        CdiBusiness cdiBusiness = applicationContext.getBean(CdiBusiness.class);
        logger.info("{}",cdiBusiness);
    }

}
*/
