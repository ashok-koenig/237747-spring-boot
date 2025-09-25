package com.example.demo.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;

public class Employee {

    @NotEmpty(message = "Employee name is required")
    private String name;

    @NotEmpty(message = "Employee gender is required")
    private String gender;

    @NotEmpty(message = "Employee email is required")
    @Email(message = "Employee email must be valid")
    private String email;

    @NotEmpty(message = "Employee department is required")
    private String department;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
