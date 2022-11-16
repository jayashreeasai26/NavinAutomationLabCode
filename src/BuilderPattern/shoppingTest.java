package BuilderPattern;

public class shoppingTest {

	public static void main(String[] args) {
		
		
		
		EcomApplication u1= new EcomApplication();
		u1.doLogin("jay@gmail.com", "Jay@123")
					.search("macbook")
						.addToCart("macbook pro")
							.makePayment("1232 1221 1234 2121", 217)
								.generateOrder()
									.loguot();
		
		u1.doLogin("jay@gmail.com", "Jay@123")
			.addToCart("macbook pro")
				.makePayment("1232 1221 1234 2121", 217)
					.generateOrder()
						.loguot();
		
		u1.doLogin("jay@gmail.com", "Jay@123")
			.search("macbook")
				.loguot();
		
		 
		u1.doLogin("jay@gmail.com", "Jay@123")
			.loguot();
		
		u1.doLogin("vijay@gmail.com", "viay@123")
			.loguot();
		
		u1.doLogin("jay@gmail.com", "Jay@123");
							}

}
