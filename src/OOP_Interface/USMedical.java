package OOP_Interface;

public interface USMedical extends WHO{
	
	//interface can not give method body
	
	//abstract method: having no method body called abstract method
	public void pediaServices();
	
	public void physioServices();
	
	public void OrthoServices();
	
	public void pathalogyServices() ;
	
	public void emergencyServices();
	
	public void dentalServices();
	public void dentalServices(int dentatist);
	public void dentalServices(int dentatist, String dentalMachine);
	
		
	}


