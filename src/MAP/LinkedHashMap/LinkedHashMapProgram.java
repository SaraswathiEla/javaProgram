package MAP.LinkedHashMap;

import java.util.HashMap;
import java.util.Map.Entry;

public class LinkedHashMapProgram {

	public static void main(String[] args) {
 
		HashMap<Integer,String> map1 = new HashMap<>();	//insertion order is maintained
		map1.put(10,"Hi");
		map1.put(50, "HiHello");
		map1.put(30,null); 		// multiple null values are allowed
		map1.put(60,null); 
		map1.put(null, "hello");	// one null key allowed
		map1.put(30, "bye");		// duplicate keys are not allowed
		map1.put(40, "bye"); 		//duplicate values are  allowed
		map1.put(80, "welcome");		
		map1.put(20, null);
		System.out.println(map1);
		System.out.println(map1);
		
		for(Entry<Integer,String> m : map1.entrySet())		// for each usage in map
		{
			System.out.println(m.getKey()+ " "+ m.getValue());
		}
		
		System.out.println(map1.containsKey(50));
		System.out.println(map1.containsValue("welcome"));
		System.out.println(map1.size());
		map1.replace(60, "hellohi");
		System.out.println(map1.remove(80));
		System.out.println(map1);
	

	}

}
