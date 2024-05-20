package com.rusiruchapana.Real.time.search.Rest.API.repository;

import com.rusiruchapana.Real.time.search.Rest.API.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product , Long> {

    @Query("select p from Product p where "+
            "p.name like concat('%',:query,'%')"+
            "or  p.description like concat('%',:query,'%') ")
    List<Product> searchProducts(String query);

}
