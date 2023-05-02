package interview;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		
		int n=16;
		int count=0;
	
		if(n>=1)
		{
			for(int i=2;i<=n/2;i++)
			{
				if(n%i==0)
				{
					count++;
				}
			}
			
			
		}
		if(count==0)
		System.out.print("The number is  a prime number");
		
		else
			System.out.print("The number is not a prime number");

	}

}
