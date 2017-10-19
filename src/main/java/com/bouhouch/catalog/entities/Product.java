package com.bouhouch.catalog.entities;

import java.io.Serializable;

public class Product implements Serializable {
    private String reference;
    private String designation;
    private double price;
    private int quantity;
    private boolean promotion;

    public Product() {
    }

    public Product(String reference, String designation, double price, int quantity, boolean promotion) {
        this.reference = reference;
        this.designation = designation;
        this.price = price;
        this.quantity = quantity;
        this.promotion = promotion;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean isPromotion() {
        return promotion;
    }

    public void setPromotion(boolean promotion) {
        this.promotion = promotion;
    }
}
