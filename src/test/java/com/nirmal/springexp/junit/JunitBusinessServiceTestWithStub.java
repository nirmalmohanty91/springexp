package com.nirmal.springexp.junit;

import com.nirmal.springexp.junit.stub.JunitDataServiceStub;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class JunitBusinessServiceTestWithStub {

    @Test
    public void testFindGreatestFromAllData(){
        JunitBusinessService junitBusinessService = new JunitBusinessService(new JunitDataServiceStub());
        int result = junitBusinessService.findGreatestFromAllData();
        assertEquals(15, result);

    }
}
