package com.example.DesignPattern.structural.decorator;

public class TuttyFrutty implements Icecream{
	private Icecream icecream;
	
	public TuttyFrutty(Icecream icecream) {
		this.icecream = icecream;
	}
	
	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return icecream.getCost() + 20;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return icecream.getDescription() + "TuttyFrutty ";
		
	}
}
