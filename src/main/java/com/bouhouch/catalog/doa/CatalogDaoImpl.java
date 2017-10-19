package com.bouhouch.catalog.doa;

import com.bouhouch.catalog.entities.Product;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CatalogDaoImpl implements ICatalogDao {
    private Map<String, Product> products = new HashMap<String, Product>();

    public void addProduct(Product product) {
        products.put(product.getReference(), product);
    }

    public List<Product> getProducts() {
        return new ArrayList<Product>(products.values());
    }

    public Product getProduct(String reference) {
        return products.get(reference);
    }

    public void deleteProduct(String reference) {
        products.remove(reference);
    }

    public void updateProduct(Product product) {
        products.put(product.getDesignation(), product);
    }

    public void init(){
        addProduct(new Product("RF001","Samsung Galaxy J7 Prime", 3000.00, 10, true));
        addProduct(new Product("RF002","Toshiba Satellite l750i", 3000.00, 2, false));
        addProduct(new Product("RF003","IPhone 6+", 3000.00, 10, true));
    }
}
