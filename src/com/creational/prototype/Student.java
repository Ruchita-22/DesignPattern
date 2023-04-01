package com.creational.prototype;

public class Student implements Prototype{
	private String name; 
	private int age;
	private String batchName;
	private double studentPsp;
	private double averageBatchPsp;
	
	
	
	public String getName() {
		return name;
	}



	public int getAge() {
		return age;
	}



	public String getBatchName() {
		return batchName;
	}



	public double getStudentPsp() {
		return studentPsp;
	}



	public double getAverageBatchPsp() {
		return averageBatchPsp;
	}



	public void setName(String name) {
		this.name = name;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public void setBatchName(String batchName) {
		this.batchName = batchName;
	}



	public void setStudentPsp(double studentPsp) {
		this.studentPsp = studentPsp;
	}



	public void setAverageBatchPsp(double averageBatchPsp) {
		this.averageBatchPsp = averageBatchPsp;
	}



	public Student clone() {
		Student student = new Student();
		student.averageBatchPsp = this.averageBatchPsp;
		student.batchName = this.batchName;
		return student;
		
	}
}
