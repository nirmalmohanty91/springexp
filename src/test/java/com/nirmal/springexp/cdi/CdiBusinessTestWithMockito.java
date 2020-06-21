package com.nirmal.springexp.cdi;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class CdiBusinessTestWithMockito {
    //Create Mock
    @Mock
    private CdiDao cdiDao;

    //Inject the mock
    @InjectMocks
    private CdiBusiness cdiBusiness;

    @Test
    public void testFindGreatest() {
        //Remember to call the service which you are mocking. for example here we are mocking the DataService
        when(cdiDao.getData()).thenReturn(new int[]{2,6,7});
        int result = cdiBusiness.findGreatest();
        Assert.assertEquals(7, result);
    }
}
