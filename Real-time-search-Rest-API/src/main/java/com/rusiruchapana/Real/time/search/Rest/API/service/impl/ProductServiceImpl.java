package com.rusiruchapana.Real.time.search.Rest.API.service.impl;

import com.rusiruchapana.Real.time.search.Rest.API.entity.Product;
import com.rusiruchapana.Real.time.search.Rest.API.repository.ProductRepository;
import com.rusiruchapana.Real.time.search.Rest.API.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> searchProducts(String query) {
        List<Product> products = productRepository.searchProducts(query);
        return products;
    }
}
