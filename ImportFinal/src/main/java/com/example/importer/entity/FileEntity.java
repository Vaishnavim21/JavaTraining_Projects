package com.example.importer.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="files")
public class FileEntity {
	@Id
	private String id;
	
	private String name;
	
	private String type;
	@Lob
	private byte[] data;
	

}
