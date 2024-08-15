package com.hos.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="PATIENT")
public class Patient {
  
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private int id;
  private String name;
  private String age;
  private String phone_number;
  private String email;
  private String gender;
  private String address;
  private String department;
  private String medical_history;
  private String password;
  private String user_role;
  private int doctor_id;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getAge() {
	return age;
}

public void setAge(String age) {
	this.age = age;
}

public String getPhone_number() {
	return phone_number;
}

public void setPhone_number(String phone_number) {
	this.phone_number = phone_number;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getGender() {
	return gender;
}

public void setGender(String gender) {
	this.gender = gender;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public String getDepartment() {
	return department;
}

public void setDepartment(String department) {
	this.department = department;
}

public String getMedical_history() {
	return medical_history;
}

public void setMedical_history(String medical_history) {
	this.medical_history = medical_history;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public String getUser_role() {
	return user_role;
}

public void setUser_role(String user_role) {
	this.user_role = user_role;
}

public int getDoctor_id() {
	return doctor_id;
}

public void setDoctor_id(int doctor_id) {
	this.doctor_id = doctor_id;
}
  
}
