package Strings;

public class RemoveSpaceBetweenWords {

	public static void main(String[] args) {
 
		//1 st way 
		
		//	String st="I am from Bangalore";
		//	System.out.println(st.replace(" ",""));
			
			//2nd way
		String st="I am from Bangalore";
		String[] s=st.split(" ");
		for(int i=0;i<s.length;i++)
		{
			System.out.print(s[i]);
		}
 		
			
			
	}

}
