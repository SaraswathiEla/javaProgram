package Collections.Set;

import java.util.LinkedHashSet;

public class LinkedHashSetProgram {

	public static void main(String[] args) {
 
		
		LinkedHashSet<Object> linkedSet = new LinkedHashSet<>();
		linkedSet.add("Home");
		linkedSet.add(10);
		linkedSet.add("Jayaram");
		linkedSet.add("Jayaram");
		linkedSet.add(null);		// only one null is allowed
		linkedSet.add(10);
		linkedSet.add("Home");
		linkedSet.add(null);	
		System.out.println(linkedSet);
		
		
	}

}
