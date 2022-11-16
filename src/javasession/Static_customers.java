package javasession;

public class Static_customers {
	
	String name;
	int age;
    static String comp_name;
	
	
	public void sendmail() {
		System.out.println("send mail");
	}
    
	public static void getinfo() {
		System.out.println("get info");
	}
	
	
	public static void main(String[] args) {
		
		Static_customers c = new Static_customers();
		c.name= "Jenny";
		c.age= 30;
		c.comp_name= "Amazon";
		System.out.println(c.name+ " "+ c.age+ " "+Static_customers.comp_name);
		System.out.println(comp_name);
		
		//how to access static methos
		//1. using class name:
		Static_customers.getinfo();
		
		//2. calling directly:
		getinfo();
		
		//3. using obj ref
		c.getinfo();
		
		//how to access non static methods- creatin object
		c.sendmail();
		
	
	}

}
