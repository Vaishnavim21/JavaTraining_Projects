package com.example.student.entity;

import java.sql.Timestamp;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "student1")

public class StudentEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "age")
	private int age;
	
	@Column(name = "is_active")
	private Boolean isActive;
	
	@Column(name = "is_deleted")
	private Boolean isDeleted;
	
	@Column(name = "created_by")
	private int createdBy;
	
	@Column(name = "created_by_name")
	private String createdByName;
	
	@Column(name = "created_on")
	@CreationTimestamp
	private Timestamp createdOn;
	
	@Column(name = "updated_by")
	private int updatedBy;
	
	@Column(name = "updated_by_name")
	private String updatedByName;
	
	@UpdateTimestamp
	@Column(name = "updated_on")
	private Timestamp updatedOn;
	
}
