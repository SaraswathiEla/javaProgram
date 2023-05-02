package Arrays;

public class AddditionTwoArrays {

	public static void main(String[] args) {
		
		//Addition of 2 arrays
		// o/p: 5 6 5 6 6
		int [] a= {2,4,1,5,6};
		int [] b= {3,2,4,1};
		 int length=a.length;
		 if(a.length<b.length)
		 {
			 length=b.length;
		 }
		 else
		 {
			 length=a.length;

		 }
		 
		 for (int i=0;i<length;i++)
		 {
			 try {
				 	System.out.println(a[i]+b[i]+" ");
			 	  }
		 catch(Exception e)
			 {
			 if(a.length<b.length)
			 {
			 System.out.println(a[i]);
			 }
			 else
			 {
				 System.out.println(a[i]);

			 }
		 
		 }
		 
		
		
		 
		 }
	}
}
/* exception:- ARRAYINDEX out OF BOND 
 * whenever we try to do the operation out of array size we get
  			==>ARRAYINDEX out OF BOND(Unchecked exception i.e runtime exception)
 * we can handle that exception using  try catch block
		EX:-
		
		 for (int i=0;i<length;i++)
		 {
			 try {
				 	System.out.println(a[i]+b[i]+" ");
			 	  }
		 catch(Exception e)
			 {
			 if(a.length<b.length)
			 {
			 System.out.println(a[i]);
			 }
			 else
			 {
				 System.out.println(a[i]);

			 }


*/