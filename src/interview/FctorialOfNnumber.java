package interview;

public class FctorialOfNnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=5;
		int fact=1;
		for (int i = 1; i<=n; i++) {
			fact =i*fact;
			
		}
		System.out.println("the factorial of number is:" +fact);
	}

}
