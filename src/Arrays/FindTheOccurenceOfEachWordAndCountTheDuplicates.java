package Arrays;

import java.util.LinkedHashSet;

public class FindTheOccurenceOfEachWordAndCountTheDuplicates {
	public static void main(String args[])
	{	
	String st="I am am from i TestYanta";
	String str=st.toLowerCase();
	String[] s=str.split(" ");
	LinkedHashSet<String> set=new LinkedHashSet<>();
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
		System.out.println(stri+" is repeating "+count+ " times");

	
	}	

}
}