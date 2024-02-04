package com.internship.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.internship.entities.Students;
import com.internship.services.StudentServiceImpl;


@RestController
public class HomeController {
	
	@Autowired
	private StudentServiceImpl services;
	
	@GetMapping("/students")
	public List<Students> getStudents() {
		return services.getAllStudents();
	}
	
	
	
	@PostMapping("/students")
	public Students addStudent(@RequestBody Students s) {
		services.addStudent(s);
		return s;
	}
	
	@DeleteMapping("/students/{rollno}")
	public String deleteStudentbyID(@PathVariable("rollno") Integer rollno) {
		services.deleteStudent(rollno);
		return "Deleted";
	}
	
	@PutMapping("/students/{rollno}")
	public Students upadte(@PathVariable("rollno") Integer rollno,@RequestBody Students s) {
		services.updateStudent(rollno, s);
		
		return s;
	}
	

}
