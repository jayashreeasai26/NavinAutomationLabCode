package javasession;

public class SwitchcaseStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

//		//take a browser value.. ch/ff/safari/opera/ie...
//		//if the condition is matched then launch the browser
		//else 	trint a msg: please pass the correc browser
		
		String browser= "chrome"; 
		int timeout=20;
		
	
	//switch then pres cntr space	
		switch (browser) {
		case "chrome":
			System.out.println("launch chrome");
			if (timeout==20) {
				System.out.println("please close browser");
			}
		break;	
		case "firefox":
			System.out.println("launch firefox");
		break;	
		case "safari":
			System.out.println("launch safari");
			break;
			
		default:
			System.out.println("launch not anyone");
			break;
		}

		
		
		//multipe enviornmet: QA/DEV/UAT/STAGE/
		//cros browser logic
		//locators
		
		//Assignment- switch case : byet,short, int, long, float, double, char, string
		
		char b= 'a';
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
		case 200:   /// in case mainatin numeric value also
			System.out.println("u");
			
			default:
				break;
		}

			
	}
}


