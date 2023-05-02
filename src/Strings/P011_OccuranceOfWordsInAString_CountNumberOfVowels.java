package Strings;
public class P011_OccuranceOfWordsInAString_CountNumberOfVowels {

	public static void main(String[] args) 
	{
	String st ="India"; // count no of vowels in a String
	String str = st.toLowerCase();
	char[] s =str.toCharArray();
	
	int count=0;	//3
	
	for(int i=0;i<s.length;i++)
//		comparision happens based on ASCII value
//		i=0	0<5 t  s[i]=i
//		.
//		i=4	4<5 t  s[i]=a
	{
		if(s[i]=='a' ||s[i]=='e' ||s[i]=='i' ||s[i]=='o' || s[i]=='u')
		{
			count++;
			System.out.println(s[i]);
		}
	}
	
	System.out.println("no of vowels in a String ="+ count);	//3

	}

}