package javasession;

public class customers {
	
	String name;
	int cust_ID;
	String city;
	
	public static void main(String[] args) {
		
		customers c1= new customers();
		c1.name= "Tom";
		c1.cust_ID= 01;
		c1.city= "Nagpur";
		System.out.println(c1.name+ " "+c1.cust_ID +" " + c1.city);
		
		customers c3= new customers();
		c3.name= "shane";
		c3.cust_ID= 03;
		c3.city= "Dubai";
		System.out.println(c3.name+ " "+c3.cust_ID +" " + c3.city);
		
		
		customers c2= new customers();
		c2.name= "jerry";
		c2.cust_ID= 02;
		c2.city= "Pune";
		System.out.println(c2.name+ " "+c2.cust_ID +" " + c2.city);
		
        c3=c2;
		
        System.out.println(c3.name+ " "+c3.cust_ID +" " + c3.city);
		
		
		customers c4= new customers();
		c4.name= "jenny";
		c4.cust_ID= 04;
		c4.city= "Banglore";
		System.out.println(c4.name+ " "+c4.cust_ID +" " + c4.city);
		
		
		
		
	}

}
