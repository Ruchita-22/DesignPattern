package com.example.DesignPattern.structural.decorator;

public class ButterscochScoop implements Icecream{
	private Icecream icecream;
	
	public ButterscochScoop(Icecream icecream) {
		this.icecream = icecream;
	}
	
	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return icecream.getCost() + 30;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return icecream.getDescription() + "ButterscochScoop ";
		
	}
}
