package Collections.List;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraylistProgram {

	public static void main(String[] args) {
 
		
		ArrayList<Object> list = new ArrayList<>();
		list.add(10);
		list.add(null);
		list.add(20);
		list.add("Sara");
		list.add(null);
		list.add(10);
		list.add("Ela");
		list.add(null);
		list.add(20);
		
		System.out.println(list);
		
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(10);
		list1.add(40);
		list1.add(20);
		list1.add(null);
		list1.add(null);
		list1.add(10);
		list1.add(40);
		list1.add(null);
		
		System.out.println(list1);
		
		list.addAll(list1); // all the elements of list1 to list
		
		if(list.contains("hi")) 	//checks if element is present or not
		{
			System.out.println("present");
		}
		else
		{
			System.out.println("not present");
		}

		list.remove(4);		// removes the element present in index 4
		//we cant see which element is removed. If we want to see include it in syso stmt
		
		
		for(Object alldata : list)			// used to fetch all elements 1 by 1
		{
			System.out.println(alldata);
		}
		
		Iterator<Object> it = list.iterator();
		while(it.hasNext())
		{
			Object alldata = it.next();
			System.out.println(alldata);
		}
		
		System.out.println(list.get(5));
		System.out.println(list.size());
		System.out.println(list.indexOf("hi"));
		

	}

}
