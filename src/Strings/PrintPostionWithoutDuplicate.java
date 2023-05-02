package Strings;

import java.util.LinkedHashSet;

public class PrintPostionWithoutDuplicate {

	public static void main(String[] args) {
 
		
		
			String st="Saraswathi";
			String s=st.toLowerCase();
			
			// LinkedHashSet removes the duplicate 
		LinkedHashSet<Character> set=new LinkedHashSet< >();
			for(int i=0;i<s.length();i++)
			{
				set.add(s.charAt(i));
			}
			System.out.println(set);
			for(Character ch:set)
			{
				for(int i=0;i<s.length();i++)
				{
					if(ch==s.charAt(i))
					{
						System.out.println(ch+" The character postion is "+(i+1));
						break;
					}
				}
			
		 
			
			}
	}
}		
			
/*[s, a, r, w, t, h, i]
s The character postion is 1
a The character postion is 2
r The character postion is 3
w The character postion is 6
t The character postion is 8
h The character postion is 9
i The character postion is 10
	
		 */
			 