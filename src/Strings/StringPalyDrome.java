package Strings;

import java.util.Scanner;

public class StringPalyDrome {

	public static void main(String[] args) {
 
		
		String s="malayalam";
		String rev="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		if(rev.equals(s))
		{
			System.out.println("It is a Palidrome");
		}
		else
		{
			System.out.println("It is not a  Palidrome");
		}
		
 		//2nd way

		StringBuilder st=new StringBuilder(s);
		System.out.println(st.reverse());
		if(st.reverse().equals(st))
		{
			System.out.println("It is a Palidrome");
		}
		else
		{
			System.out.println("It is not a  Palidrome");
		}
		
		
		 		
	}

}
