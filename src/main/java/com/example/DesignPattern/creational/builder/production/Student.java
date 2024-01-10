package com.example.DesignPattern.creational.builder.production;

import lombok.Getter;

public class Student {
			
	String name;
	int age;
	double psp;
	String universityName;
	String batch;
	long id;
	int gradYear;
	String phoneNumber;
	
	public static Builder getBuilder(){
		return new Builder();
	}
	/* Student construction is private so cant be called directly
	 * now student obj is created via build method only
	 * To call the build menthod we need Builder class obj
	 * as Builder class inside Student class so to get the obj of Bulder class we need to call getBuilder menthod 
	 * to call this either we need student class object so made getBuilder as static method 
	 * 
	 * 
	 * 
	 * */
	private Student(Builder builder) {
		//used to build the Student obj
		if(builder.getGradYear()>2022) {
			throw new IllegalArgumentException("Wrong graduation year");
		}
		this.name = builder.getName();
		this.age = builder.getAge();
		this.gradYear = builder.getGradYear();
		
	}
	@Getter
	static class Builder {
		String name;
		int age;
		double psp;
		String universityName;
		String batch;
		long id;
		int gradYear;
		String phoneNumber;

		public Builder setName(String name) {
			this.name = name;
			return this;
		}
		public Builder setAge(int age) {
			this.age = age;
			return this;
		}
		public Builder setPsp(double psp) {
			this.psp = psp;
			return this;
		}
		public Builder setUniversityName(String universityName) {
			this.universityName = universityName;
			return this;
		}
		public Builder setBatch(String batch) {
			this.batch = batch;
			return this;
		}
		public Builder setId(long id) {
			this.id = id;
			return this;
		}
		public Builder setGradYear(int gradYear) {
			this.gradYear = gradYear;
			return this;
		}
		public Builder setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
			return this;
		}	
		public Student build() {
			if(getGradYear()>2022) {
				throw new IllegalArgumentException("Grad year can't be after 2022");
			}
			return new Student(this);
		}
		
	}

	
	
	
	
	
}
