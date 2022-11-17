package com.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.student.entity.Student;
import com.student.repository.StudentRepository;

@RestController
public class StudentRestController {
	
	@Autowired
	private StudentRepository studentRepo;
	
	
	@GetMapping("/student")
	public List<Student> getStudents(){
		List<Student> students = studentRepo.findAll();
		return students;
	}
	
	@PostMapping("/student/save")
	public void saveStudentRecord(@RequestBody Student student) {
		studentRepo.save(student);
	}
	
	@PutMapping
	public void updateStudentRecord(@RequestBody Student student) {
		studentRepo.save(student);
	}
	
	@DeleteMapping("/student/delete/{id}")
	public void deleteStudentData(@PathVariable("id") long id) {
		studentRepo.deleteById(id);
	}

}
