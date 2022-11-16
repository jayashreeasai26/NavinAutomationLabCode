package oop_mutipleInheritance;

public class loginPage extends page{
	
	@Override
	public void getColor() {
		System.out.println("loginPage-- orange color");
	}
	 public void doLogin() {
		 System.out.println("doLogin");
	 }
}
