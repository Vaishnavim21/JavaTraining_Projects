package com.example.export.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.export.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {
     
}
 