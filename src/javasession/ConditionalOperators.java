package javasession;

public class ConditionalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		int i=10;
		int j=20;
		
		if(i==j) {	
			System.out.println("both are equal");
		}
		else
		{
			System.out.println("both are not equal");
			
		}
		//
		
		if(10==20)
		{
			System.out.println("hiii");
	}
		else
		{
			System.out.println("bye");
			
			}
		//
		
		if(true)
		{
			System.out.println("selenium");
		}
		else
		{
			System.out.println("cypress");
		}
		
		//Nested if
		int total= 92;
		if(total<=100) {
			System.out.println("PASS");
			if (total>=90) {
				System.out.println("A grade");
				if(total>=95) {
					System.out.println("100% discount");
			}
			
			else {
				System.out.println("70% discount");
			}
			}
			else {
				System.out.println("B grade");
			}
		}
			else {
				System.out.println("Invalid marks");
			}
				//
//		//take a browser value.. ch/ff/safari/opera/ie...
//		//if the condition is matched then launch the browser
//		String browser = "chrome";
//		if (browser.equals("chrome")) {
//			System.out.println("launch the chrome");
//		}
//		if (browser.equals("safari")) {
//			System.out.println("launch the safari");
//		}
//		if (browser.equals("firefox"));{
//	}
//		}
//}
	}
}	


//if - else if








