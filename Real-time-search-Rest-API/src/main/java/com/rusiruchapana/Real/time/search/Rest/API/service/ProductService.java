package com.rusiruchapana.Real.time.search.Rest.API.service;

import com.rusiruchapana.Real.time.search.Rest.API.entity.Product;

import java.util.List;


public interface ProductService {

    List<Product> searchProducts(String query);

    Product createProducts(Product product);
}
