package Arrays;

import java.util.LinkedList;

public class PrintPostionOfEndDigitWithDuplicate {

	public static void main(String[] args) {
		
		int [] a= {2,4,4,6,5,6};
		
		//o/p: 
LinkedList<Integer> set =new LinkedList<>();
		
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


