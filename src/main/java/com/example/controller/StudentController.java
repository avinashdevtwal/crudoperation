package com.example.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Student;
import com.example.services.StudentServices;

@RestController 
@RequestMapping("/student")
public class StudentController {
  @Autowired
	StudentServices studentservices;
	 
 @PostMapping("/save")
 public ResponseEntity<Student> saveStudent(@RequestBody Student student) {
		Student student1=studentservices.saveStudent(student);
		return ResponseEntity.ok().body(student1);
 }	
 @GetMapping("/get")
 public List<Student> getAllStudentid(@RequestBody Student student){
	 return studentservices.getAllStudentid(student);
 } 
 	 
 
 @GetMapping("/get/{id}")
public ResponseEntity<Student> getStudentid(@PathVariable("id")Integer id){
Student student1= studentservices.getStudentid(id);
	 return ResponseEntity.ok().body(student1) ;
 }	 
	 @DeleteMapping("/delete/{id}")
	 public void detetestudentbyid(@PathVariable("id") Integer id){
		studentservices.deletestudentbyid(id) ;
 
 
	 }
  @PutMapping("/update/{id}")
	public Student updatestudentbyid(@RequestBody Student student, @PathVariable("id")Integer id) {
	Student existing = studentservices.getStudentid(id);
	existing.setFirstname(student.getFirstname()); 
	existing.setLastname(student.getLastname()); 
	existing.setCity(student.getCity()); 
	existing.setMobno(student.getMobno());
	  return studentservices.saveStudent(existing);
	 
	 
	}
	 
}