package TyMockProgram;

public class patternPUBLIC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="PUBLIC";
		char[] ch = s.toCharArray();
		for(int i=0;i<s.length();i++)
		{
			for(int j=0;j<=i;j++)
			{
				if(j==i)
				System.out.print(ch[i]);
				else
				System.out.print(" ");
			}
			System.out.println();
		}
		

	}

}
