package javasession;

public class MethodChainingConcept {
	
	String prod_name;
	int prod_ID;
	int quantity;
	
	public void product() {
		product3();
		
	}
	
	
	public void product1() {
		product2();
		
	}
	
	public void product2() {
		System.out.println("end method");
	}
	
	public void product3() {
		product1();
		
	}

	public static void main(String[] args) {
		MethodChainingConcept obj= new MethodChainingConcept();
		obj.product();
		
		
	}

}
