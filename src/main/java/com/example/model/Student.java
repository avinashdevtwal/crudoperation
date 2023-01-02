package com.example.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
 @Id 
 @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id; 
	private String firstname; 
	private String lastname; 
	private String city; 
	private String mobno;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getMobno() {
		return mobno;
	}
	public void setMobno(String mobno) {
		this.mobno = mobno;
	}
	public Student(int id, String firstname, String lastname, String city, String mobno) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.city = city;
		this.mobno = mobno;
	}
	public Student() {
		super();
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", city=" + city
				+ ", mobno=" + mobno + "]";
	}
}