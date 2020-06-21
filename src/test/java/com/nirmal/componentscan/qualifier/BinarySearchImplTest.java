package com.nirmal.componentscan.qualifier;

import com.nirmal.springexp.SpringExpApplicationBasicComponentScan;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

//Testing using only spring
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = SpringExpApplicationBasicComponentScan.class)
public class BinarySearchImplTest {

    @Autowired
    BinarySearchImpl binarySearch;

    @Test
    public void testBinarySearch() {
        int result = binarySearch.binarySearch(new int[]{3}, 5);
        Assert.assertEquals(3, result);

    }

}
