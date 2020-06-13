package com.nirmal.springexp.basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {

    private static Logger logger = LoggerFactory.getLogger(BinarySearchImpl.class);

    @Autowired
    @Qualifier("quick")
    private SortAlgorithm sortAlgorithm;

   /* @PostConstruct
    public void postConstruct() {
        logger.info("Bean is created!!");
    }*/

    public int binarySearch(int[] numbers, int numberToSearchFor) {
        int[] sortedNumbers = sortAlgorithm.sort(numbers);
        logger.info("{}", sortAlgorithm);
        return 3;
    }

   /* @PreDestroy
    public void preDestroy() {
        logger.info("Bean is going to be destroyed!!");
    }*/
}
