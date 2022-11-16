package MapingPackage;

import java.util.HashMap;

public class MapTestClass {

	public static void main(String[] args) {
		//Hashmap is another dynamic collection, it store the data in key value formate <key, value>
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(100, "Tom");
		map.put(200, "peter");
		map.put(300, "Naveen");
		map.put(400, "Ravi");
		map.put(300, "Jayas");
		map.put(500, null);
		map.put(null, null);	
		map.put(null, "selenium");
		
		System.out.println(map.get(100));
		System.out.println(map.get(500));
		System.out.println(map.get(300));    //it will give lates value o/p Jayas
		System.out.println(map.get(100));
		System.out.println(map.get(500));
		System.out.println(map.get(null));
		System.out.println(map.get(null));
		
		//hashmap does not maintain any order, it maintains random order on the basis of hashmap
		HashMap<String, String> empmap = new HashMap<String, String>();
		
		//Hashmap is a class and map is interface
	//	Map<String, String> empmap = new HashMap<String, String>();
		
		//LinkedhashMap
		 //1. Its another specialized hasmap which maintains the order 
	//	Map<String, String> empmap = new LinkedHashMap<String, String>();
		
		//TreeMap:
			//1. Treemap is child of class interface
		    //2. It will give you sorted order on the basis of key (alphabetic oreder)
	//	Map<String, String> empmap = new TreeMap<String, String>();
		
		empmap.put("IBM", "Tom");   //java calculate one hashcodefor key(eg123456). It will calculate index. eg IBM index 4. 
		empmap.put("Google", "peter");
		empmap.put("MS", "Naveen");
		empmap.put("Amazon", "Ravi");
		
		System.out.println(empmap.get("IBM"));
		
		//to print all the values from hashmap:
	
		empmap.forEach((k,v) -> System.out.println(k +":"+v));
	}

}
