package Strings;

public class ConvertTheFirstLetterToUppercase 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		String s= "my Name iS sara";  //a=97 A=65 0=45
		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++)
		{
			if((i==0 && ch[i]!=' ') ||(ch[i]!=' ' && ch[i-1]==' '))
					{
						if(ch[i]>'a'&& ch[i]<'z')
						{
							ch[i]=(char)(ch[i]-32);//uppercase
						}
						
					}
			else if(ch[i]>'A'&& ch[i]<'Z')
			{
				ch[i]=(char)(ch[i]+32);
			}
		}
//			String sc=ch.toString();// this will return the address of string
//			System.out.println(sc);
//			  
		String s1=new String(ch);

			System.out.println(s1);
		
	
}


}