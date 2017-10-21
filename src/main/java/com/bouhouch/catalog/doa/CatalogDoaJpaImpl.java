package com.bouhouch.catalog.doa;

import com.bouhouch.catalog.entities.Product;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

public class CatalogDoaJpaImpl implements ICatalogDao {
    @PersistenceContext
    private EntityManager em;

    public void addProduct(Product product) {
        em.persist(product);
    }

    public List<Product> getProducts() {
        Query q = em.createQuery("select p from Product p");
        return q.getResultList();
    }

    public Product getProduct(String reference) {
        return em.find(Product.class, reference);
    }

    public void deleteProduct(String reference) {
        Product p = getProduct(reference);
        em.remove(p);
    }

    public void updateProduct(Product product) {
        em.merge(product);
    }
}
