package TyMockProgram;

public class PrintNoOfVowelInString {
	public static void main()
	{
		String st="India";
		int vc=0;
		int cc=0;
		String s=st.toLowerCase();
		char[] ch = st.toCharArray();
		for(int i=0;i<st.length();i++)
		{
			
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
			{
				vc++;
			}
			else
			{
				cc++;
			}
		}
		System.out.println("number of vowels in String is" +vc);
	}

}
