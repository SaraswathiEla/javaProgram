package Strings;
public class P009_ReverseTheWords {

	public static void main(String[] args) 
	{
		String st ="I am from Bangalore"; //o/p-> I ma morf erolaganaB
		String[] s = st.split(" ");	
		
		for(int i=0;i<=s.length-1;i++)
		{
			// i=0 0<4t
			String str = s[i];  //am
			for(int j=str.length()-1;j>=0;j--)
//				j=1 1>=0t
//				j=0 0>=0t
			{
				System.out.print(str.charAt(j));
			}
			System.out.print(" ");// comment this line to get o/p->	// ImamorferolaganaB
		}
		

/*	i tried
 * 		for(int i=0;i<=s.length-1;i++)
		{
			if(s[i]==" ")
			{
				for(int j=s.length-1;j>=0;j++)
				{
					System.out.print(s[i]+ " ");
				}			
			}
			break;	
		}
*/		
		

	}

}
