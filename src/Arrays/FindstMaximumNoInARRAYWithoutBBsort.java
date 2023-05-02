package Arrays;

public class FindstMaximumNoInARRAYWithoutBBsort {

	public static void main(String[] args) {
		int[] a= {7,2,1,5};
		int fmax=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>fmax)
			{
				fmax=a[i];
			}

		}
			System.out.println("The first Maximum array is "+fmax);
	}

}
