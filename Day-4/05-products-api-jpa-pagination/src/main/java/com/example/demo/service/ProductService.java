package com.example.demo.service;

import com.example.demo.entity.Product;
import com.example.demo.exception.ProductNotFoundException;
import com.example.demo.repository.ProductRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    // Create and update product
    public Product saveProduct(Product product){
        return productRepository.save(product);
    }

//    public List<Product> getAllProducts(){
//        return productRepository.findAll();
//    }

    public Page<Product> getAllProducts(Pageable pageable){
        return productRepository.findAll(pageable);
    }

    public Product getProductById(Integer id){
        return productRepository.findById(id).orElseThrow(() -> new ProductNotFoundException(id));
    }

    public void deleteProductById(Integer id){
        productRepository.deleteById(id);
    }
}
