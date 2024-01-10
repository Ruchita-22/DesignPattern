package com.example.DesignPattern.creational.factory;

public class Client {
	public static void main(String[] args) {
		Flutter flutter = new Flutter();
		UIFactory uiFactory = flutter.createUIFactory("Anroid");
		Button  button = uiFactory.createButton();
		Menu menu = uiFactory.createMenu();
		button.changeSize();
		menu.setMenu();
		
		
	}
}
