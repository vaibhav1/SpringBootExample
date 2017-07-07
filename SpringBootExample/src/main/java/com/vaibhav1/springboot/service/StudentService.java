package com.vaibhav1.springboot.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vaibhav1.springboot.dao.StudentDao;
import com.vaibhav1.springboot.entity.Student;

@Service
public class StudentService {
	
	@Autowired
	private StudentDao studentDao;
	
	public Collection<Student> getAllStudents(){
		return studentDao.getAllStudents();
	}
	
	public Student getStudentById(int id){
		return studentDao.getStudentById(id);
	}

	public void deleteStudentById(int id) {
		studentDao.deleteStudentById(id);
	}
	
	public void updateStudent(Student student){
		studentDao.updateStudent(student);
	}

	public void addStudent(Student student) {
		studentDao.addStudent(student);
	}

}
