package javasession;

public class Mainmethodoverloading {

	public static void main(String[] args) {
		//static method can be overloaded but can not be overidden
		//System.out.println(args[0]); AIOB exception
		//System.out.println(args.length);  //0
		System.out.println("hi...");
		
		Mainmethodoverloading.main(10);
		Mainmethodoverloading m1= new Mainmethodoverloading();
		m1.main();
		
	}

	public static void main(int i) {
		System.out.println("bye..."+i);
}
	public void main() {
		System.out.println("shy");
	}
}