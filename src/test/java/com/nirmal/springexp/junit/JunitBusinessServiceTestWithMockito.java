package com.nirmal.springexp.junit;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class JunitBusinessServiceTestWithMockito {

    @Test
    public void testFindGreatestFromAllData(){
        JunitDataService junitDataServiceMock = mock(JunitDataService.class);
        when(junitDataServiceMock.retrieveAllData()).thenReturn(new int[]{4, 6, 15});
        //This is doing constructor injection
        JunitBusinessService junitBusinessService = new JunitBusinessService(junitDataServiceMock);
        int result = junitBusinessService.findGreatestFromAllData();
        assertEquals(15, result);
    }

    @Test
    public void testFindGreatestFromAllData_TestThisForOneValue(){
        JunitDataService junitDataServiceMock = mock(JunitDataService.class);
        when(junitDataServiceMock.retrieveAllData()).thenReturn(new int[]{8});
        //This is doing constructor injection
        JunitBusinessService junitBusinessService = new JunitBusinessService(junitDataServiceMock);
        int result = junitBusinessService.findGreatestFromAllData();
        assertEquals(8, result);

    }
}
