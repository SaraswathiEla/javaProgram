package Strings;

public class ReverseString {

	/*  1st way
	 * public static void main(String[] args) {
		String s="Bangalore";
		String rev=" ";
		for(int i=0;i<s.length();i++)
		{
			char[] ch=s.toCharArray();
			rev=ch[i]+rev;
		}
		System.out.println(rev);
		
		
	}
	*/
	
	/* 2nd way
	
	public static void main(String[] args) {
		String s="Bangalore";
		char[] ch=s.toCharArray();

 		for(int i=s.length()-1;i>=0;i--)
		{
 		
		System.out.print(ch[i]);
		}
		
	}
*/
	
	/*
	//3rd way
	public static void main(String[] args) {
		String s="Bangalore";
 		for(int i=s.length()-1;i>=0;i--)
 		{
 			System.out.print(s.charAt(i));
 		}

 		*/
	
	
	
 		//4th way
	/*
	public static void main(String[] args) {

	String s="Bangalore";
	char [] st=s.toCharArray();
	int count=0;
	for(Character ch:st)
	{
		count++;
	}
	for(int i=count-1;i>=0;i--)
	{
		System.out.print(st[i]);
	}
	*/
	
	
	
		//5th way
	public static void main(String[] args) {

	StringBuilder s=new StringBuilder("Bangalore");
	System.out.println(s.reverse());

}
}
