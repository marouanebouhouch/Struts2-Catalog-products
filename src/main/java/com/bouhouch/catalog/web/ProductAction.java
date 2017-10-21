package com.bouhouch.catalog.web;

import com.bouhouch.catalog.entities.Product;
import com.bouhouch.catalog.service.ICatalogService;
import com.bouhouch.catalog.service.SingletonService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProductAction extends ActionSupport implements Preparable {
    public Product product = new Product();
    public List<Product> products;
    public String reference;
    public boolean editMode;
    @Autowired
    public ICatalogService service;

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

    public void prepare() throws Exception {
        products = service.getProducts();
    }
}
