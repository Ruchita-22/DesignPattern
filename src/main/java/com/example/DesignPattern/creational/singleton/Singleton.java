package com.example.DesignPattern.creational.singleton;

import java.util.concurrent.locks.Lock;

//https://refactoring.guru/design-patterns/singleton

public class Singleton {
	// Issue :  We can create multiple obj
	// Sol : Make constructor private so can't create object from anywhere
	private Singleton() {
		// TODO Auto-generated constructor stub
	}
	
	// object created via method
	
	public Singleton getInstance1() {
		Singleton s = new Singleton();
		return s;
	}
	
	// Issue: to call this method we first need to create object and then the method is call from other class
	// Sol :  make method static so can be called by class name
	
	public Singleton getInstance2() {
		Singleton s = new Singleton();
		return s;
	}	
	
	// Issue : but now also object is created again and again 
	// Sol : so we do null check and make s also private so can't access outside class and static so not depend on object

	private static Singleton s3 = null;
	public static Singleton getInstance3() {
		if(s3 == null) {
			s3 = new Singleton();
		}
		return s3;
	}


/* we cant make s as final becz final variable should be initialize at the time of declaration only after that we cant change 
	private static final Singleton s = new Singleton();
	we should not do this also becz we should not create object untill it is required.
*/
	// Issue : so far this implementation is not thread safe
	// Sol :  we do early initialization
	// Now this is thread save even if 2 thread are going in get instance so returning same obj
	
	private static final Singleton s4 = new Singleton();
	public static Singleton getInstance4() {
		return s4;
	}
	
	// Issue :  suppose you have 10 singleton class and then eager intialization of obj inc the application startup time 
	// Req :  lazy initialization, obj created only when required and work in concurrent environment
	// Sol : make method synchronized 
	private static Singleton s5 = null;
	public synchronized static Singleton getInstance5() {
		if(s5 == null)
			s5 = new Singleton();
		return s5;
	}
	// Issue :  one thread will go getInstance method at a time so performance will go down
	// Sol :  make creation logic in synchronized block
	private static Singleton s6 = null;
	public static Singleton getInstance6() {
		if(s6 == null) {
			synchronized (Singleton.class) {
				s6 = new Singleton();
			}	
		}	
		return s6;
	}
	// Issue: t1 and t2 go to line 63 for both s6 is null so go in synchronized block and create object one by one
	// Sol : check again if s6 is null or not, double check locking mech. 
	
	public static Singleton getInstance7() {
		if(s6 == null) {
			synchronized (Singleton.class) {
				if(s6 == null) {
					s6 = new Singleton();
				}
			}	
		}	
		return s6;
	}
	/*	 Advantage
	 * 
	 * 	 You can be sure that a class has only a single instance.
		 You gain a global access point to that instance.
		 The singleton object is initialized only when it’s requested for the first time.
		 
		 Disadvantage
		 Violates the Single Responsibility Principle. The pattern solves two problems at the time.
		 The Singleton pattern can mask bad design, for instance, when the components of the program know too much about each other.
		 The pattern requires special treatment in a multithreaded environment so that multiple threads won’t create a singleton object several times.
		 It may be difficult to unit test the client code of the Singleton because many test frameworks rely on inheritance when producing mock objects. Since the constructor of the singleton class is private and overriding static methods is impossible in most languages, you will need to think of a creative way to mock the singleton. Or just don’t write the tests. Or don’t use the Singleton pattern.
		 

	 * */
}	
	 