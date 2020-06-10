package com.nirmal.springexp.cdi;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class CdiBusiness {
    @Inject
    private CdiDao cdiDao;

    public CdiDao getCdiDao() {
        return cdiDao;
    }

    public void setCdiDao(CdiDao cdiDao) {
        this.cdiDao = cdiDao;
    }
}
