package com.example.services;

import java.util.List;
import java.util.Optional;

import com.example.model.Student;

public interface StudentServices  {
 
	public Student saveStudent(Student student);

	public  Optional<Student> getStudentid(Integer id);

public List<Student> getAllStudentid(Student student);
}
