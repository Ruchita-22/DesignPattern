package com.example.DesignPattern.creational.builder.normal;

public class Student {
			
	String name;
	int age;
	double psp;
	String universityName;
	String batch;
	long id;
	int gradYear;
	String phoneNumber;
	
	public Student(Builder builder) {
		// TODO Auto-generated constructor stub
		if(builder.getGradYear()>2022) {
			throw new IllegalArgumentException("Wrong graduation year");
		}
		this.name = builder.getName();
		this.age = builder.getAge();
		this.gradYear = builder.getGradYear();
		
	}
	
	
	
}
