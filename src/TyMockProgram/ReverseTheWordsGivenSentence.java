package TyMockProgram;

public class ReverseTheWordsGivenSentence{

 		public static void main(String[] args)
		{
			String st="my name is ok";
			
		//	o/p : I ma morf erolgnaB
			
			String[] s=st.split(" ");
			
			for(int i=s.length-1;i>=0;i--)
			{
				
				String str=s[i];
 
				for(int j=str.length()-1;j>=0;j--)
				{
					System.out.print(str.charAt(j));
				}
				System.out.print(" ");
  			}
			
			
			
		}
		
			
			
	}



