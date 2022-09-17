package com.example.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.StudentRepositary;
import com.example.model.Student;
@Service
public class StudentServiceImpl implements StudentServices {
	@Autowired
	StudentRepositary studentrepositary;

	@Override
	public Student saveStudent(Student student) {
		return studentrepositary.save(student);
		 
	}

	@Override
	public Optional<Student> getStudentid(Integer id) {
		return studentrepositary.findById(id);
		
	}

	@Override
	public List<Student> getAllStudentid(Student student) {
		return  studentrepositary.findAll();
	}

	

	



	

}
