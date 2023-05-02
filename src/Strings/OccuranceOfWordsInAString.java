package Strings;

import java.util.LinkedHashSet;

public class OccuranceOfWordsInAString {

	public static void main(String[] args) {
 
		String st="I am from  from am Bangalore";
		String str=st.toLowerCase();
		String[] s=str.split(" ");
		LinkedHashSet<String> set =new LinkedHashSet<>();
		for(int i=0;i<s.length;i++)
		{
			set.add(s[i]);
		}
		for(String stri:set)
		{
			int count=0;
			for(int i=0;i<s.length;i++)
			{
				if(stri.equals(s[i]))
				{
					count++;
				}
			}
			
			System.out.println(stri+" is repeating "+count+"times");
			
			
		 			
			
		}
	}

}

/*
 * o/p:-
 * 
 * 	i is repeating 1times
am is repeating 2times
from is repeating 2times
 is repeating 1times
bangalore is repeating 1times
*/