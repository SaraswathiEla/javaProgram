package Strings;
import java.util.LinkedHashSet;

public class P011_CountNumberOfVowelsInAStringWithoutDuplicate {

	public static void main(String[] args) 
	{	

	String st ="SoftwareTesting"; // 4
	String str = st.toLowerCase();
	char[] s =str.toCharArray();

	LinkedHashSet<Character> set = new LinkedHashSet<>();
	
	for(int i=0;i<s.length;i++)
	{
		set.add(s[i]);
	}
	int count=0;	
	
	for(Character ch : set)        // o a e i
	{
		if(ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' || ch=='u')
		{
			count++;
			System.out.println(ch);
		}
	}
	
	System.out.println("no of vowels in a String ="+ count);	//3

	}

}