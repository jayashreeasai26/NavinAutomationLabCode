package javasession;

public class Constructor_employeetype {
	
	String name;
	int age;
	double salary;
	
	//constructor of class
	//const name is same as class name but function name can be anything
	//const can not return anything but function may return or may not be
	//const: no void keyword
	//const: will be called when you create object but function will be called with objec ref name
    //constructor is executed at object creation time
	
	
	//Function
	public void test() {
		System.out.println("test method");
	}
	
	//const overloading
	public Constructor_employeetype() {
		this(10);
		System.out.println("Default const");
		
	}
	
	public Constructor_employeetype(int i) {
		System.out.println("with one parameter");
		
	}
	

	public Constructor_employeetype(int a, String b) {
		System.out.println("with two parameter");
	}
	
	public Constructor_employeetype(int a, String b, double salary) {
		System.out.println("with two parameter");
	}
	
	public static void main(String[] args) {
		Constructor_employeetype c1= new Constructor_employeetype();
		Constructor_employeetype c2= new Constructor_employeetype(10);
		Constructor_employeetype c3= new Constructor_employeetype(10, "Jay", 25000.00);
		
		c1.test();
		
	}
}
