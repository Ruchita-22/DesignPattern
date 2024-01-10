package com.example.DesignPattern.structural.decorator;

public class BlackCurrentScoop implements Icecream{
	private Icecream icecream;
	
	public BlackCurrentScoop(Icecream icecream) {
		this.icecream = icecream;
	}
	
	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return icecream.getCost() + 50;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return icecream.getDescription() + "BlackCurrentScoop ";
		
	}
}
