package javasession;

import java.util.ArrayList;        //will be the second stattement and first one is package

public class ArrayListconcept {

	public static void main(String[] args) {
		
		//ArrayList - default class
		
		//create the object of the ArrayList: with the new keyword
		
		ArrayList ar= new ArrayList();   //ar= object name
		System.out.println(ar.size());    //always initially 0- empty arraylist has created
		ar.add(100);
		ar.add(200);
		System.out.println(ar.size());//2
		ar.add(300);
		ar.add(400);
		System.out.println(ar.size());//4
		ar.add(500);
		ar.add(600);
		System.out.println(ar.size());//6
		
		System.out.println(ar.get(0));
		//System.out.println(ar.get(6));//IOB=ndex outof bound exception
		//System.out.println(ar.get(-1));
		
		
		//to print all values of arraylist: for loop for each loop
		
		//
		for(int i=0; i<ar.size(); i++) {
			System.out.println(ar.get(i));//100
		}
		
		//
		
		}
		
	}

