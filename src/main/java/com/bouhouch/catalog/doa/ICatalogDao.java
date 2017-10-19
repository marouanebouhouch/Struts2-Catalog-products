package com.bouhouch.catalog.doa;

import com.bouhouch.catalog.entities.Product;

import java.util.List;

public interface ICatalogDao {
    public void addProduct(Product product);
    public List<Product> getProducts();
    public Product getProduct(String reference);
    public void deleteProduct(String reference);
    public void updateProduct(Product product);
}
