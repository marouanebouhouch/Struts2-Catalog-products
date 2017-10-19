package com.bouhouch.catalog.service;

import com.bouhouch.catalog.doa.CatalogDaoImpl;

public class SingletonService {
    private static CatalogServiceImpl service;
    static {
        CatalogDaoImpl dao = new CatalogDaoImpl();
        dao.init();
        service = new CatalogServiceImpl();
        service.setDao(dao);
    }

    public static CatalogServiceImpl getService() {
        return service;
    }
}
