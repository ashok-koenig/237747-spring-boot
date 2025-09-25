package com.example.demo.controller;

import com.example.demo.model.Product;
import com.example.demo.service.ProductService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/products")
public class ProductController {
    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public String listProducts(Model model){
        model.addAttribute("products", productService.getAllProducts());
        return "product-list";
    }

    @GetMapping("/create")
    public String showCreateForm(Model model){
        model.addAttribute("product", new Product());
        return "product-form";
    }

    @PostMapping("/save")
    public String saveProduct(@Valid @ModelAttribute Product product, BindingResult result, Model model){

        if(result.hasErrors()){
            return "product-form";
        }
        productService.saveProduct(product);
        return "redirect:/products";
    }

    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable Integer id, Model model){
        Product product = productService.getProductById(id);
        if(product == null){
            return "redirect:/products";
        }
        model.addAttribute("product", product);
        return "product-form";
    }
    @GetMapping("/delete/{id}")
    public String deleteProduct(@PathVariable Integer id){
        productService.getProductById(id);
        productService.deleteProductById(id);
        return "redirect:/products";
    }
}
