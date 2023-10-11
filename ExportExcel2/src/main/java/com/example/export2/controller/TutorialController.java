package com.example.export2.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.export2.entity.TutorialEntity;
import com.example.export2.service.TutorialService;
import com.example.export2.serviceImplementation.TutorialImplementation;

import jakarta.servlet.http.HttpServletResponse;

@RestController
public class TutorialController {

  @Autowired
  private TutorialService service;
  
  @Autowired
  private TutorialImplementation tutorialImpl;

  @GetMapping("/download")
  public void exportToExcel(HttpServletResponse response) throws IOException{
	  List<TutorialEntity> listTutorial=service.listAll();
	  System.out.println(listTutorial);
	  tutorialImpl.excelGenerate(listTutorial);
	  
  }

}