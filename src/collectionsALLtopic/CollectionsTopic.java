package collectionsALLtopic;

 
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.TreeMap;
import java.util.TreeSet;



public class CollectionsTopic {

	public static void main(String[] args) 
	{
		/*
	ArrayList<Object> list = new ArrayList<>();
	list.add(10);
	list.add(null);
	list.add(20);
	list.add("Anu");
	list.add(null);
	list.add(10);
	list.add("Vivu");
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
	
	
	PriorityQueue<Integer> q = new PriorityQueue<>();
	q.add(10);
	q.add(50);
	q.add(80);
	q.add(60);
	System.out.println(q.peek());
	System.out.println(q);
	System.out.println(q.poll());
	System.out.println(q);
	
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
	
	
	ArrayList<Object> list2 = new ArrayList<>();
	list2.add(60);
	list2.add(null);
	list2.add(60);
	list2.add("Welcome");
	list2.add(null);
	
	System.out.println(list2);
	
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
	
	
	TreeSet<Object> treeSet = new TreeSet<>();
	treeSet.add(90);
	treeSet.add(10);
	treeSet.add(30);
	treeSet.add(50);
//	treeSet.add(null);								//  null is not  allowed-> we get NullPointerException
//	treeSet.add("Home");							// heterogeneous data is not allowed(ClassCastException)	
	System.out.println(treeSet);					//auto sorted in ascending order
	System.out.println(treeSet.descendingSet()); 	// prints elements in descending order	
	
	
	TreeSet<Object> treeSet1 = new TreeSet<>();
	treeSet1.add("Herur");
	treeSet1.add("Jayaram");
	treeSet1.add("Gowda");
//	treeSet.add(50);
	System.out.println(treeSet1);					//auto sorted in ascending order
	System.out.println(treeSet1.descendingSet()); 
	
	
	Hashtable<Integer,String> map = new Hashtable<>();	//insertion order is maintained
	map.put(10,"Hi");
	map.put(50, "HiHello");
	//map.put(30,null); 		// null value not allowed
	//map.put(null,"hello"); 	// null key not allowed
	map.put(30, "bye");		
	map.put(30, "welcome");		// duplicate keys are not allowed(last updated value will be there)
	map.put(40, "bye"); 		//duplicate values are  allowed
	
	System.out.println(map);
	

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
*/	
	LinkedHashMap<Integer,String> map2 = new LinkedHashMap<>();	//insertion order is maintained
	map2.put(10,"Hi");
	map2.put(50, "HiHello");
	map2.put(30,null); 		// multiple null values are allowed
	map2.put(60,null); 
	map2.put(null, "hello");	// one null key allowed
	map2.put(30, "bye");		// duplicate keys are not allowed
	map2.put(40, "bye"); 		//duplicate values are  allowed
	map2.put(80, "welcome");		
	map2.put(20, null);
	System.out.println(map2);
		
	for(Entry<Integer,String> m : map2.entrySet())		// for each usage in map
	{
		System.out.println(m.getKey()+ " "+ m.getValue());
	}
	
	System.out.println(map2.containsKey(50));
	System.out.println(map2.containsValue("welcome"));
	System.out.println(map2.size());
	map2.replace(60, "hellohi");
	System.out.println(map2.remove(80));
	System.out.println(map2);
	
	
	TreeMap<Integer,Object> map3 = new TreeMap<>();	//insertion order is maintained
	map3.put(10,null);
//	map3.put(null, "Hi");
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

 