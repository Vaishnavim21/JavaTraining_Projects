package com.example.student.serviceImplementation;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.student.customException.CustomBadRequestException;
import com.example.student.entity.StudentEntity;
import com.example.student.repository.StudentRepository;
import com.example.student.response.StudentResponse;
import com.example.student.service.StudentService;

@Service
public class StudentServiceImplementation implements StudentService {
	 @Autowired
	 private StudentRepository studentRepository;
	 
	 @Autowired
	 private ModelMapper mapper;
	    
    public StudentResponse getStudentById(int id) {
        Optional<StudentEntity> student = studentRepository.findById(id);
        StudentResponse studentResponse = mapper.map(student,StudentResponse.class);
        return studentResponse;
    }
    
    public ResponseEntity<Object> createStudent(StudentResponse studentDto) {
    	StudentEntity studentResponse = mapper.map(studentDto, StudentEntity.class);
        studentResponse.setCreatedOn(Timestamp.from(Instant.now()));
		studentResponse.setCreatedBy(1);
		studentResponse.setUpdatedBy(2);
		studentResponse.setUpdatedByName("Niveditha");
		studentResponse.setCreatedByName("Vaish");
		if (studentRepository.save(studentResponse) == null)
			throw new CustomBadRequestException("Not Saved");
		if (studentRepository.save(studentResponse) == null)
			return ResponseEntity.status(HttpStatus.CREATED).body("Not saved");
		else
			return ResponseEntity.status(HttpStatus.CREATED).body("saved");
	}


}

