package javasession;

public class Conditionalopertor {

	public static void main(String[] args) {
		
		int i=10;
		int j=20;
		
		if (i<=j) {
			System.out.println("correct");
	
		}
		else {
			System.out.println(" not correct");		
			}
		
		//> <> =
		
		
		if (10==20) {               //represnt a boolean value
			System.out.println("hi");
		}
		else {
			System.out.println("bye");
		}
		
		//
		if(true) {
			System.out.println("yes");
		}
			else {///cndition always return false- dead code,  why are you return else block: dead code which will never be exucuted in java
				System.out.println("No");
			}
		//
		boolean flag= true;
		if (flag) {                      //not giving dead code warning bcz it is dependent on flag variable
			System.out.println("selenuim");
		}
		else {
			System.out.println("cypress");
		}
		
		//
		int total= 98;
		if(total<=100) {
			System.out.println("pass");
			if (total>=102) {
				System.out.println("grade");
				if(total>=101) {
						System.out.println("dont now");
					}
				else {
						System.out.println(" i now");
					}
			}

				else {
						System.out.println("no not now");
				}
			
			
            //take a browser value-- ch//ff/safari
			//if the conditon is mathed then lauch broser
			//below program : if we rwritten lines of condion unnecessary, 
			
//			String browser=  "chrome";           // strins are no primitive with always use .equals, bcz string maitain the objects in the form 
//				if(browser.equals("chrome")) {
//						System.out.println("launch chrome...");
//					}
//				if(browser.equals("firefox")) {
//					System.out.println("launch firefox...");
//				}
//				if(browser.equals("safari")) {
//					System.out.println("launch safari...");
//				}
//				else {
//					System.out.println("please pass the right browswe......"+browser);
//					
//				}

			//if- else if condition
			//take a browser value-- ch//ff/safari
			//if the conditon is mathed then lauch broser
			//else print msg: please pass the right browser
			
			String browserName= "ie";
			if(browserName.equals("chrome")) {
			System.out.println("launch the browser.....");
		}
			else if(browserName.equals("Safari")) {
				System.out.println("launch the browser.....");
			}

			else if(browserName.equals("Firefox")) {
				System.out.println("launch the browser.....");
			}
			else if(browserName.equals("ie")) {
				System.out.println("launch the browser.....");
			}
		}
			else {
				System.out.println("please launch the right browser.....");
	}
}
	}


	



