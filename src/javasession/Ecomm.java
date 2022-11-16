package javasession;

public class Ecomm {

	// Method Overloading: same name with different parameter
	// method overloading is also known as compile time polymorphism= poly(many)+
	// morphism(form)
	// also known as static polymorphism
	//Why method overloading- user friendly point of view - design looking

	public void test1() { // 0 parameter
	}

	public void test1(int i) { // 1 parameter
		System.out.println(i);

	}

	public void test1(String sh) { // 1 parameter
	}

	public void test(String c, int k) { // 2 parameter
	}

	public void test(int j, String s) { // 2 parameter
	}

	public void pop() { // 0 parameter
	}

	// Login feature- overloaded

	public void login1() {
	}

	public void login1(String username, String password) {
	}

	public void login1(String username, String password, int OTP) {
	}

	public void login1(String username, String password, String role) {
	}

	

	public static void main(String[] args) {

		Ecomm obj = new Ecomm();
		obj.test1();
		System.out.println("test method");
		obj.test1(20);
		

		obj.login1();
		System.out.println("login with blank");
		
		obj.login1("jaya", "Jay@123");
		System.out.println("login with credential");
		
		
	}

}
