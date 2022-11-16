package javasession;

public class ArrayLiterals {
	public static void main(String[] args) {
		
		//ArrayLiterals: static array
		int i[]= {10, 20, 30, 40};
		
		System.out.println(i.length);
		System.out.println("hi=" + (i.length-1));
		System.out.println("hi=" + 0);
		System.out.println(i[0]);
		
		for (int e:i) {
			System.out.println(e);
		}
		
	}
	{
	//String Array Literals
	String students []= {"ramya", "vijay", "Jay", "vinay"};
	System.out.println(students.length);
	
	for(String e: students)   {        //what type of date- String, variable name= e,  array name- students    
		System.out.println(e);
		if (e.equals("Jay"));
		System.out.println("100 marks.....");
		
	
	}
	}

}
