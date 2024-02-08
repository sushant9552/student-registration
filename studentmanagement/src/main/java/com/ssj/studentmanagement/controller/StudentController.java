package com.ssj.studentmanagement.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ssj.studentmanagement.dto.Student;
import com.ssj.studentmanagement.repository.StudentRepository;

@RestController
public class StudentController {
	
	@Autowired
	StudentRepository repo;
	
	
	@PostMapping("/welcome")
	public String welcome() {
		return "Welcome to Student Registration Form!!";
	}
	
	//insert data into db
	
	@PostMapping("/savestudent")
	public String saveStudent(@RequestBody Student s) {
		
		repo.save(s);
		return "Student Added Successfully";
	}
	
	@GetMapping("/allstudent")
	public List<Student> allStudents(){
		
		List<Student> list = repo.findAll();
		if(list.size() != 0) {
			return list;			
		}
		return null;
	}
	
	

}
