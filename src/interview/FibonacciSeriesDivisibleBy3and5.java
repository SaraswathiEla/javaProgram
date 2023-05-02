package interview;

public class FibonacciSeriesDivisibleBy3and5{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=15;
		int n2=30;
		int n3;
		int n=10;
 		System.out.println(n1);
		System.out.println(n2);
		
		for(int i=2;i<=1000;i++)
		{
			n3=n1+n2;
			if((n3%5)==0 &&( (n%3)==0))
			{
				System.out.println(n3);

			}
			n1=n2;
			n2=n3;
		}
		

		
		
	}

}
