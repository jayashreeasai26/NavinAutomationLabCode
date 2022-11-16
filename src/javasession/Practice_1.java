package javasession;

public class Practice_1 {

	public static void main(String[] args) {
		
		//size- 1 bye= 8 bit
		//range -128 to 127
//           byte b= 13;
//           byte b1= 1;
//           int total= b+b1;
//           System.out.println(total);
//           
           //size: 2 byte= 2*8= 16 bits
//           short sh= 1254;
//           System.out.println(sh);
//           
//           int i= 12;
//           int i1= 2;
//           int minus= i1-i;
//           System.out.println(minus);
//           
//           
//           long L = 1203245454525463258L;
//           System.out.println(L);
//           
//           float f= 12.33F;   //size 4 byte= 4*8= 32 bits
//           System.out.println(f);
//           float f1= (float) 12.335;
//           System.out.println(f1);
//           float f2= -0.0f;
//           System.out.println(f2);
//           
//           
//           double d = 12.254566874676878979846578798356898976532;
//           System.out.println(d);
//           double d1 = -123.33d;
//           System.out.println(d1);
//           double d2= 1.1;
//           System.out.println(d2);
//           double d3= -00.01;
//           System.out.println(d3);
//           
//           
//           char ch = 'a';//ASCII value of a= 97
//           System.out.println(ch);
//           char ch1 = 'b'; //ASCII value of b= 98
//           System.out.println(ch1);
//           char c2= '%';
//           System.out.println(c2);
//           char ch2= '%';
//           char ch3= '$';
//           System.out.println(ch2+ch3+ch);
//           System.out.println(ch+ch1);
//           char c9= '0';
//           char c8= '9';
//           System.out.println(c9+c8);
//           
           //ASCII range:
          // a to z= 97 to 122
           // A to Z= 65 to 90
           // 0 to 9= 48 to 57
           
          //tell me exact ASCII value of specific character
//          System.out.println((int)'a');
//          System.out.println((int)c2);
//          System.out.println((short)ch3);
//          char cc= 'Z';
//          System.out.println((int)'Z');
//          
//           char gender = 'm';
//           char currency = '$';
//           
//           //boolean: true/false
//           //size: ~1 bit only
//           boolean bl1 = true;
//           boolean b2= false;
//           
//           System.out.println(bl1);
//           System.out.println(true);
//           
           //ARithmatics operation
//           System.out.println(8/2);
//           System.out.println(9/2);
//           System.out.println(8.0/2);
//           System.out.println(9/2.0);
//           System.out.println(9./2.0);
//           
           //System.out.println(90/0);  // Arithmetic exception- any pure numeric number is devided by zero
          // System.out.println(0/0);     // Arithmetic exception- any pure numeric number is devided by zero
           
//           System.out.println(9.0/0);   //Infinity
//           
//           
//           System.out.println(0/0.0);    //o/p- NaN- Not a number
//           System.out.println(0.0/0.0);   
//           System.out.println(0.0/0);
//           System.out.println(9/0.0);    //Infinity
//           System.out.println(9/-1);
//           System.out.println(-1/9);
//           //System.out.println(10/0 + "hello");// Arithmetic exception
           //System.out.println("hello" + 19/0);  // arithmetic exception
//           String l= "First";
//           String j= "Second";
//           System.out.println(10/0.0 + "hellow");
//           System.out.println(0/0.0 + "hellow");
//           System.out.println(l +" "+ j);
//           System.out.println(l + ' '+ j);
//           char c= 'a';
//           System.out.println(200/c);
   
          //Typecasting
		    //1. widening- conversion of lower data type to higher data type
		
//		byte b= 2;
//		short s= b;
//		int i = b;
//		long l = b;
		
//		short sh= 200;
//		long l1= sh;//lower to highr
//		long l2= 767899;
//		double d1= l1;
//		
//		System.out.println(b);
//		System.out.println(s);
		
		//Narrowing- conversion of higher data type to lower data type
//		int p = 100;
//		short sh= (short)p;
//		byte b1= (byte) p;
		
		//double d6= 95679788;
		//byte b4= (byte)d6;
//		
//		System.out.println(sh);
//		System.out.println(b1);
//		
//		byte m = 100;
//		byte n = 114;
//		int t1= m+n;
//		byte t = (byte) (m+n);
//		System.out.println(t);
//		System.out.println(t1);
	
		
//		char c = 98;
//		System.out.println(c);
		
        
//		Conditional Operator
		//If Else
		
//		int i =10;
//		int j = 25;
//		
//		if (i>=j) {
//			System.out.println("printed");
//		}
//		else {
//			System.out.println("not printed");
//			
//			
//			if(10<25) {
//				System.out.println("greter vaue");
//			}
//			else {//dead code
//				System.out.println("less");
//			}
//			
//			int k= 70;
//			//int l= 60;
//			if(k>=110 || k<=100) {
//				System.out.println("yes");
//			}
//			else {
////				System.out.println("No");
//			}
//				
//			int total = 200;
//			if(total<300) {
//				System.out.println();
//			}
			
			
			//Req- take a browser- ff/safari/chrome/IE
			//if condition is match the launch browser
			
//			String browser= "Chrome";
//			if(browser.equals("Chrome")) {
//				System.out.println("launch a browser");
//			}
//			if (browser.equals("firefox")) {
//				System.out.println("launch firefox");
//			}
//			if(browser.equals("IE")) {
//				System.out.println("launch IE");
//			}
//			else {
//				System.out.println("pass right browser...."+browser);
//			}
		
		//if - else if 
		//take a browser value ch//safari/firefox,chrome
		//if condition is match then launch the briwser
		//else print a mgs: pass right browser
		
//		String browserName= "opera";
//		if (browserName.equals("chrome")) {
//			System.out.println("launch chrome");
//		}
//		else if (browserName.equals("safari")) {
//			System.out.println("launch safari");
//		}
//		else {
//			System.out.println("pass right browser");
//		}
		
		//if else if
		//take a shoe brand
		//if condition is correct then disply the search result
		//else part executed
		
//		String shoeBrand= "Paragon";
//		if(shoeBrand.equals("Puma")) {
//			System.out.println("display puma");
//		}
//		else if(shoeBrand.equals("Nike"))
//		{
//			System.out.println("display Nike");
//		}
//		else {
//			System.out.println("serach right shoe brand");
//		}
		
			
		
		//Switch Case statement:
		//switch case is come due to optimize this performance issue, that we execute the unnecessar code of if else statement.
			
//		String Browser = "Opera";
//		
//		switch (Browser) {
//		case "Chrome":
//			System.out.println("lauch chrome");
//			break;
//			case "Safari":
//			System.out.println("lauch safari");
//			break;
//		case "Firefox":
//			System.out.println("lauch Firefox");
//			break;
//		case "IE":
//			System.out.println("lauch IE");
//			break;
//			
//		default:
//			System.out.println("pass right browser");
//			break;
//		}
		
		//Take one Shirt size= small, medium, large, extra large
		//if Shirt size is matche the result is display
		///else display else part
		//switch statement is used with only int and string type
//		int Number= 44;
//		String size;
//		switch (Number) {
//		case 28:
//	        System.out.println("size small");
//			break;
//			case 35:
//		        System.out.println("size medium");
//				break; 
//				case 44:
//			        System.out.println("size large");
//					break; 
//					case 50:
//				        System.out.println("size extra large");
//						break;
//		default:
//			System.out.println("correct the sizze");
//			break;
//		}
		
		//LOOP: repetative execution: 
		
		int i =2;
		while(i<10) {
			//System.out.println(i);// 1 infinity times
			i++;
			System.out.println(i);
			i++;
			i=i+1;
		}
		// 1 to 10------ 1, 3, 5, 7, 9----odd number
		int j = 1;
		while(j<=10){
			System.out.println(j);
			j=j+2;
		}
		
		System.out.println("-----------------------------");
		
		//Infinite Loop
		while(true) {
			System.out.println("welcome to home");
			break;
		}
		
		//Use case:
		//2. for Loop:
		//1 to 10:
		int t= 1;
		
		for(t=1;t<=10; t++) {
			System.out.println(t);
			if(t==5) {
				break;
			}
			
//			for(;;) {
//				System.out.println("bye");
//			
//			
//		}
			
		
		for(byte h= 1; h<=10; h++) {
			System.out.println("say hi");
			
			for (double f=1; f<=10; f++)
				System.out.println("f");
			
			for (char ch='a'; ch<='z'; ch++)
				System.out.println(ch+ ":" + (int)ch);
			
		}
		
		//print 10 to 1:
		int y=10;
		for (int u=10; u<=10; u-- ) {
			System.out.println(u);
		}
		y--;
	}
		
		//ArrayList Concept
	// Arraylist--default class
		//vartual capacity means actual size of array
		//VC= actual size of array
		
		
	}
}
		
				
	
		
		
		
	
	
		
		
		
	

