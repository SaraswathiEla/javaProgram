package interview;

import java.util.LinkedHashSet;

public class InASentenceRemoveDuplicatewords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="this is fun show";
		String s2="fun tv show";
		
		//concatinate 2 String
		String s3=s1+" "+s2;
		System.out.println(s3);  //this is fun show fun tv show


		//split the String base on space then gives String array
		String[] s4 = s3.split(" ");
		
		
		//LinkedHashSet doesnot allow the duplicate
		LinkedHashSet<String> set=new LinkedHashSet();
		for(int i=0;i<s4.length;i++)
		{
			set.add(s4[i]);
		}
 
		
		//logic for Count the  duplicate words  and if count ==1 it will print the unique word
		
		for(String st:set) 
		{
			int count=0;

			for(int i=0;i<s4.length;i++)
			{
				if(st.equals(s4[i]))
				{
					count++;
				}
			}
			if(count==1) 
			{
				System.out.print(st+" ");
			}

		}




	}

}
