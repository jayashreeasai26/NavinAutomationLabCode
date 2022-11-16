package javasession;

public class Staticmethodoverloading {
	
	//difference between peranent generation and metaspace
	//upto jdk 1.7 is known permanen generation// 
	//after jdk 1.8 its metaspace
	//eg: 16 GB RAM machine HW, some space gets heap memory, some space takes, stack memory, 
	//100 MB for permamenent gene ration/static memory- if it wll take 100 MB and more than 100 MB , might system get crash
	//metaspace/dynamic memory- once memroy space is full, it will start taking allocation from 16 GB ram

	public static void printLogo(int i) {
		//return 1;
		
		printLogo(50,20);

	}

	public static void printLogo(int a, int b) {
		System.out.println(a+b);

	}

	public static String printLogo(String name) {
		return name + "Logo";

	}

	public static void main(String[] args) {
		//Staticmethodoverloading s1= new Staticmethodoverloading();
		Staticmethodoverloading.printLogo(10);
		
		
		String sz= Staticmethodoverloading.printLogo("AZ");
		System.out.println(sz);
		
		
		

	}

}
