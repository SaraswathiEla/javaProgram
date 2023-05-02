package Arrays;

import java.util.LinkedHashSet;

public class PrintOnlyUniqueElementsInArray {
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
		 
		for (Integer n:set)
		{
			int count=0;
			for(int i=0;i<a.length;i++)
			{
				if(n==a[i])
				{
					count++;
				}
			}
			
			if(count==1)
			{
				System.out.println("The only uniue elements in array is "+n);
			}
		}
	
	}



}
