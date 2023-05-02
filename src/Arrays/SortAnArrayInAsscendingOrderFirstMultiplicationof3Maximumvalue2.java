package Arrays;

public class SortAnArrayInAsscendingOrderFirstMultiplicationof3Maximumvalue2 
{

	public static void main(String[] args) 
	{
		 		
		int[] b= {7,2,0,1,5};
		System.out.println("printing the array in deccending order");
		for (int i=0;i<b.length;i++)
		{
			for(int j=i+1;j<b.length;j++)
			{
				if(b[i]<b[j])
				{
					int temp=b[i];
					b[i]=b[j];
					b[j]=temp;
				}
			}
			System.out.println(b[i]);
		}
		
		int sum11=0;
		for(int i=0;i<3;i++)
		{
			sum11=b[i]+sum11;
		}
		
		System.out.println("the First maximum number is "+b[0]);
		System.out.println("the Second maximum number is "+b[1]);
		System.out.println("the last maximum number is "+b[b.length-1]);
		System.out.println("The sum of minimum  3 number is  "+sum11);


	}
}