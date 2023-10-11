package com.example.customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.customer.entity.ProductEntity;

public interface ProductRepository extends JpaRepository<ProductEntity,Long> {

}
