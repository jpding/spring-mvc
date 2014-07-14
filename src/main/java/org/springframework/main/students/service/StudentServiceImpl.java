package org.springframework.main.students.service;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.main.students.mapper.StudentMapper;
import org.springframework.main.students.model.Student;
import org.springframework.stereotype.Service;


@Service("studentService")
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentMapper studentMapper;
	
	@Override
	public void insertStudent(Student std) {
		studentMapper.insertStudent(std);
	}

	@Override
	public boolean login(String userName, String password) {
		Student std = find(userName);
		return StringUtils.equals(std.getPassword(), password);
	}

	@Override
	public Student find(String userName) {
		return studentMapper.find(userName);
	}

}
