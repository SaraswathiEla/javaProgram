package MAP.TreeMap;

import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapProgram {

	public void main(String args[])
	{
		TreeMap<Integer,Object> map3 = new TreeMap<>();	//insertion order is maintained
		map3.put(10,null);
//		map3.put(null, "Hi");
		map3.put(5,null); 		// multiple null values are allowed
		map3.put(7,"hello"); 
		map3.put(10, 20);	// one null key allowed
		map3.put(30, "bye");		// duplicate keys are not allowed
		map3.put(15, 20); 		//duplicate values are  allowed
		
		System.out.println(map3);
			
		for(Entry<Integer,Object> m : map3.entrySet())		// for each usage in map
		{
			System.out.println(m.getKey()+ " "+ m.getValue());
		}	
		
		
		
		

	}
}
