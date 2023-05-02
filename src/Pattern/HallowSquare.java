package Pattern;

public class HallowSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		int r=4,c=4;
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				if(j==i || j==c-1)
				{
					System.out.print("*");
				}
			}
		}

	}

}
