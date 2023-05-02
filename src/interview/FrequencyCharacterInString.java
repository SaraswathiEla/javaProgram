package interview;

import java.util.LinkedHashSet;

public class FrequencyCharacterInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="saraswathi";
		
		//count the array to Store the Frequency of character
		int frequency[]=new int[256];
		
		//iterate through the String
		for(int i=0;i<s.length();i++)
		{
		      frequency[(int)s.charAt(i)]++; 
		}

		//traverse through the counter array
		for(int i=0;i<frequency.length;i++)
		{
			//if the frequency of character is not 0
			if(frequency[i]!=0)
			{
				//print the character along with the its frequency
				System.out.println((char)i+"-" +frequency[i]);
			}
		}
		
		
		System.out.println("==============Anoyher way=======================");
		
		
		
		LinkedHashSet <Character> set=new LinkedHashSet();
		
		for(int i=0;i<s.length();i++) {
			set.add(s.charAt(i));
		}
		
		for(Character su:set)
		{
			int count=0;
			for(int i=0;i<s.length();i++)
			{
				if(su==s.charAt(i))
				{
					count++;
				}
				
			}
			System.out.println(su+" "+count);

		}
		
		System.out.println("==============END=======================");
		 	

	}

}
