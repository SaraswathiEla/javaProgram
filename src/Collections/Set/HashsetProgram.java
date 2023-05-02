package Collections.Set;

import java.util.HashSet;

public class HashsetProgram {

	public static void main(String[] args) {
		HashSet<Object> set = new HashSet<>();
		set.add("Home");
		set.add(10);
		set.add("Jayaram");
		set.add("Jayaram");
		set.add(null);		// only one null is allowed
		set.add(10);
		set.add("Home");
		set.add(null);	
		System.out.println(set);
		
		
	}

}
