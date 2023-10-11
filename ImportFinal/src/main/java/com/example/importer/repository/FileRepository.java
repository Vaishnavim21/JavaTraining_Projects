package com.example.importer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.importer.entity.FileEntity;

@Repository
public interface FileRepository extends JpaRepository<FileEntity, String> {

}
