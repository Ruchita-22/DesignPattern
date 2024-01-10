package com.example.DesignPattern.creational.factory;

public class Flutter {
	public void createTheme() {
		// TODO Auto-generated method stub
		System.out.println("Creating Theme");
	}
	public void setRefreshRate() {
		// TODO Auto-generated method stub
		System.out.println("Setting Refresh Rate");
	}
	public UIFactory createUIFactory(String params) {
		if(params.equals("Anroid"))
			return new AnroidUIFactory();
		else if(params.equals("Ios"))
			return new IOSUIFactory();
		else 	
			return null;
	}
}
