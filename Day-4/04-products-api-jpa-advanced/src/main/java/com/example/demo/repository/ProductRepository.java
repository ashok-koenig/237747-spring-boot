package com.example.demo.repository;

import com.example.demo.entity.Product;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Integer> {

    // Method 1: Repository method
    List<Product> findByCategory(String category);

    // Method 2: JPQL
    @Query("select p from Product p order by p.price desc")
    List<Product> findAllProductsSortedByPrice();

    // JPQL with params
    @Query("select p from Product p where p.price between :minPrice and :maxPrice")
    List<Product> findProductsByPriceRange(@Param("minPrice") double minPrice, @Param("maxPrice") double maxPrice);

    // Named JPQL Query
//    @Query("UPDATE Product p SET p.price=:price where p.category=:category")
    @Modifying
    @Transactional
    @Query(name = "Product.updatePriceByCategory")
    int updatePriceByCategory(@Param("category") String category, @Param("price") double price);

    // Native Queries
    @Query(value = "select * from products where lower(title) like lower(concat('%',:title, '%'))",
            nativeQuery = true)
    List<Product> searchByTitle(@Param("title") String title);

}
