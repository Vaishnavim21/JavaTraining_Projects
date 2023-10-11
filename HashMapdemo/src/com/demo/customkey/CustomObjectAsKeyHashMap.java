package com.demo.customkey;

import java.util.HashMap;
import java.util.Map;

public class CustomObjectAsKeyHashMap {

	public static void main(String[] args) {
		
		Student s1 = new Student(101,"Harsh");
		Student s2 = new Student(102,"Harsh");
		Student s3 = new Student(103,"Harsh");
		
		HashMap<Student,String> map = new HashMap<>();
		
		map.put(s1,"Student-1");
	    map.put(s2,"Student-2");
		map.put(s3,"Student-3");
		
		for(Map.Entry<Student, String> entry:map.entrySet()) {
			System.out.println(entry.getKey()+"=="+entry.getValue());
		}
		
		s3.setStudid(105);
		System.out.println(map.get(s3));
		

	}

}
