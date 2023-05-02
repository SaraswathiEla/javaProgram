package Arrays;

public class SortAnArrayInAsscendingOrderFindfirstMinimumMultiplicationOf3Number 
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
	
	int multiple=a[0]*a[1]*a[2];
	System.out.println("The multiple of 3 number is ==>"+multiple);
	
	
	System.out.println("If the Range is big we can use for loop ");
	int product=1;
	for(int i=0;i<3;i++)
	{
		product=a[i]*product;
	}
	System.out.println("The multiple of minimum  3 number is==> "+product);


	}
}