package com.nirmal.springexp.junit;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class LearningMoreAboutMockito {

    @Test
    public void testListSize(){
        List listMock = mock(List.class);
        when(listMock.size()).thenReturn(10);
        assertEquals(10,listMock.size());
        assertEquals(10,listMock.size());
    }

    @Test
    public void testListSize_MultipleReturns(){
        List listMock = mock(List.class);
        when(listMock.size()).thenReturn(10).thenReturn(20);
        assertEquals(10,listMock.size());
        assertEquals(20,listMock.size());
        assertEquals(20,listMock.size());
    }

    @Test
    public void testLisGetMethod_SpecificParameter(){
        List listMock = mock(List.class);
        when(listMock.get(0)).thenReturn("nirmal");
        assertEquals("nirmal",listMock.get(0));
    }

    @Test
    public void testLisGetMethod_GenericParameter(){
        List listMock = mock(List.class);
        when(listMock.get(Mockito.anyInt())).thenReturn("nirmal");
        assertEquals("nirmal",listMock.get(10));
    }
    /**If there are 2 input parameters then both has to be specific or both has to be generic in mockito
     * Otherwise it won't work*/
}
