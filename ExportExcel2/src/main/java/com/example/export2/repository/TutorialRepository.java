package com.example.export2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.export2.entity.TutorialEntity;

public interface TutorialRepository extends JpaRepository<TutorialEntity, Long> {
}