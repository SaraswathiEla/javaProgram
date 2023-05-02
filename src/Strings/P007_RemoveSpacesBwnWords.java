package Strings;
public class P007_RemoveSpacesBwnWords {

	public static void main(String[] args) 
	{
//	String st ="I am from Banagalore"; //o/p: IamfromBangalore
//		System.out.println(st.replace(" ",""));

		String st ="I am from Banagalore";
//		String[] s = st.split(" ");
		String s[] = st.split(" ");
		
		for(int i=0;i<s.length;i++)
		{
			System.out.print(s[i]);
		}
	}

}
