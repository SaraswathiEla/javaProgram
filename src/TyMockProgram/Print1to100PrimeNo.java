package TyMockProgram;

import java.util.ArrayList;

public class Print1to100PrimeNo {

	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<>();
		  for(int n=1; n<=40; n++){
		  int c = 0;
		  for (int i = 1; i <= n; i++)
		      if (n % i == 0)
		          c++;
		  if (c == 2)
		      a.add(n);
		  else
		      continue;
		  }
		  System.out.println(a);
		  
		  
		  for(int i=0;i<a.size();i++)
		  {
			  if(i%2==0)
			  System.out.print(a.get(i)+" ");
		  }
	}

}
