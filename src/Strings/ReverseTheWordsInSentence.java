package Strings;

public class ReverseTheWordsInSentence {

 		public static void main(String[] args)
		{
			String st="I am from Bangalore";
			String[] s=st.split(" ");
			
			for(int i=s.length-1;i>=0;i--)
			{
				System.out.print(s[i]);
			}
			
			
			
		}
		
			
			
	}



