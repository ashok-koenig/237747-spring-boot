package com.example.demo.model;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

public class Product {
    @Positive(message = "Invalid product id")
    private int id;

    @NotEmpty(message = "Product title is required")
    @Size(min = 2, max = 200, message = "Product title must be between 2 and 200 characters")
    private String title;

    @NotEmpty(message = "Product category is required")
    @Size(min = 2, max = 200, message = "Product category must be between 2 and 200 characters")
    private String category;

    @Positive(message = "Invalid product price")
    private double price;

    public Product(int id, String title, String category, double price) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
