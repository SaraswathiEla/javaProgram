package Strings;

public class Swap1stAndLastWords {

	public static void main(String[] args) {
		
		String st="I am from Bangalore";
		String[] s=st.split(" ");
		//s[0]=1,s[1]=am,s[2]=from.s[3]=Bangalore;
		String temp=s[0];
		s[0]=s[s.length-1];
		s[s.length-1]=temp;
		for(int i=0;i<s.length;i++)
		{
			System.out.print(s[i]+" ");
		}
		
		
		// o/p
		// Bangalore am from I 
		
		// int a=10;
		//int b=20;
		//int temp=a;
		//a=b;
		//b=temp;
     
	}

}
