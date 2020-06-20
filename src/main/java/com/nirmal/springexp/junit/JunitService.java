package com.nirmal.springexp.junit;

import org.springframework.stereotype.Service;

@Service
public class JunitService {

    JunitDataService junitDataService;

    public int getResult(int a, int b){

        return a+b;
    }
}
