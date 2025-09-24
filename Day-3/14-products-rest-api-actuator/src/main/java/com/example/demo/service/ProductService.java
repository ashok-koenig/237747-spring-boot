package com.example.demo.service;

import com.example.demo.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    private List<Product> products;

    public ProductService(){
        products = new ArrayList<>();
        products.add(new Product(1, "iPhone 17", "Smartphone", 17890));
        products.add(new Product(2, "Dell Laptop", "Laptop", 23457));
    }

    public List<Product> getAllProducts(){
        return products;
    }

    public Product createProduct(Product product){
        products.add(product);
        return product;
    }

    public Optional<Product> findProductById(int id){
        return products.stream().filter(product -> product.getId() == id).findFirst();
    }

    public boolean updateProduct(int id, Product editedProduct){
        for (Product product: products){
            if(product.getId() == id){
                product.setTitle(editedProduct.getTitle());
                product.setCategory(editedProduct.getCategory());
                product.setPrice(editedProduct.getPrice());
                return true;
            }
        }
        return false;
    }

    public boolean deleteProduct(int id){
        return products.removeIf(product -> product.getId() == id);
    }
}
