package Matrix;

public class AdditionOf2Matrix {

	public static void main(String[] args) {
		int a[][]={ { 1, 2, 3}, { 4, 5, 6 } ,{7,8,9}};
		int b[][]={ { 1, 2, 3 }, { 4, 5, 6 } ,{7,8,9}};
		int row1=a.length;
		int col1=a[0].length;
		int row2=b.length;
		int col2=b[0].length;
		System.out.println(row1);

		System.out.println(col2);
		int sum[][]=new int[row1][col2];
		
		if(row1!=col2)
		{
			System.out.println("the product is not possible for above matrix");
		}
		else
		{
			
			for(int i=0;i<row1;i++)
			{
				for(int j=0;j<col1;j++)
				{
					 	sum[i][j]=a[i][j]+b[i][j];
					
 				}
			}
			
		}
		
	

		for(int i=0;i<sum.length;i++)
		{
			for(int j=0;j<sum[i].length;j++)
			{
				System.out.print(sum[i][j]+"   ");

			}
			System.out.println();
		}
}

	}


