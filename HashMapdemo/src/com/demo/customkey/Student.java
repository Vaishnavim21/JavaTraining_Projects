package com.demo.customkey;

import java.util.Objects;

public class Student {
	int studid;
	String studName;
	public Student(int studid, String studName) {
		super();
		this.studid = studid;
		this.studName = studName;
	}
	
	
	public int getStudid() {
		return studid;
	}
	public void setStudid(int studid) {
		this.studid = studid;
	}
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	@Override
	public String toString() {
		return "Student [studid=" + studid + ", studName=" + studName + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(studName);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(studName, other.studName);
	}
	

}
