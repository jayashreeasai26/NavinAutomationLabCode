package BuilderPattern;

public class EcomApplication {
	
	public EcomApplication doLogin() {
		System.out.println("Login to App");
		return this;
	}
	
	public EcomApplication doLogin(String un, String pwd) {
		System.out.println("login to app" + un + ":" + pwd);
		return this;
	}

	public EcomApplication search() {
		System.out.println("search with all product");
		return this;
	}
	
	public EcomApplication search(String name) {
		System.out.println("search with" + name);
		return this;
	}
	
	public EcomApplication addToCart(String name) {
		System.out.println("add to cart:" +name);
		return this;
	}
	
	public EcomApplication makePayment(String cc, int cvv) {
		System.out.println("make payment" + cc + ":" +cvv ) ;
		return this;
	}
	
	public EcomApplication makePayment(String cc, int cvv, int otp) {
		System.out.println("make Payment: " + cc + ":"  +cvv + ":" + otp  );
		return this;
	}
	
	public EcomApplication makePayment(String UPI) {
		System.out.println("make payment:" + UPI);
		return this;
	}
	
	public EcomApplication generateOrder() {
		System.out.println("order is done.... your order id is:" +1234);
		return this;
	}
	
	public EcomApplication loguot() {
		System.out.println("logout");
		return this;
	}
}
