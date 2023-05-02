package Arrays;

public class SortAnArrayInAsscendingOrderUsingBBsort2 {

	public static void main(String[] args) {
 
		
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
		System.out.println("print the arraya in descendin order:");
		for (int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			
			System.out.println(a[i]);
		}

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
		}
		System.out.println("printing the array using for each loop");
		for(int ele:a)
		{
			System.out.println(ele);

		}
		
		System.out.println("printing the array using for  loop");  
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}

	System.out.println("after ascending printing the array in descinding order using for loop ");
	for(int i=a.length-1;i>0;i--)
	{
		System.out.println(a[i]);
	}
	}
}