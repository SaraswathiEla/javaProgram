package interview;

import java.util.Scanner;

public class PrintTableOfANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number To print table");

		int n=sc.nextInt();
		
		for(int i=1;i<=20;i++)
		{
			System.out.println(n+" X "+i+" = "+n*i);
		}
		
	

	}

}
