package javasession;

public class Switch_Assignment {

	public static void main(String[] args) {

		char b='i';
		switch (b) {
		case 'a':
			System.out.println("a");
		case 'e':
			System.out.println("e");
			case 'i':
			System.out.println("i");
			case 'o':
			System.out.println("o");
			case 'u':
			System.out.println("u");
			case 200:
			System.out.println("u");
				break;



		default:
			break;
		}
		
	//timeout 
		String browser= "chrome";
		int timeout= 20;
		boolean headless= true;
		switch (browser) {
		case "chrome":
			if(timeout>=20) {
				System.out.println("close the browser");
			}
			if(headless) {
				System.out.println("run headless");
			
			}
		default:
			System.out.println("pass th  eright browser");
			break;
		case "naveen":
		System.out.println("launch naveen");
		break;
		}
		
		//browser envirment
		String testEnvironment= "DEV";
		switch (testEnvironment) {
		case "DEV":
			break;
		case "test":
			break;
		case "UAT":
			break;
		case "production":
			break;
            default:
			break;
		}
		
		}
}
