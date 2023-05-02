package interview;

public class Swap2NumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a= {10,20,30,40};
		System.out.println(a[0] + " "+a[1]);

		a[0]=a[0]+a[1];
		System.out.println(a[0]);
		a[1]=a[0]-a[1];
		System.out.println(a[1]);
		a[0]=a[0]-a[1];
		System.out.println("After swaping");
		
		System.out.println(a[0] + " "+a[1]);
				}

}
