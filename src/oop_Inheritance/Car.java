package oop_Inheritance;

public class Car extends Vehicle{
	
	int speed= 100;
	static final int wheels = 4;
	static int testlevel= 6;
	
	
	
	//final: can not override final method
	//to prevent method overrridding
	//public final void start()
	//final variable can be use for class variable also
	
	
	//private method can not be overriden
	
	public void start() {
		System.out.println("car--- start");
	}
	
	public void stop() {
		System.out.println("car--- stop");
	}
	
	public void refuel() {
		System.out.println("car--- refue");
	}
	
	public static void billing() {
		System.out.println("car---billing");
	}

}
