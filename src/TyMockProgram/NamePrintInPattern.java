package TyMockProgram;

public class NamePrintInPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="SARASWATHI";
		//char[] ch = s.toCharArray();

		for(int i=0;i<=s.length()-1;i++)
		{
			for(int j=0;j<=i;j++)
			{
                
				System.out.print(s.charAt(i+j));
				
				//System.out.print("*");
			}
             
			System.out.println();
		}


	}

}
