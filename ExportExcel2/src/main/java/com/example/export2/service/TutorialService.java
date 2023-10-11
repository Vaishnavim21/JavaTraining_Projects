package com.example.export2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import com.example.export2.entity.TutorialEntity;
import com.example.export2.repository.TutorialRepository;

import jakarta.transaction.Transactional;

@Transactional
public class TutorialService {
	
	@Autowired
    private TutorialRepository repo;

	public List<TutorialEntity> listAll() {
		List<TutorialEntity> entitytutorial=repo.findAll();
	
		return entitytutorial;
}

}