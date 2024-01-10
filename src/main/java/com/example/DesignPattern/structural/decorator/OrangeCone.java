package com.example.DesignPattern.structural.decorator;

public class OrangeCone implements Icecream{
	private Icecream icecream;
	
	public OrangeCone() {
		
	}
	
	public OrangeCone(Icecream icecream) {
		this.icecream = icecream;
	}
	
	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		if(icecream==null)
			return 10;
		else
			return icecream.getCost() + 10;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		if(icecream==null)
			return "OrangeCone ";
		else
			return icecream.getDescription() + "OrangeCone ";
		
	}

}
