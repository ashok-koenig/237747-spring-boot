package com.example.demo.service;

import com.example.demo.entity.Product;
import com.example.demo.exception.ProductNotFoundException;
import com.example.demo.repository.ProductRepository;
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

    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }

    public Product getProductById(Integer id){
        return productRepository.findById(id).orElseThrow(() -> new ProductNotFoundException(id));
    }

    public void deleteProductById(Integer id){
        productRepository.deleteById(id);
    }

    public List<Product> getProductsByCategory(String category){
        return productRepository.findByCategory(category);
    }

    public List<Product> getProductsSortedByPrice(){
        return productRepository.findAllProductsSortedByPrice();
    }

    public List<Product> getProductByPriceRange(double minPrice, double maxPrice){
        return productRepository.findProductsByPriceRange(minPrice, maxPrice);
    }

    public int updatePriceByCategory(String category, double price){
        return productRepository.updatePriceByCategory(category, price);
    }

    public List<Product> searchByTitle(String title){
        return productRepository.searchByTitle(title);
    }
}
