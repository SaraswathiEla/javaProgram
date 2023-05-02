package interview;

public class PrintYourNameInPyrimisShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="saraqswathi";
		
		int n=s.length();
		
		for(int i=0;i<n;i++)
		{
			for(int j=1;j<n-i;j++)
			{
				System.out.print(" ");
				
			}
			for(int k=0;k<=i;k++)
			{
				System.out.print(s.charAt(k)+" ");
			}
			System.out.println();
		}
	}

}
