package Strings;
import java.util.Scanner;

public class P003_CountNoOfUpperCaseAndLowerCase {

	public static void main(String[] args) 
	{
	for(;;) // infinite loop
	{
		System.out.println("Enter a string");
		
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		int uppercase=0;	// 2
		int lowercase=0;	//2
		
		for(int i=0;i<s.length();i++)		//TeSt
		{
			//i=0;i<4 t s.charAt(i) -> T
//			//i=1;i<4 t s.charAt(i) -> e -> following if cond not exceuted, else if will be executed
			
			if(s.charAt(i)>='A' && s.charAt(i)<='Z')
			{
				uppercase++;
				
			}
			else if (s.charAt(i)>='a' && s.charAt(i)<='z')
			{
				lowercase++;
			}
		}
		
		System.out.println("no of uppercase ="+ uppercase); //2
		System.out.println("no of lowercase ="+ lowercase); //2
	}

	}

}
