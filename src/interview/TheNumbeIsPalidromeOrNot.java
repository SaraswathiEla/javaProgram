package interview;

public class TheNumbeIsPalidromeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=555;
		int rev=0;
		int temp=n;
		
		while(n!=0) {
			
			int d=n%10;
			rev=rev*10+d;
			n=n/10;
			
			
		}
		
		if(rev!=temp)
		{
			System.out.println("The number is not a palidrome");
		}
		else
		{
			System.out.println("The number is   a palidrome");

		}
	}

}
