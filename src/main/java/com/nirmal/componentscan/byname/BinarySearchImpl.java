package com.nirmal.componentscan.byname;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {

    private static Logger logger = LoggerFactory.getLogger(BinarySearchImpl.class);

    @Autowired
    private SortAlgorithm bubbleSortAlgorithm; //ByName autowiring

   /* @PostConstruct
    public void postConstruct() {
        logger.info("Bean is created!!");
    }*/

    public int binarySearch(int[] numbers, int numberToSearchFor) {

        int[] sortedNumbers = bubbleSortAlgorithm.sort(numbers);
        logger.info("This is by Name autowiring");
        logger.info("{}", bubbleSortAlgorithm);
        return 3;
    }

   /* @PreDestroy
    public void preDestroy() {
        logger.info("Bean is going to be destroyed!!");
    }*/
}
