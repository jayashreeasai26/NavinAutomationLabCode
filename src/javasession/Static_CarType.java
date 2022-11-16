package javasession;

public class Static_CarType {
	
	//Static-- static is used with static keyword
	//static- properties values are same those are static properties
	//non static- properties values are different those are non static properties
	//prepertiy of static- if we declare variable with static, java will not create photocopy of static
	//for static- there is a seperate memory- common memory allocation
	//area name- permanent generation , after jdk 1.8 remnae as Metaspace
	//static is applicable for class template variable
	//inside method variable is declare is called local variable
	//
	
	
	String name;
	int price;
	String Platenumber;
	 int wheels;

	public static void main(String[] args) {
		
		Static_CarType c1= new Static_CarType();
			c1.name= "BMW";
			c1.price= 50;
			c1.Platenumber= "MH0125";
			c1.wheels= 4;
			
			System.out.println(c1.name+ " "+ c1.price+ " "+ c1.Platenumber+ " "+c1.wheels);
			
			Static_CarType c2= new Static_CarType();
			c1.name= "Audi";
			c1.price= 40;
			c1.Platenumber= "MH0125";
			c1.wheels= 4;
			
			Static_CarType c3= new Static_CarType();
			c1.name= "Honda";
			c1.price= 350;
			c1.Platenumber= "MH0125";
			c1.wheels= 4;
			
	
	}
}
