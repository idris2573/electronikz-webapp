package com.electronikz.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Set;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductRelated {

    private Product product;
    private Set<Product> related;

    public ProductRelated() {
    }

    public ProductRelated(Product product, Set<Product> related) {
        this.product = product;
        this.related = related;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Set<Product> getRelated() {
        return related;
    }

    public void setRelated(Set<Product> related) {
        this.related = related;
    }
}
