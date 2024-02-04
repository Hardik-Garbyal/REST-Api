package com.internship.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.internship.entities.Students;
import com.internship.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentRepository studentrepository;
	
	@Override
	public List<Students> getAllStudents(){
		return studentrepository.findAll();
	}
	

	
	@Override
	public Students addStudent(Students s) {
		studentrepository.save(s);
		return s;
	}
	
	@Override
	public void deleteStudent(Integer rollno) {
		Students s = studentrepository.getReferenceById(rollno);
		studentrepository.delete(s);
	}

	@Override
	public Students updateStudent(Integer rollno,Students s) {
		s.setRollno(rollno);
		studentrepository.save(s);
		return s;
	}
	
	

}
