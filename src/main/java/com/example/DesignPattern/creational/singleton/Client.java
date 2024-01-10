package com.example.DesignPattern.creational.singleton;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Singleton s = new Singleton();
		// to avoid the obj creation again and again, make constructor private
		
		
		Singleton s = Singleton.getInstance7();
		
		
	}

}
