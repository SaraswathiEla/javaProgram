package interview;

import java.util.Scanner;

public class AmstrongNumber {
	
	public static void main(String[] args) {
	
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number to check it amstrong or not");
		int n=sc.nextInt();  //453
		
		
		
		int temp,digit=0;
		int sum=0;
 		temp=n;
		while(temp!=0)
		{
			temp=temp/10;
			digit++;
		}
		
		System.out.println(digit);
		
		temp=n;
		while(temp!=0)
		{
			int last=temp%10;
			sum +=  (Math.pow(last, digit));   
			 temp=temp/10;
 	    }
		System.out.println(sum);
		if(n==sum)// 453==216 f
		{
			System.out.println("it is amstrong number");
		}
		else
		{
			System.out.println("it is not a amstrong number");

		}
	}

}
