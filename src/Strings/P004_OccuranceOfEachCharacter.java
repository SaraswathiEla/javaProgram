package Strings;

import java.util.LinkedHashSet;

public class P004_OccuranceOfEachCharacter {

	public static void main(String[] args) 
	{
	
		String st ="TestYantra";
		String s = st.toLowerCase();
//		to remove duplicates
		LinkedHashSet<Character> set= new LinkedHashSet<>();
		for(int i=0;i<s.length();i++)
		{
			set.add(s.charAt(i));
		}

		for(Character ch:set)
		{
			int count=0;
			for(int i=0;i<s.length();i++)
			{
				if(ch==s.charAt(i))
//					ch  s.charAt(i)		count
//					t		t			 2
//							e
//							s
//							t
//							
//					e		test		1
//					s		test		1		
					
					
				{
					count++;
				}
			}
			System.out.println(ch+" is repeating "+count +" times ");
		}
	}

}