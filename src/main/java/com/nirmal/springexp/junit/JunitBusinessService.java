package com.nirmal.springexp.junit;

import org.springframework.beans.factory.annotation.Autowired;

public class JunitBusinessService {
    public JunitBusinessService(JunitDataService junitDataService) {
        this.junitDataService = junitDataService;
    }

    @Autowired
    private JunitDataService junitDataService;

    public int findGreatestFromAllData(){
        int[] allData=junitDataService.retrieveAllData();
        int greatest = Integer.MIN_VALUE;

        for(int value: allData){
            if(value > greatest){
                greatest = value;
            }
        }
        return greatest;
    }
}
