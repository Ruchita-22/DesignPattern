package com.example.DesignPattern.creational.builder.production;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Student student = Student.getBuilder()
				.setName("Ruchita")
				.setAge(29)
				.setGradYear(2017)
				.build();
		System.out.println(student);
		System.out.println("debug");
		
		

	}

}
