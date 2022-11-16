package javasession;

public class Practice_3 {

	String name;
	int pages;
	boolean isCover;
	
	
	String name1;
	int age;
	String city;
	

	public static void main(String[] args) {
		
		//class--> blueprint/category/template
		
		//Object---> physical entity----> instance of class
		//object---> every object its have own name is called reference name
		
		
		Practice_3 c1 = new Practice_3();
		
	    c1.name= "notebook";
		c1.pages= 20;
		c1.isCover= true;
		
		System.out.println(c1.name +" "+ c1.isCover);
		System.out.println(c1.pages);
		
		//No reference object
		new Practice_3().name= "Copy";
		new Practice_3().pages= 40;
		new Practice_3().isCover= true;
		
		System.out.println(new Practice_3().name= "Copy");
		System.out.println(new Practice_3().pages= 40);
		
		System.out.println("-------------------");
		
		Practice_3 c3= new Practice_3();
		
		c3.name= "hard copy";
		c3.pages= 50;
		c3.isCover= false;
		
		System.out.println(c3.name);
		
		
//		Practice_3 c4= new Practice_3();
//		c4= null;
//		c4.name= "soft copy";
//		System.out.println(c4.name);
		
		//Int que: System.gc method is use to call the garbage collector programatically
		//system.gc();//call garbage collector programatically
		
		System.out.println("------------&---------");
		
		Practice_3 pr1= new Practice_3();
		pr1.name1= "Jay";
		pr1.age= 29;
		pr1.city= "Nagpur";
		
		Practice_3 pr2= new Practice_3();
		pr2.name1= "vijay";
		pr2.age= 28;
		pr2.city= "Pune";
		
		Practice_3 pr3= new Practice_3();
		pr3.name1= "shree";
		pr3.age= 30;
		pr3.city= "Banglore";
		
		System.out.println(pr1.name1+ " " + pr1.age+ " "+ pr1.city);
		System.out.println(pr2.name1+ " " + pr2.age+ " "+ pr2.city);
		System.out.println(pr3.name1+ " " + pr3.age+ " "+ pr3.city);
		
		pr1=pr2;
		
		System.out.println(pr1.name1+ " " + pr1.age+ " "+ pr1.city);
		System.out.println(pr2.name1+ " " + pr2.age+ " "+ pr2.city);
		System.out.println(pr3.name1+ " " + pr3.age+ " "+ pr3.city);
		
		pr2=pr3;
		
		System.out.println(pr1.name1+ " " + pr1.age+ " "+ pr1.city);
		System.out.println(pr2.name1+ " " + pr2.age+ " "+ pr2.city);
		System.out.println(pr3.name1+ " " + pr3.age+ " "+ pr3.city);
		
		pr3=pr1;
		
		System.out.println(pr1.name1+ " " + pr1.age+ " "+ pr1.city);
		System.out.println(pr2.name1+ " " + pr2.age+ " "+ pr2.city);
		System.out.println(pr3.name1+ " " + pr3.age+ " "+ pr3.city);
		
		pr1=pr2;
		
		System.out.println(pr1.name1+ " " + pr1.age+ " "+ pr1.city);
		System.out.println(pr2.name1+ " " + pr2.age+ " "+ pr2.city);
		System.out.println(pr3.name1+ " " + pr3.age+ " "+ pr3.city);
		
		pr3=pr2;
		
		System.out.println(pr1.name1+ " " + pr1.age+ " "+ pr1.city);
		System.out.println(pr2.name1+ " " + pr2.age+ " "+ pr2.city);
		System.out.println(pr3.name1+ " " + pr3.age+ " "+ pr3.city);
		
		
	}

}
