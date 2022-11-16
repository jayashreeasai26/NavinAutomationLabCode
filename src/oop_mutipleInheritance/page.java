package oop_mutipleInheritance;

public class page extends web{
	
	@Override
	public void getColor() {
		System.out.println("page-- red color");
	}
	
	public void pageLoadTimeOut() {
		System.out.println("page---20");
	}

}
