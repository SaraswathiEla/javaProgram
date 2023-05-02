package Strings;

import java.util.Scanner;

public class P002_StringPalindrome_UsingScannerClass {

	public static void main(String[] args) 
	{
		System.out.println("Please enter a String");
		
		Scanner sc = new Scanner(System.in);
		String s = sc.next();	//malayalam -> s.length=9
//		mom dad gadag-> palindrome				test-> not palindrome
		
		String rev="";	 
		for(int i=s.length()-1;i>=0;i--)
//			i=0 9>=0 t s.charAt(i) m 
		{
			rev = rev+s.charAt(i);
		}  //malayalam

		if(rev.equals(s))
		{
			System.out.println("its a palindrome");
		}
		else
		{
			System.out.println("not a palindrome");
		}
	}

}
