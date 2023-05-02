package Strings;
public class P001_ReverseAString {

	public static void main(String[] args) 
	{
		
		String s ="Bangalore";
		
		//	1st way -> normal way
		for(int i=s.length()-1;i>=0;i--)					
		{													
			System.out.print(s.charAt(i));
		}

		System.out.println();
		//	2nd way -> by converting into array
		String s1 ="Bangalore";
		char st[] = s.toCharArray();
		for(int i=st.length-1;i>=0;i--)
		{
			System.out.print(st[i]);
		}


		System.out.println();

		//	3rd way -> by using variable
		String s2 ="Bangalore";	
		String rev=" ";
		for(int i=s2.length()-1;i>=0;i--)
		{
			rev = rev + s2.charAt(i);
		}

		System.out.println(rev);



		//	4th way-> by using count variable
		String s3 ="Bangalore";
		char st1[] = s3.toCharArray();
		int count=0;

		for(Character ch : st1)
		{
			count++;
		}

		for(int i=count-1;i>=0;i--)
		{
			System.out.print(st1[i]);
		}
		System.out.println();
		
		//5th way By using String Builder

		StringBuilder sb = new StringBuilder("Bangalore");
		System.out.print(sb.reverse());


	}
}