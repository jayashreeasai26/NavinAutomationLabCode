package javasession;

import java.util.ArrayList;

public class ArrayListTest {  // arraylist is always continiuos memery location, always follow sequence

	public static void main(String[] args) {
		
		ArrayList<Integer> marksList = new ArrayList<Integer>();
		 System.out.println(marksList.size());
		 marksList.add(100); //0
		 marksList.add(200); //1
		 marksList.add(11);// 2
		 marksList.add(20);//3
		 
		 System.out.println(marksList.get(2));
		 
		 marksList.remove(2);
		 
		 System.out.println(marksList.get(2));
		 
		 marksList.add(400);
		 
		 System.out.println(marksList.get(3));
		 
		 marksList.add(0,150);
		 
		 System.out.println(marksList.get(0));
		 
		// marksList.add(7, 1000);
		 
		 //System.out.println(marksList.get(7));
		 
		 //Advantage of arraylist- speed, 
		 
		 //Int que: waht is the load factor of arraylist?
		//		 PC- physical capacity/2
		 
		 //PC= 0 initial value
         //Virtual Capacity= 10
		 //Assignment
	}


//write a java program to test a number is positive or negative
//Test Data
//Input number: 35---positive number
//Input number: -11---Negative number
	
int num= 10;{
if(num>0) {
	System.out.println("+ve num");
}
else {
	System.out.println("-ve num");
}
}
}

		 
		 

