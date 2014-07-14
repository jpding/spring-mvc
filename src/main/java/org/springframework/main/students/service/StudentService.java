package org.springframework.main.students.service;

import org.springframework.main.students.model.Student;

public interface StudentService {
	public void insertStudent(Student std);
	
	public boolean login(String userName, String password);
	
	public Student find(String userName);
}
