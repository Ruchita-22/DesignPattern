package com.example.DesignPattern.creational.factory;

public class IOSUIFactory implements UIFactory{

	@Override
	public Button createButton() {
		// TODO Auto-generated method stub
		return new IOSButton();
	}

	@Override
	public Menu createMenu() {
		// TODO Auto-generated method stub
		return new IOSMenu();
	}

}
