package Strings;

public class FindSumOf2digitsInString {

	public static void main(String[] args) {
 
		String s="a12b13v5";//30
		int tsum=0;// 0 12 25
		int sum=0;// 0 1 12 0 1 13 0
		for(int i=0;i<s.length();i++)
			//i=0 0<8t
		{
			if(s.charAt(i)>='0' && s.charAt(i)<='9')
			{
			int n=s.charAt(i)-48;//n=49-48=1
			tsum=tsum*10+n;
			}
		
		else
		{
			sum=sum+tsum;
			tsum=0;
		}
	}
		sum=sum+tsum;//25+5=30
		System.out.println(sum);
		
	
	}

}
