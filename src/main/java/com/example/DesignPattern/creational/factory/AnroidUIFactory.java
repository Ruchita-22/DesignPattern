package com.example.DesignPattern.creational.factory;

public class AnroidUIFactory implements UIFactory {

	@Override
	public Button createButton() {
		// TODO Auto-generated method stub
		return new AnroidButton();
	}

	@Override
	public Menu createMenu() {
		// TODO Auto-generated method stub
		return new AnroidMenu();
	}

}
