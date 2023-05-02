package Matrix;

import java.util.ArrayList;

public class FindEvenAndOddNOInMatrix {

	public static void main(String[] args) {
        int[][] a = { { 1, 2, 3 }, { 4, 5, 6 } };
        
		
		 
//		System.out.println(a);
//		for(int i=0;i<a.length;i++)
//		{
//			for(int j=0;j<a[i].length;j++)
//			{
//				System.out.print(a[i][j]+" ");
//			}
//			System.out.println();
//		} 
//		
        ArrayList<Integer> eList=new ArrayList<Integer>();
        ArrayList<Integer> oList=new ArrayList<Integer>();

		int even=0;
				int odd=0;
				for(int i=0;i<a.length;i++)
				{
					for(int j=0;j<a[i].length;j++)
					{
						
						if(a[i][j]%2==0)
						{
							even++;
							System.out.print(a[i][j]+" ");
							eList.add(a[i][j]);
						}
						else
						{
							odd++;
							oList.add(a[i][j]);
						}
						
 					}

				}
				System.out.println(eList);

				System.out.println("total Even number is "+even);

				System.out.println("total odd number is "+odd);
				System.out.println(oList);



		
		 	}
		
		
	}


