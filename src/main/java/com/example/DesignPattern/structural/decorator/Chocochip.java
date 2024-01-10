package com.example.DesignPattern.structural.decorator;

public class Chocochip implements Icecream{
	private Icecream icecream;
	
	public Chocochip(Icecream icecream) {
		this.icecream = icecream;
	}
	
	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return icecream.getCost() + 10;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return icecream.getDescription() + "Chocochip ";
		
	}
}
