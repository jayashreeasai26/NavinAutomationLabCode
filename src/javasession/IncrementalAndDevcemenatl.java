package javasession;

public class IncrementalAndDevcemenatl {
	
	public static void main (String[]args) {
		
		//1. Post increment
		//++
		
		int m= 1;
		int n= m++;
		System.out.println(m);
		System.out.println(n);
		
		
		int p =-89;
		int q= p++;
		System.out.println(p);
		System.out.println(q);
		
		int t= 0;
		int r= t++;
		System.out.println(t);
		System.out.println(r);
		
		int k= -99;
		int g= k++;
		System.out.println(k);
		System.out.println(g);
		
		
		int total= 1;
		System.out.println(total++);
		System.out.println(total);
		
		
		//2. Pre Increment
		int b=1;
		int v=++b;
		System.out.println(v);   //2
		System.out.println(b); // 2    first will increase the value of b then it will give to v
		
		int tt= -89;
		int rr= ++tt;
		System.out.println(rr);     //-88
		System.out.println(tt);     //-88
		
		int pop= 100;
		System.out.println(++pop);  //101
		System.out.println(pop);    //101
		
		
		//3. Post Decrement
		//dec value of any variable by 1
		int d= 2;
		int f= d--;
		System.out.println(d);   //1
		System.out.println(f);   //2     original value of d is 2 then first will give the d value to f then will dec the value of d
		
		int y= -99;
		int z= y--;
		System.out.println(y);   //-100
		System.out.println(z);    //-99
		
		int food= -89;
		System.out.println(food--);   //-89
		System.out.println(food);     //-90
		
		//Pre Decrement
		int e= 2;
		int u= --e;
		System.out.println(e);          //1
		System.out.println(u);          //1
		
		int test= -989;
		int testing= --test;
		System.out.println(test);       //-990
		System.out.println(testing);    //-990
		
		
		int google= -1000;
		System.out.println(--google);        //-1001
		System.out.println(google);         // -1001
		System.out.println(google++);        //-1001
		
		
		int bal= 500;
		int totalbal= bal+++10;        //original value of bal = 500  always take original value will be added +10 (bal++ then + 10) 
		System.out.println(bal);     
		System.out.println(totalbal);                   //
		
		int bal1= 500;
		int totalbal1= ++bal + 10;        //
		System.out.println(bal1);       // 
		System.out.println(totalbal1);   //  
		
		
		
				
		
		
		
		
				
		
		
	
	}

}
