package com.example.DesignPattern.structural.decorator;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Icecream ic = new OrangeCone();
		ic = new ChocolateSyurp(ic);
		ic = new ChololateCone(ic);
		ic = new BlackCurrentScoop(ic);
		ic = new ButterscochScoop(ic);
		ic = new Chocochip(ic);
		ic = new ChocolateSyurp(ic);
		ic = new TuttyFrutty(ic);
		
		System.out.println(ic.getDescription());
		System.out.println(ic.getCost());

	}

}
