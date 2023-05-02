package Strings;

import java.util.Scanner;

public class CountUpperLowerCase {

	public static void main(String[] args) {
 
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");

		String s=sc.next();
		
		int up=0;
		int lw=0;
		for(int i=0;i<s.length();i++)
		{
			if( s.charAt(i)>='A' && s.charAt(i)<='Z')  //ascii A=65 Z=90
			{
				up++;
			}
			if( s.charAt(i)>='a' && s.charAt(i)<='z') //ASCII a=97 and z=122
			{
				lw++;
			}
			
		}
	System.out.println("The total number of uppercase in given String is "+up);
	System.out.println("The total number of lowercase in given String is "+lw);
		
		
	}

}
