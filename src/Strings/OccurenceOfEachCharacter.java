package Strings;

import java.util.LinkedHashSet;

public class OccurenceOfEachCharacter {

	public static void main(String[] args)
	{
			String st="Saraswathi";
			String s=st.toLowerCase();
			
			// LinkedHashSet removes the duplicate 
		LinkedHashSet<Character> set=new LinkedHashSet< >();
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
					{
						count++;
					}
				}
				System.out.println(ch+" is repeated "+count+" time");
			}
  
	}

}
