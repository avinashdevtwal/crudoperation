package com.example.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.StudentRepositary;
import com.example.exceptionhandel.ResourcenotfountException;
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
	public List<Student> getAllStudentid(Student student) {
		return  studentrepositary.findAll();
	}



	@Override
	public Student getStudentid(Integer id) {
		
		return studentrepositary.findById(id).orElseThrow(()->new ResourcenotfountException("user not found "+id));
				
	}



	@Override
	public void deletestudentbyid(Integer id) {
			 studentrepositary.deleteById(id); 
 
	}



	@Override 
	@Transactional
	public Student updatestudentbyid(Integer id) {
	Student update	=studentrepositary.findById(id).orElseThrow( ()->new ResourcenotfountException("student not found: "+id));
	return update;
 

	
	}

	

	



	

}
