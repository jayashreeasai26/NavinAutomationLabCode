package javasession;

public class Browser {
	
	//AF: launch a browser: FF/CH/Safari
	//parameter: browser name
	//return: boolean: true/false
	
	public boolean launchBrowser  (String brName) {
		System.out.println("launching browser: " + brName);
		
		switch (brName) {
		case "chrome":
			System.out.println("chrom is launched...");
			return true;
		case "fiefox":
			System.out.println("chrom is launched...");
			return true;
		case "safari":
			System.out.println("chrom is launched...");
			return true;
			
		default:
			System.out.println("plz pass the right browser");
		return false;
	}
	}
	public static void main(String[] args) {  //main method void in nature, can not return anything
		//this not executable, jvm always check public static void main
		//always check signature of main method
		
		Browser obj= new Browser();
		boolean flag= obj.launchBrowser("CHROME");
		System.out.println(flag);
		if(flag) {
			System.out.println("https://www.amazon.com");
		}	
		
		
		
	}

}
