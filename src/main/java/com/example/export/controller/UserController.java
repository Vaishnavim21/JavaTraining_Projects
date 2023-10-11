package com.example.export.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.export.entity.UserEntity;
import com.example.export.service.UserService;
import com.example.export.serviceImplementation.UserExcelExporter;

import jakarta.servlet.http.HttpServletResponse;

@RestController
public class UserController {

	@Autowired
	private UserService service;

	@Autowired
	private UserExcelExporter userExcelExporter;

	@GetMapping("/users/export/excel")
	public void exportToExcel(HttpServletResponse response) throws IOException {

		List<UserEntity> listUsers = service.listAll();
		System.out.println(listUsers);
		userExcelExporter.excelGenerate(listUsers);

	}

}