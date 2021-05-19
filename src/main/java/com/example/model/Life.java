package com.example.model;


public class Life {
 private String name;
 private int age;
 private String status;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public Life(String name, int age, String status) {
	super();
	this.name = name;
	this.age = age;
	this.status = status;
}
public Life() {
	super();
	
}
 
}
