package TyMockProgram;

public class PrintCombinationNoThesumshouldbe11 {

	public static void main(String[] args) {
		int[] a= {1,3,5,2,8,9,10};
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				sum=a[i]+a[j];
				if(sum==11)
				{
					System.out.println("The cobination no is "+a[i]+" and "+a[j]+"sum is"+sum); 
				}
			}

		}

	}

}
