package com.bouhouch.catalog.service;

import com.bouhouch.catalog.doa.ICatalogDao;
import com.bouhouch.catalog.entities.Product;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public class CatalogServiceImpl implements ICatalogService {
    private ICatalogDao dao;

    public void setDao(ICatalogDao dao) {
        this.dao = dao;
    }

    public void addProduct(Product product) {
        dao.addProduct(product);
    }

    public List<Product> getProducts() {
        return dao.getProducts();
    }

    public Product getProduct(String reference) {
        return dao.getProduct(reference);
    }

    public void deleteProduct(String reference) {
        dao.deleteProduct(reference);
    }

    public void updateProduct(Product product) {
        dao.updateProduct(product);
    }
}
