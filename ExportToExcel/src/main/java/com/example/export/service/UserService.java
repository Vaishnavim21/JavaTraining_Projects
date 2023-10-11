package com.example.export.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.export.entity.UserEntity;
import com.example.export.repository.UserRepository;

import jakarta.transaction.Transactional;
 
@Service
@Transactional
public class UserService {
     
    @Autowired
    private UserRepository repo;
     
    public List<UserEntity> listAll() {
        List<UserEntity> entityUdser= repo.findAll();
        return entityUdser;
    }
     
}