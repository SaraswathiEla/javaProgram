package Arrays;

import java.util.LinkedHashSet;

public class PrintPostionOfEndDigitWithoutDuplicate {

	public static void main(String[] args) {
		
		int [] a= {2,4,4,6,5,6};
		
		//o/p: 
LinkedHashSet<Integer> set =new LinkedHashSet<>();
		
		for(int i=0;i<a.length;i++)
		{
			set.add(a[i]);
		}
		for(Integer n:set)
		{
			for(int i=0;i<a.length;i++)
			{
				if(n==a[i])
				{
					System.out.println(n+"  the position is "+i);
					break;
				}
			}
		}
	}

}


