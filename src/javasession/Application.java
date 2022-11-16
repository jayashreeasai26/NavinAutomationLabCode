package javasession;

import java.util.ArrayList;

public class Application {
	
	public double getNumber(double d1, double d2) {
		
		double d= d1+d2;
		return d;
	}
		
		//Requirement: getDeviceList (empName)
		//program: empName(String)
		//return: List of Devices----> ArrayList
		
		public ArrayList getDevicesList (String empName) {
			System.out.println("getting devices list for:" + empName);
			
			ArrayList<String> ar = new ArrayList <String>();
			if(empName.equals("Jay")) {
				ar.add("Iphone");
				ar.add("Mackbook pro");
				ar.add("Airtel SIM");
			}
			
			else if(empName.equals("Vijay")) {
				ar.add("Headset");
				ar.add("DELL Laptop");
				ar.add("Ipad");
			}
			
			else {
				System.out.println("empName is not available");
			}
			
			return ar;	
			
		}
		

	
	public static void main(String[] args) {
		
		Application obj= new Application();
		
		ArrayList<String> l1= obj.getDevicesList("jay");
		double d= obj.getNumber(12.10, 15.20);
		System.out.println(d);
		System.out.println(l1);
		
		
	}

}
