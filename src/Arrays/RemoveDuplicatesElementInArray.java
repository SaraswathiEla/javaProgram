package Arrays;

import java.util.LinkedHashSet;

public class RemoveDuplicatesElementInArray {
	
	public static void main(String[] args)
	{
		int[] a= { 2,4,4,6,5,6};
		//if we use hashset it will not follow the order of insertion
		// so we use Linked HashSet
		//Linked 
		//HashSet<Integer> set =new HashSet<>();
		LinkedHashSet<Integer> set =new LinkedHashSet<>();
		
		for(int i=0;i<a.length;i++)
		{
			set.add(a[i]);
		}
		for(Integer inte:set)
		{
			System.out.println(inte+" ");
		}
	}

}
