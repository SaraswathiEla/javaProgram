package Arrays;

public class SortAnArrayInAsscendingOrderFindfirstMinimumSumOF3Number 
{

	public static void main(String[] args) 
	{
		int[] a= {7,2,0,1,5};
		System.out.println("printing the array in ascending order");
		for (int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			System.out.println(a[i]);
		}

		System.out.println("The first minimum number in array is " +a[0]);
		System.out.println("The secod minimum number in array is " +a[1]); 
	System.out.println("The Last  minimum number in array is "+a[a.length-1]); 
	
	
	int sum=a[0]+a[1]+a[2];
	System.out.println("The sum of 3 number is"+sum);
	
	
	System.out.println("If the Range is big we can use for loop ");
	int sum1=0;
	for(int i=0;i<3;i++)
	{
		sum1=a[i]+sum1;
	}
	System.out.println("The sum of minimum  3 number is"+sum1);


	}
}