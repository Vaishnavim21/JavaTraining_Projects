package com.example.importer.service;

import java.util.UUID;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.importer.entity.FileEntity;

@Service
public class FileService {
	
	public void store(MultipartFile file) {
		String fileName = file.getOriginalFilename();
		//FileEntity fileDb = new FileEntity(UUID.randomUUID().toString(),fileName,file.getContentType(),file.getBytes());
		
		
	}

}
