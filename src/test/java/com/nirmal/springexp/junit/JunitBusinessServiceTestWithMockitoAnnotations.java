package com.nirmal.springexp.junit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class JunitBusinessServiceTestWithMockitoAnnotations {
    @Mock
    private JunitDataService junitDataServiceMock;

    @InjectMocks
    private JunitBusinessService junitBusinessServiceMock;

    @Test
    public void testFindGreatestFromAllData(){
        when(junitDataServiceMock.retrieveAllData()).thenReturn(new int[]{4, 6, 15});
        assertEquals(15, junitBusinessServiceMock.findGreatestFromAllData());
    }

    @Test
    public void testFindGreatestFromAllData_TestThisForOneValue(){
        when(junitDataServiceMock.retrieveAllData()).thenReturn(new int[]{8});
        assertEquals(8, junitBusinessServiceMock.findGreatestFromAllData());

    }
}
