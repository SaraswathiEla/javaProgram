package Strings;

import java.util.LinkedHashSet;

public class P014_RemoveDuplicateInSentence {

	public static void main(String[] args) 
	{
	String str ="I am from am from am Bangalore";
	String st = str.toLowerCase();
	String[] s= st.split(" ");
	
	LinkedHashSet<String> set = new LinkedHashSet<>();
	
	for(int i=0;i<s.length;i++)
	{
		set.add(s[i]);
	}
	
	for(String s1:set)
	{
		System.out.print(s1+ " ");
	}

	}
}