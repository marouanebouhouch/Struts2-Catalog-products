package com.bouhouch.catalog.service;

import com.bouhouch.catalog.entities.Product;

import java.util.List;

public interface ICatalogService {
    public void addProduct(Product p);
    public List<Product> getProducts();
    public Product getProduct(String reference);
    public void deleteProduct(String reference);
    public void updateProduct(Product product);
}
