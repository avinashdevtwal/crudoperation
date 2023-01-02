package com.example.demo.servicetest;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
//@ExtendWith(value = { StudentServicesTest.class })
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.dao.StudentRepositary;
import com.example.model.Student;
import com.example.services.StudentServiceImpl;
import com.example.services.StudentServices;
 
@ExtendWith(MockitoExtension.class) 
@SpringBootTest(classes = StudentServicesTest.class)
public class StudentServicesTest {
 
	@Mock
	private StudentRepositary repo;
	@InjectMocks
	private StudentServiceImpl service;
	
	@Test 
	public void getallstudenttest() {
		List<Student>students=new ArrayList<>();
		 students.add(new Student(1,"avinash", "dev", "geo", "957463"))	;
		 students.add(new Student(2,"ramesh", "dev", "geo", "957463"))	;
when(repo.findAll()).thenReturn(students);
	assertEquals(2, service.getAllStudentid(null).size());
	}
	
	
	@Test
	public void getonestudenttest() {
 Student students=new Student(1,"avinash", "dev", "geo", "957463");
 int id=2;
 when(repo.findById(id)).thenReturn( students);
 assertEquals(id,  service.getStudentid(id).getId());
	

 
	}
}
