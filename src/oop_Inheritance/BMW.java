package oop_Inheritance;

public class BMW extends Car{   //extend is keyword so its always in small letter(e)
	//child class extends parent class
	
	int speed = 200; //update own speed
	//overriding concept is for methods not variables
	int testlevel= 5;
	

	//Method overriding: poly + morphism (Run time polymorphism)
	//override from parent
	//when you have a method in parent class and same method is in child class with: 
	//1. with same method name
	//2. same number of parameters
	//we can not override private method-- it is hidden, its access only within the class
	//
	
	//Method Overloading:
	//overloading happend within same class with same name and different parameter but the sequence of parameter should be different
	
	
	
	@Override
	public void start() {
		System.out.println("BMW--- start");	
	} 
	
	public void autoParking() {
		System.out.println("car--- autoParking");
	}
		
	//Method hiding: create one static method in a parent class and same static method can create in child class
		public static void billing() {
			System.out.println("car---billing");
		}
		
		
	}



