
public class SumOfnumbershouldbesingleDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=12345;
		int sum=0;
		while(x!=0)
		{
			int d=x%10;
			sum=sum+d;
			x=x/10;
		}
		
		if(sum<=9)
		{
			System.out.println("Sum of Digit on a number is " +sum);
			
		}
		else
		{
			x=sum;
			sum=0;
			while(x!=0)
			{
				int d=x%10;
				sum=sum+d;
				x=x/10;
			}
			System.out.println("Sum of Digit on a number is " +sum);

		}

	}

}
