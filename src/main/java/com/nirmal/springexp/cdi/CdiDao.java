package com.nirmal.springexp.cdi;

import javax.inject.Named;

@Named
public class CdiDao {
    public int[] getData() {
        return new int[]{2, 6, 8};
    }
}
