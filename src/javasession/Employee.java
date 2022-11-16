package javasession;

public class Employee {
	
	//method and function both are same
	//data member: class variable and methods
	
	//can not create method inside a method/main method
	//methods are independent or parallel to each other
	
	//1. no input and n return:
	//void does not return anything
	public void test() {
		System.out.println("test method");
	}
	
	public void test1() {
		System.out.println("test1 method");
	}
	
	//2. some input and some return:
	//return type of this function: String
	public String getName() {
	System.out.println("get name");
	   String n="Tom";
	   return n;
	
	}
	
	public int calculation() {
		System.out.println("make calculation");
		int i=5;
		return i;
	}
	
	//two return statement back to back can not write
	public int add(){
		System.out.println("add numbers");
		int a = 100;
		int b = 200;
		int c = a + b;
		return c;	
	}
	
	 //3. some input and some return
	 
	public int sum(int x, int y) {   //input parameters- when you design method what you exatly pass here
		System.out.println("sum method");
		int total = x+y;
		return total;	
	}
	
	//WAF getMarks-----> input parameters: studentName (String)
	//return the student marks
	//If student name is not found -- return????
	//static int i= 90;
	public String  getMarks(String studentName) {
		System.out.println("getting studnet marks for: "+studentName);
	    
	    
		if (studentName.equals("Tom")) {
			return  "Jay";
			// int i= 90;
			//System.out.println("marks" + i);
			 
		}
		else if(studentName.equals("Ravi")) {
			return "shree";
		}
		else if(studentName.equals("Ahmed")) {
			return "Ahm";
		}
		else {
			System.out.println("student name is not found----" + studentName);
			return "not found";
	}
	}
	
	public static void main(String[] args) {
           Employee e = new Employee();   //design method
           e.test();  // calling method
           e.test1();
           String name= e.getName();
           System.out.println(name + 100);
           int i = e.calculation();
           System.out.println(i);
           
           
           
          //
           System.out.println(e.getName());
           
           int sum= e.sum(10,20); //method arguments- actual values we are passing
           System.out.println(sum);
           
          String k=  e.getMarks("vijay");
          System.out.println(k);
          // int totalMarks= m+5;
          // System.out.println(m+5);
          // System.out.println("marks" + i);
           
	}
          
	}
