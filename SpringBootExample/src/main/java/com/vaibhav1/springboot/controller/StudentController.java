package com.vaibhav1.springboot.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vaibhav1.springboot.entity.Student;
import com.vaibhav1.springboot.service.StudentService;


@RestController
@RequestMapping("/students")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@RequestMapping(method=RequestMethod.GET)
	public Collection<Student> getAllStudents(){
		return studentService.getAllStudents();
	}

	@RequestMapping(value="/{id}", method = RequestMethod.GET)
	public Student getStudentById(@PathVariable("id") int id){
		return studentService.getStudentById(id);
	}
	
	@RequestMapping(value="/{id}", method = RequestMethod.DELETE)
	public void deleteStudentById(@PathVariable("id") int id){
		studentService.deleteStudentById(id);
	}

	@RequestMapping(method = RequestMethod.PUT)
	public void updateStudent(@RequestBody Student student){
		studentService.updateStudent(student);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public void addStudent(@RequestBody Student student){
		studentService.addStudent(student);
	}
}