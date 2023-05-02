package Strings;
public class P010_SwapFirstAndLastWords {

	public static void main(String[] args) 
	{
		String st ="I am from Bangalore"; //o/p-> Bangalore am from I
		String[] s = st.split(" ");	
//		s[0]=I , s[1]=am, s[2]=from , s[3]=Bangalore
		String temp=s[0];
		s[0]=s[s.length-1]; // s[0]=s[3];
		s[s.length-1]=temp;
		
		for(int i=0;i<s.length;i++)
		{
				System.out.print(s[i]+ " ");	
		}
		
//		int a=10;				--> to swap numbers 
//		int b=20;
//		int temp=a;
//		a=b;
//		b=temp;
//		System.out.println(a);
//		System.out.println(b);		
	}
}
