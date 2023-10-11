package com.example.departmentJpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.departmentJpa.entityclass.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
	
	boolean existsByEmail(String email);

	@Query(value = "select * from department where id =:id", nativeQuery = true)
	Department findByid(Long id);
}
