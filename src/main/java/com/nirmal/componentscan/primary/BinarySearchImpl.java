package com.nirmal.componentscan.primary;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
    private static Logger logger = LoggerFactory.getLogger(BinarySearchImpl.class);

    @Autowired
    private SortAlgorithm sortAlgorithm;

    public int binarySearch(int[] numbers, int numberToSearchFor) {

        int[] sortedNumbers = sortAlgorithm.sort(numbers);
        logger.info("This is by @Primary");
        logger.info("{}", sortAlgorithm);
        // Search the array
        return 3;
    }

}
