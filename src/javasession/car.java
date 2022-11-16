package javasession;

public class car {

	
	//instance class car
	//default value of string is null
	//default value of integer is zero
	//default value of boolean is false
	
	
	//Object always ceated inside heap memory
	//object name is stored stack memroy
	
	
	String name;  // when we create object then java will create photocopy of this object
	int price;    // java create photocopy for this object by object reference
	String color;
	boolean isAutomatic;
	
	
	public static void main(String[] args) {
		
		//create object of the class using new keyword
		
		car c1= new car();     //c1= object name and new car() is object.
		                     // type of this object is car referred by c1.
		
		c1. name= "BMW";
		c1.price= 40;
		c1.color= "white";
		c1.isAutomatic= true;
		
		System.out.println(c1.name + "" +c1.price + " " +c1.color);
		System.out.println(c1.price);
		
		car c2= new car();
		c2.name= "Audi";
		c2.isAutomatic= true;
		
		
		System.out.println(c2.name);
		System.out.println(c2.price);
		System.out.println(c2.color);
		System.out.println(c2.isAutomatic);
		
		//no reference object// below 4 objct is created, its start creating unnecessor object inside memory
		// dis - 
		new car().name= "honda";
		new car().price= 20;
		new car().color= "red";
		new car().isAutomatic= false; 
		
		
		//Null reference object
		
		//car t1= new car();
		//t1=null;
		//t1.name= "bmw 5";
		//System.out.println(t1.name);   //o/p- null pointer exception- refrence is pointing to null
		
		car t2= null;
		t2.name= "Jayas";// NPE
		System.out.println(t2.name);
		
		
         // Garbage Collector= GC give instruction from JVM. JVM checking what is the heap size
	     //JVM send instruction to GC-
		// GC- collect garbage, will destroy all those object which are having null reference or no reference
	    //JVM keep monitor what is happening in heap memory.
		// GC is only applicable for Heap size
		//Java having own GC and its dynamic in nature
		
		//systme.gc(); // call GC manually- programatically
	}

}
