package javasession;

public class StringContacination {
	
	public static void main (String[]args) {
	int a=100;
	int b=200;
	
	System.out.println(a+b);
	
	String x= "hello";  //String is a class in java
	String y= "world";
	
	double d1= 12.33;
	double d2= 12.44;
	
	char c1= 'a';
	char c2= 'b';
	
	System.out.println(x+y);   //helloworld
	System.out.println(a+x);    //100hello
	System.out.println(x+a);     //hello100
	System.out.println(x+y+a+b);   //helloworld100200
	
	System.out.println(a+b+x+y);    //300helloworld
	
	System.out.println(x+y+(a+b));    //helloworld300
	
	System.out.println("hello worl naveeen");   //hello worl naveeen
	System.out.println("the value of a: "+a);    //the value of a: 100
	System.out.println("the value of b: "+b);    //the value of b: 200
	System.out.println("the sum is: "+(a+b));    //the sum is: 300
	System.out.println("hello" + (a+b) + "world");
	System.out.println(x+= y);
	
	System.out.println(a+b+x+y+a+b);             //300helloworld100200
	
	System.out.println(x+y+d1+d2);
	System.out.println(x+c1);
	System.out.println(x+(int)c1);
	System.out.println(x+y+(c1+c2));    //helloworld195
	System.out.println(x+(int)c1);
			
	}

}
