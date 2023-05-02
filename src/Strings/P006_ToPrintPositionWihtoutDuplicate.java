package Strings;
import java.util.LinkedHashSet;

public class P006_ToPrintPositionWihtoutDuplicate {

	public static void main(String[] args) {
		String st ="Tester"; // t=1 e=2 s=3 r=6
		String s = st.toLowerCase();
//		to remove duplicates, arrange in insertion order
		LinkedHashSet<Character> set= new LinkedHashSet<>();
		for(int i=0;i<s.length();i++)
		{
			set.add(s.charAt(i));
		}

		for(Character ch:set)
		{

			for(int i=0;i<s.length();i++)
			{
				if(ch==s.charAt(i))	
					
				{
//		i tried->	System.out.println(ch+" is at index "+ i);
					
					System.out.println(ch+" is in "+ (i+1)+ " postion");
					break;
				}
			}
			
			
		}


	}

}
