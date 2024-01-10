package com.example.DesignPattern.creational.prototype;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Student implements Prototype{
	private String name; 
	private int age;
	private String batchName;
	private double studentPsp;
	private double averageBatchPsp;

	public Student clone() {
		Student student = new Student();
		student.averageBatchPsp = this.averageBatchPsp;
		student.batchName = this.batchName;
		return student;
		
	}
}
