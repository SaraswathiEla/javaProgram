package Arrays;

public class FindstMinimumNoInARRAYWithoutBBsort {

	public static void main(String[] args) {
		int[] a= {1,0,2,7,5};
		int fmin=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]<fmin)
			{
				fmin=a[i];
			}

		}
System.out.println("The first minimum array is "+fmin);
	}

}
