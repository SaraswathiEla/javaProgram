package Matrix;

public class ProductOf2Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[][]={ { 1, 2, 3}, { 4, 5, 6 } ,{7,8,9}};
		int b[][]={ { 1, 2, 3 }, { 4, 5, 6 } ,{7,8,9}};
		int row1=a.length;
		int col1=a[0].length;
		int row2=b.length;
		int col2=b[0].length;
		System.out.println(row1);

		System.out.println(col2);
		int prd[][]=new int[row1][col2];
		
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
					for(int k=0;k<col2;k++)
					{
						prd[i][j]=a[i][k]*b[k][j];
					}
 				}
			}
			
		}
		
	

		for(int i=0;i<prd.length;i++)
		{
			for(int j=0;j<prd[i].length;j++)
			{
				System.out.print(prd[i][j]+"  ");

			}
			System.out.println();
		}
}
}