package com.example.DesignPattern.structural.decorator;

public class ChocolateSyurp implements Icecream{
	private Icecream icecream;
	
	public ChocolateSyurp(Icecream icecream) {
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
		return icecream.getDescription() + "ChocolateSyurp ";
		
	}
}
