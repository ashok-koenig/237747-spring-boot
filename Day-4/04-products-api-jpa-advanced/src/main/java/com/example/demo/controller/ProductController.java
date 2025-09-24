package com.example.demo.controller;

import com.example.demo.entity.Product;
import com.example.demo.service.ProductService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping
    public ResponseEntity<Product> createProduct(@Valid @RequestBody Product product){
        return ResponseEntity.status(HttpStatus.CREATED).body(productService.saveProduct(product));
    }

    @GetMapping
    public ResponseEntity<List<Product>> allProducts(){
        return ResponseEntity.ok(productService.getAllProducts());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> getAProduct(@PathVariable Integer id){
        return ResponseEntity.ok(productService.getProductById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Product> updateProduct(@PathVariable Integer id,@Valid @RequestBody Product product){
        productService.getProductById(id);
        product.setId(id);
        return ResponseEntity.ok(productService.saveProduct(product));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteProduct(@PathVariable Integer id){
        productService.getProductById(id);
        productService.deleteProductById(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body(null);
    }

    @GetMapping("/category")
    public ResponseEntity<List<Product>> getByCategory(@RequestParam String category){
        return ResponseEntity.ok(productService.getProductsByCategory(category));
    }

    @GetMapping("/price")
    public ResponseEntity<List<Product>> sortByPrice(){
        return ResponseEntity.ok(productService.getProductsSortedByPrice());
    }

    @GetMapping("/price-range")
    public ResponseEntity<List<Product>> getProductByPriceRange(@RequestParam double minPrice,
                                                                @RequestParam double maxPrice){
        return ResponseEntity.ok(productService.getProductByPriceRange(minPrice, maxPrice));
    }

    @PatchMapping
    public ResponseEntity<Object> updatePriceByCategory(@RequestParam String category, @RequestParam double price){
        return ResponseEntity.ok(Map.of("updated_products",
                                            productService.updatePriceByCategory(category, price))
                                );
    }

    @GetMapping("/search")
    public ResponseEntity<List<Product>> searchByTitle(@RequestParam String title){
        return ResponseEntity.ok(productService.searchByTitle(title));
    }
}
