package javasession;

public class ArrayConcept {
	public static void main(String[] args) {
		
		//array-------- Simillar type of data we have to store in a variable
		
		//1. int array:
		//in java there is no concept of negative index int[-1]
		//Limitation of array
		  //1. Similar type of data only:
		  //2. size is fixed: static array: to overcome this problem we have to use dyanamic array- arraylist or object array
		//Static array used when we know about fixed size-eg: month, day, total ball in perticular over, 
		//Advantage of static array- 
		   //1. static array we use when eg: big basket website - this websited is related to foods and vegetable. in this website there is menu that is fixed in size, we cant add cloths menu. New dev will come that might be he made changes and add then that time static array is used  
		//a. using new keyword:
		int i []= new int[4];  // 4-lenght of the array
		
		        i[0]=10;
				i[1]=20;
				i[2]=30;
				i[3]=40;
				
				System.out.println(i[0]);
				System.out.println(i[1]); 
				//System.out.println(i[4]);//ArrayIndexOutOfBoundsException
				//System.out.println(i[-1]); ////ArrayIndexOutOfBoundsException
			
				//int m[]=new int[5]; //0-4
				//m[4]=20;
				//System.out.println(m[0]);//if we not assign value then execute 0
				//System.out.println(m[4]);
				System.out.println("--------------"); 
				
		       
				
				// to print all value of arrays: iterate this array:
				for(int k=0; k<4; k++) {  //k represent index- 0,1,2,3
					System.out.println(i[k]); 
				}
				
	// double
				double d[]= new double[2];
				d[0]=10.53;
				System.out.println(d[0]);
						
	//char:
	char c[]= new char[3];
	c[0]='a';
	System.out.println(c[0]);
	}
}