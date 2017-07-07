package com.vaibhav1.springboot.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.vaibhav1.springboot.entity.Student;

@Repository
public class StudentDao {
	
	private static Map<Integer, Student> students;
	
	static{
		students = new HashMap<Integer, Student>(){
			{
				put(1, new Student(1,"Vaibhav", "Computer Science"));
				put(2, new Student(2,"John", "Networks"));
				put(3, new Student(3,"Brock", "Human Resources"));
				
			}
		};
	}
	
	/**
	 * Method to get list of all students
	 * @return
	 */
	public Collection<Student> getAllStudents(){
		return this.students.values();
	}

	/**
	 * Method to return Student with specific ID
	 * @param id
	 * @return
	 */
	public Student getStudentById(int id){
		return this.students.get(id);
	}

	/**
	 * Method to remove student with specific ID from database
	 * @param id
	 */
	public void deleteStudentById(int id) {

		this.students.remove(id);
	}
	
	/**
	 * Method to update student by ID
	 * @param id
	 */
	public void updateStudent(Student student){
		
		this.students.put(student.getId(), student);
		
	}

	/**
	 * Method to add new student to database
	 * @param student
	 */
	public void addStudent(Student student) {
		this.students.put(student.getId(), student);
	}
	
}
