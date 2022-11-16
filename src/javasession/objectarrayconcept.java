package javasession;

public class objectarrayconcept {

	public static void main(String[] args) {
		
		Object emp[]= new Object[5];
		emp[0]= "Tom";
		emp[1]= 25;
		emp[2]= 12.33;
		emp[3]= 'm';
		emp[4]= true;
	//	emp[5]= 989889898;
		
		System.out.println(emp[0]);
		//System.out.println(emp[5]);//AIOB
		
		for (int i=0; i<emp.length;i++)
			System.out.println(emp[i]);
	}


}
