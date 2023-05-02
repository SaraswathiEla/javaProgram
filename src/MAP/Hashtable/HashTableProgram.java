package MAP.Hashtable;

import java.util.Hashtable;

public class HashTableProgram {

	public static void main(String[] args) {
		Hashtable<Integer,String> map = new Hashtable<>();	//insertion order is maintained
		map.put(10,"Hi");
		map.put(50, "HiHello");
		//map.put(30,null); 		// null value not allowed
		//map.put(null,"hello"); 	// null key not allowed
		map.put(30, "bye");		
		map.put(30, "welcome");		// duplicate keys are not allowed(last updated value will be there)
		map.put(40, "bye"); 		//duplicate values are  allowed
		
		System.out.println(map);
		
	}

}
