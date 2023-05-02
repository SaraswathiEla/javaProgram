package interview;

public class ReverseANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=12345;
		int rev=0;
		
		while (n!=0)
		{
			int d=n%10;
			rev=rev*10+d;
					
					
			n=n/10;	
		}
		System.out.println(rev);
	}

}
