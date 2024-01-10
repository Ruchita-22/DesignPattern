package com.example.DesignPattern.creational.builder.normal;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Builder builder = new Builder();
		builder.setName("Ruchita");
		builder.setAge(29);
		builder.setGradYear(2017);
		Student student= new Student(builder);
		System.out.println(student);
		System.out.println("debug");
		
		

	}

}
