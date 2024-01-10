package com.example.DesignPattern.creational.prototype;

public class Client {
	
	
	public static void fillRegistry(StudentRegistry studentRegistry) {
		 Student apr22Student = new Student();
	        apr22Student.setBatchName("Apr22");
	        apr22Student.setAverageBatchPsp(85.0);

	        //Inserting the template in the registry
	        studentRegistry.register("Apr22", apr22Student);

	        Student may22Student = new Student();
	        apr22Student.setBatchName("May22");
	        apr22Student.setAverageBatchPsp(90.0);
	        studentRegistry.register("May22", may22Student);

	        IntelligentStudent intelligentStudent = new IntelligentStudent();
	        intelligentStudent.setBatchName("Jun22");
	        intelligentStudent.setAverageBatchPsp(85.0);
	        studentRegistry.register("intelligentStudentPrototype", intelligentStudent);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentRegistry studentRegistry = new StudentRegistry();
		fillRegistry(studentRegistry);
		Student studentPrototype = studentRegistry.get("Apr22");
        Student shantanu = studentPrototype.clone();
        shantanu.setName("Shantanu");
        shantanu.setAge(24);
        shantanu.setStudentPsp(80.0);

        Student asha = studentPrototype.clone();
        asha.setName("Asha");
        asha.setAge(24);
        asha.setStudentPsp(81.0);
        asha.setBatchName("April 22");

        Student rapheal = studentRegistry.get("May22").clone();
        rapheal.setName("Raphael");
        rapheal.setAge(25);
        rapheal.setStudentPsp(82.0);
	}

}
