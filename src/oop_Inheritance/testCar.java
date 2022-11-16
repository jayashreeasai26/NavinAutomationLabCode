package oop_Inheritance;

public class testCar {

	public static void main(String[] args) {
		
		BMW b = new BMW();
		
		b.start();//Overridden
		b.stop(); //inherited 
		b.autoParking();//individual
		b.refuel();//inherited--- private method can not be inherrited
		System.out.println(b.speed);
		System.out.println(Car.wheels);
		System.out.println(b.testlevel);
		System.out.println(Car.testlevel);
		
			
	   
	   Car c= new Car();
	   c.start();
	   c.stop();
	   c.refuel();
	   //c.autoparking();-- parent can not access anything from child class
	   
	   
	   //top casting
	   //child class object can be referred by parent class reference variable
	   
	   Car c1= new BMW();
	   c1.start();
	   c1.stop();
	   c1.refuel();
	  // c1.autoParking();
	   c1.engine();
	   
	  //Down casting
	  //parent class object can be referred by child class object
	  //BMW b1= (BMW) new Car();//CarCastException// we can write but at the run time it will give classCastException
	  //Eg: one nano car- can we convert it at BMW- just we can do like this but at run time it will not work same as BMW.
	   
	   Audi a = new Audi();
	   a.start();
	   a.theftsafety();
	   
	   
	   //topcasting: aurodynamic to BMW
	   AeroDynamic ar= new BMW();
	   ar.Aero();
	   
	 //topcasting: Engineering to BMW	   
	   Engineering e= new BMW();
	   e.Enginee();
	   
	 //topcasting: Mechanical to BMW
	   Mechanical m1= new BMW();
	   m1.mechanic();
	   
	   
	   
	
	}

}
