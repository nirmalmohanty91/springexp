/*
package com.nirmal.springexp;

import com.nirmal.springexp.beanscope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class SpringExpApplicationBeanScope {

    private static Logger logger = LoggerFactory.getLogger(SpringExpApplicationBeanScope.class);

    public static void main(String[] args) {

        ApplicationContext applicationContext = SpringApplication.run(SpringExpApplicationBeanScope.class, args);

        PersonDAO personDAO = applicationContext.getBean(PersonDAO.class);
        PersonDAO personDAO2 = applicationContext.getBean(PersonDAO.class);
        logger.info("{}", personDAO);
        logger.info("{}", personDAO2);
        logger.info("{}", personDAO.getJdbcConnection());
        logger.info("{}", personDAO2.getJdbcConnection());

    }

}
*/
