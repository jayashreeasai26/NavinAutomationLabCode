package javasession;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListTests {

	public static void main(String[] args) {
		
		ArrayList<Integer> ar = new ArrayList <Integer>();
		
		ar.add(100);
		ar.add(1);
		ar.add(20);
		ar.add(19);
		

		//Collections.sort(ar);
		//System.out.println(ar);
		//System.out.println("min valie: "+ar.get(0));
		//System.out.println("max value:"+ar.get(ar.size()-1));
		
		Collections.sort(ar, Collections.reverseOrder());
		System.out.println(ar);
		
		//System.out.println(ar);
		
ArrayList<Integer> ar1 = new ArrayList <Integer>();
		
		ar1.add(2);
		ar1.add(13);
		ar1.add(220);
		ar1.add(119);
		
		System.out.println(ar1);
		
	    ar1.addAll(ar);
	    System.out.println(ar1);
	    
ArrayList<String> names = new ArrayList <String>();
		names.add("Tom");
		names.add("peter");
		names.add("Lisa");
		names.add("ravi");
		
		System.out.println(names);
		
		//Collections.sort(names);
		//System.out.println(names);
		
		Collections.swap(names, 1, 2);
		System.out.println(names);
		

		Collections.swap(names, 2, 3);
		System.out.println(names);

		
		
		//int arr[]= {1,2,3,4,11};
		//System.out.println(arr);   //o/p- I@cac736f- memory object address
		
		//System.out.println(Arrays.toString(arr));//string representation of array 
		
	
		ArrayList<String> emp = new ArrayList <String>();
		emp.add("Tom");
		emp.add("peter");
		emp.add("Lisa");
		emp.add("ravi");
		emp.add("mohit");
		
		System.out.println(emp);
		
		emp.clear();
		System.out.println(emp);
		
		if (emp.contains("peter"));
		System.out.println("pere is present in the list");

	    
	
	
	
	
	}
				

	}


