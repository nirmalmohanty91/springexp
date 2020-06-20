package com.nirmal.springexp.junit.stub;

import com.nirmal.springexp.junit.JunitDataService;

public class JunitDataServiceStub implements JunitDataService {
    @Override
    public int[] retrieveAllData() {
        return new int[]{4, 6, 15};
    }
}
