package com.rusiruchapana.Real.time.search.Rest.API.controller;

import com.rusiruchapana.Real.time.search.Rest.API.entity.Product;
import com.rusiruchapana.Real.time.search.Rest.API.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
public class ProductsController {
    private ProductService productService;

    public ProductsController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("/createproducts")
    public Product createProducts(@RequestBody Product product){
        return productService.createProducts(product);
    }

    @GetMapping("/searchproducts")
    public ResponseEntity<List<Product>> searchProducts(@RequestParam("query") String query){
        return new ResponseEntity<>(productService.searchProducts(query) , HttpStatus.OK);
    }




}
