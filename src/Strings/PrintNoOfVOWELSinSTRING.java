package Strings;

import java.util.LinkedHashSet;

public class PrintNoOfVOWELSinSTRING {

	private static final String Linkedhashset = null;

	public static void main(String[] args) {
 
			String st="India";//3
			int count=0;
			String str=st.toLowerCase();
			char[] s=str.toCharArray();
			for(int i=0;i<s.length;i++)
			{
				if(s[i]=='a'||s[i]=='e'||s[i]=='i'||s[i]=='o'||s[i]=='u')
				{
					count++;
					System.out.println(s[i]);
				}
			}
			System.out.println(count);
			
			//Try to fetch number of vowels withou duplicate
			
			 LinkedHashSet<Character> set=new LinkedHashSet<>();
			 for(int i=0;i<s.length;i++)
			 {
				 set.add(s[i]);
			 }
			 
			 int c=0;
			 for(Character ch:set)
			 {
				 if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
				 {
					 c++;
					 System.out.println(ch);
				 }
			 }
			 System.out.println(c);
			 
}
}