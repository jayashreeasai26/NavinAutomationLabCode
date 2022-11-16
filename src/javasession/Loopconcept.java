package javasession;

public class Loopconcept {
	public static void main(String[] args) {
		
		//1 to 10
		//1. while loop: start loop, first check the condition and execute the statement
		
		int i= 1;
		while(i<10) {
			System.out.println(i);
		    //i++;
			++i;
			//i= i+1;
			
			
		}
		
		//1 to 10: 0 2 4 6 8 10
		
		int e= 0;
		while(e<10) {
			System.out.println(e);
			e=e+2;
		}
//  print odd number
		int f=0;
		while(f<10) {
			System.out.println(f);
			f=f+3;
		}
		
		System.out.println("------------------------");
		//infinite loop
		while(true) {
			System.out.println("....welcome to taj hotel");
			break;
		}
		
		//print 1 to 100
		//multiplication of 5 --- print hi
		
		int k=1;
		while(k<=100) {
			System.out.println(k);
			   if(k% 5 == 0) {
				   System.out.println("hii");
			   }
			   if (k==50) {
				   System.out.println("half century");
			   }
			   k++;
		}
		
		//Use cases of while loop
		//when number of iterations are not fixed(ex: pagination: 1st day there are 2 page, then 20 page)
		//page loading time- every time page loading will take time but we dont every time how it will take
		
		//2. for loop
		//any loop can generate the infinite loop
		//print to 10

		for(int t=1; t<=10;t++ ){
			System.out.println(t);
			if(t==5) {
				break;
				
			}
		}
			
		//if we don't put any condition on for loop, then it always consider statement true, so its executed as infinite loop
		//for(;;) {
		//	System.out.println("bye");
		//	break;
	// String can not use in for loop, its non primitive datatype
		//}
	
	//use byte
	for (byte b=1; b<=10; b++) {
		System.out.println(b);
	}
	
//use double
	for (double d= 1.0;d<=10.0;d++) {
		System.out.println(d);
	}
	//use char
	for (char c='a'; c>='z'; c++) {
		System.out.println(c);
	}
	
	//use cases of for loop
	//when number of iteration are fixed(ex: month drop down value)
	//5 element-fixed


//do while loop- in this case while have no body, statement is written in do statement
	//really want to execute the fisrt statement atlest one then we use do while loop
     //11 to 21
int p= 11;

do {
	
	System.out.println(p);
	p++;
}
while(p<=21);


    System.out.println("---------");
	//10 to 1
	int rowCount= 10;
	while(rowCount>=1) {
		System.out.println(rowCount);
		rowCount--;
	}
	}
	
	//for each loop
	
}


		
	