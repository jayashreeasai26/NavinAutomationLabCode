package oop_mutipleInheritance;

public class pageTest {  //main method (pagetest is a caller class)

	public static void main(String[] args) {
		
		loginPage lp = new loginPage();
		lp.doLogin();
		
		lp.getColor();
		
		
		cartPage cp = new cartPage();
		cp.addToCart();
		cp.pageLoadTimeOut();
		cp.getColor();
	}

}
