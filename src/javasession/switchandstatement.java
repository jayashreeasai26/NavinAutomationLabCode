package javasession;

public class switchandstatement {

	public static void main(String[] args) {

		//take as browser vaue.... ch/ie/safari...
		//if the condition is matched... lauch the browser
		//else print a msg: please pass the right browser
		
		
	  String browser= "firefox";
	  switch (browser) {
	case "chrome": 
		System.out.println("launch the chrome");
		break;
	case "safari": 
		System.out.println("launch the safari");
		break;
	case "firefox": 
		System.out.println("launch the firefox");
		break;
		
	default:
		System.out.println("please pass the right browser...."+ browser);
		break;
	}
	}
	
	//multiple environment: Qa/DEV/UAT/STAGE/PROD
	//cross browser logic
	//locator:
	
	
	
	
	
	
}




