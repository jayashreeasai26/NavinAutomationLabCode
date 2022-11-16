package javasession;

public class Timecomplexity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//BIG O- is representic time complexity
		
		int i= 1;
		//O(1)
		
		int p= 2;
		int total= i+p;
		System.out.println(total);
		
		//O(N) --> N=1 --> O(1) --constant time.....
		
		//for loop:
		 
		for (int k=1; k<=10; k++)  {
			System.out.println(k);
		}	
		for (int k=1; k<=10; k++)  {
			System.out.println(k);
		}
		for (int k=1; k<=10; k++)  {
			System.out.println(k);
		}
		
		//3n + 3n + 3n==> 6n == > O(n)

	}

}
