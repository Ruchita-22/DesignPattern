package com.example.DesignPattern.structural.decorator;

public class ChocolateScoop implements Icecream{
	private Icecream icecream;
	
	public ChocolateScoop(Icecream icecream) {
		this.icecream = icecream;
	}
	
	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return icecream.getCost() + 40;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return icecream.getDescription() + "ChocolateScoop ";
		
	}
}
