package OOP_Interface;

public class FortisHospital implements USMedical, UKMedical, IndianMedical{

	//USA
	@Override
	public void pediaServices() {
		System.out.println("FH---pediaServices");
		
	}

	@Override
	public void physioServices() {
		System.out.println("FH---physioServices");
		
	}

	@Override
	public void OrthoServices() {
		System.out.println("FH---OrthoServices");
		
	}

	//UK
	@Override
	public void ENTServices() {
		System.out.println("FH---ENTServices");
	}

	@Override
	public void cardioServices() {
		System.out.println("FH---cardioServices");
	}

	//Indian
	@Override
	public void oncologyServices() {
		System.out.println("FH---oncologyServices");
			
	}
		
	//Individual 
	public void pathalogyServices() {
		System.out.println("FH----pathalogyServices ");
	}

	public void OPDServices() {
		System.out.println("FH----OPDServices ");
	}

	//Common method
	public void emergencyServices() {
		System.out.println("FH----emergencyServices ");
	}

	@Override
	public void covid19News() {
		System.out.println("FH-----covid19News");
	}

	@Override
	public void covid19Vaccnation() {
		System.out.println("FH-----covid19Vaccnation");
			
	}

	//method overloading and method overriding
	@Override
	public void dentalServices() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dentalServices(int dentatist) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dentalServices(int dentatist, String dentalMachine) {
		// TODO Auto-generated method stub
		
	}
	
}
