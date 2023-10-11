package com.example.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.customer.entity.*;
import com.example.customer.repository.CustomerRepository;
import com.example.customer.repository.ProductRepository;
import com.example.customer.response.CustomerProductResponse;
import org.springframework.web.bind.annotation.*;

import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {
    private final CustomerRepository customerRepository;
    private final ProductRepository productRepository;

    @Autowired
    public CustomerController(CustomerRepository customerRepository, ProductRepository productRepository) {
        this.customerRepository = customerRepository;
        this.productRepository = productRepository;
    }

    @PostMapping("/create-customer")
    public CustomerEntity createCustomer(@RequestBody CustomerEntity customer) {
        return customerRepository.save(customer);
    }

    @PostMapping("/create-product")
    public ProductEntity createProduct(@RequestBody ProductEntity product) {
        return productRepository.save(product);
    }

    @PostMapping("/{customerId}/create-product")
    public ProductEntity createProductForCustomer(@PathVariable Long customerId, @RequestBody ProductEntity product) {
        CustomerEntity customer = customerRepository.findById(customerId)
                .orElseThrow(() -> new RuntimeException("Customer not found"));
        product.setCustomer(customer);
        return productRepository.save(product);
    }

    @GetMapping("/all-customers")
    public List<CustomerEntity> getAllCustomers() {
        return customerRepository.findAll();
    }

    @GetMapping("/all-products")
    public List<ProductEntity> getAllProducts() {
        return productRepository.findAll();
    }

    @GetMapping("/{customerId}/products")
    public List<ProductEntity> getProductsForCustomer(@PathVariable Long customerId) {
        CustomerEntity customer = customerRepository.findById(customerId)
                .orElseThrow(() -> new RuntimeException("Customer not found"));
        return customer.getProducts();
    }

    @GetMapping("/products-with-customers")
    public List<CustomerProductResponse> getProductsWithCustomers() {
        List<ProductEntity> products = productRepository.findAll();

        return products.stream()
                .map(product -> {
                    CustomerEntity customer = product.getCustomer();
                    return new CustomerProductResponse(
                            customer.getName(),
                            product.getName(),
                            product.getPrice()
                    );
                })
                .collect(Collectors.toList());
    }
}

