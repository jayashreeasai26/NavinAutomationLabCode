package javasession;

public class Typecasting {
	
	public static void main (String[]args) {
		
		//TypeCasting:
		  //1. widening TypeCasting:
		//conversion of lower data type to higher data type
		
		byte b = 2;
		short s= b;
		int i = b;
		long l= b;
		//byte c=l;
		
		System.out.println(b);
		System.out.println(s);
		
		
		//2.Narrowing
		//converting of higher datatype to lower datatype:
		
		int p= 100;
		short s1= (short)p;
		byte b1= (byte)p;
		System.out.println(s1);
		System.out.println(b1);
		
		byte m= 100;
		byte n= 114;
		int t1= m+n;
		byte t= (byte) (m+n);
		System.out.println(t);
		System.out.println(t1);
		
		
		char c= 97;
		System.out.println(c);
		System.out.println(c+'a');
		
		
		
		
		
		
		
	}

}
