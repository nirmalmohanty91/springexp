package com.nirmal.springexp.cdi;

import com.nirmal.springexp.SpringExpApplicationCdi;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = SpringExpApplicationCdi.class)
public class CdiBusinessTest {
    @Autowired
    CdiBusiness cdiBusiness;

    @Test
    public void testFindGreatest() {
        int result = cdiBusiness.findGreatest();
        Assert.assertEquals(3, result);

    }
}
