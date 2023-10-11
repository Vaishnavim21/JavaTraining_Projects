package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.TransactionEntity;

@Repository
public interface TransactionRepository extends CrudRepository<TransactionEntity, Long> {
  
}
