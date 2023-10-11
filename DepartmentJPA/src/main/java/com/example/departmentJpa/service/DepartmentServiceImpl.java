package com.example.departmentJpa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.departmentJpa.Exception.DuplicateEmailException;
import com.example.departmentJpa.entityclass.Department;
import com.example.departmentJpa.repository.DepartmentRepository;

@Service
public class DepartmentServiceImpl implements DepartmentService {
	private final DepartmentRepository departmentRepository;

	@Autowired
	public DepartmentServiceImpl(DepartmentRepository departmentRepository) {
		this.departmentRepository = departmentRepository;
	}

	@Override
	public List<Department> getAllDepartments() {
		return departmentRepository.findAll();
	}

	@Override
	public Department getDepartmentById(Long id) {
		Optional<Department> optionalDepartment = departmentRepository.findById(id);
		return optionalDepartment.orElse(null);
	}

	@Override
	public Department createDepartment(Department department) {
		// Check if the email already exists
		if (departmentRepository.existsByEmail(department.getEmail())) {

			throw new DuplicateEmailException("Email address already exists");
		}

		return departmentRepository.save(department);
	}

	@Override
	public ResponseEntity<Object> updateDepartment(Long id, Department updatedDepartment) {
		boolean isEmailduplicate = departmentRepository.existsByEmail(updatedDepartment.getEmail());
		if (isEmailduplicate) {
			throw new DuplicateEmailException("Email address already exists");
		}
		Department entity = departmentRepository.findById(id).get();
		if (entity == null) {
			throw new DuplicateEmailException("department not found to update");

		}

		entity.setEmail(updatedDepartment.getEmail());
		entity.setName(updatedDepartment.getName());

		Department savedEntity = departmentRepository.save(entity);
		return new ResponseEntity<Object>(savedEntity, HttpStatus.OK);

	}

	@Override
	public void deleteDepartment(Long id) {
		departmentRepository.deleteById(id);
	}

	@Override
	@Transactional(readOnly = true)
	public boolean isEmailUnique(String email, Long id) {
		return true;
	}

	@Override
	public boolean existsByEmail(String email) {
		return false;
	}
}
