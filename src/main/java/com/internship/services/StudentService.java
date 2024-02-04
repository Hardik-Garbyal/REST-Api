package com.internship.services;

import java.util.List;

import com.internship.entities.Students;

public interface StudentService  {
	public List<Students> getAllStudents();
	public Students addStudent(Students s);
	public void deleteStudent(Integer rollno);
	public Students updateStudent(Integer rollno,Students s);
	
	

}
