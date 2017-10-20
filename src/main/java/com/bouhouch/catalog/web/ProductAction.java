package com.bouhouch.catalog.web;

import com.bouhouch.catalog.entities.Product;
import com.bouhouch.catalog.service.ICatalogService;
import com.bouhouch.catalog.service.SingletonService;
import com.opensymphony.xwork2.ActionSupport;

import java.util.List;

public class ProductAction extends ActionSupport {
    public Product product = new Product();
    public List<Product> products;
    public String reference;
    public boolean editMode;
    public ICatalogService service = SingletonService.getService();

    @Override
    public String execute() throws Exception {
        products = service.getProducts();
        return SUCCESS;
    }

    public String save(){
        if(editMode)
            service.updateProduct(product);
        else
            service.addProduct(product);
        editMode = false;
        product = new Product();
        products = service.getProducts();
        return SUCCESS;
    }

    public String delete(){
        service.deleteProduct(reference);
        products = service.getProducts();
        return SUCCESS;
    }

    public String edit(){
        editMode = true;
        product = service.getProduct(reference);
        products = service.getProducts();
        return SUCCESS;
    }
}
