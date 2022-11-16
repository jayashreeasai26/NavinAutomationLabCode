package javasession;

public class constructor_pratice {
	
	//main puprose of constructor- to initialise the class variable
	// to avoid unnecessary creation of object
	
	String name;
	int age;
	String city;
	
	public constructor_pratice() {
		this("Vijay");
		System.out.println("call non par constructor");
	}
	
	public constructor_pratice(String name) {
		this("Sonu",25);
		this.name= name;
		System.out.println(name);
	}

	public constructor_pratice(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("name" + name   +  "age" +age);
		
		
	}
	
	
	public static void main(String[] args) {
		
		constructor_pratice c1= new constructor_pratice();
		constructor_pratice c2= new constructor_pratice("Jay");
		constructor_pratice c3= new constructor_pratice("Jayas", 29);
		
		

	}
	
	

}
