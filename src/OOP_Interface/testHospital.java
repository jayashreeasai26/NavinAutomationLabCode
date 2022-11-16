package OOP_Interface;

public class testHospital {

	public static void main(String[] args) {
		
		FortisHospital fh = new FortisHospital();
		
		fh.cardioServices();
		fh.emergencyServices();
		fh.ENTServices();
		fh.OPDServices();
		
		
		//we cant create object of interface
		//top casting- child class object can be referred by parent object reference variable
		USMedical us= new FortisHospital();
		
		System.out.println("---------------------");
		
		us.emergencyServices();
		us.pathalogyServices();
		us.OrthoServices();
		
		//downcasting- not allowed in interface
		//FortisHospital fs1 = new USMedical();
	}

}
