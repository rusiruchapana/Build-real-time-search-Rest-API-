package com.rusiruchapana.Real.time.search.Rest.API.repository;

import com.rusiruchapana.Real.time.search.Rest.API.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product , Long> {
}
