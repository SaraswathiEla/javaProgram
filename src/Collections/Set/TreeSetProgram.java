package Collections.Set;

import java.util.TreeSet;

public class TreeSetProgram {

	public static void main(String[] args) {
 
		TreeSet<Object> treeSet = new TreeSet<>();
		treeSet.add(90);
		treeSet.add(10);
		treeSet.add(30);
		treeSet.add(50);
//		treeSet.add(null);								//  null is not  allowed-> we get NullPointerException
//		treeSet.add("Home");							// heterogeneous data is not allowed(ClassCastException)	
		System.out.println(treeSet);					//auto sorted in ascending order
		System.out.println(treeSet.descendingSet()); 	// prints elements in descending order	
		
		
		TreeSet<Object> treeSet1 = new TreeSet<>();
		treeSet1.add("Herur");
		treeSet1.add("Jayaram");
		treeSet1.add("Gowda");
//		treeSet.add(50);
		System.out.println(treeSet1);					//auto sorted in ascending order
		System.out.println(treeSet1.descendingSet()); 
		
		
	}

}
