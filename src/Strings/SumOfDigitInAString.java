package Strings;

public class SumOfDigitInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="a2b4f6";//12
  		int sum=0;
		for(int i=0;i<s.length();i++)
		{
			  if(s.charAt(i)>='0' && s.charAt(i)<='9')
			{
				  int n=s.charAt(i)-48;  //charAt(i) contains ASCII value 0 is 48   and ascii value 9 is 57
				  							//50-48=2
				  							//52-48=4
				  							//54-48=6
				sum=sum+n; //2+0 ,2+4,6+6 =12
			}
	}
		
		System.out.println(sum);
	}
		

}
