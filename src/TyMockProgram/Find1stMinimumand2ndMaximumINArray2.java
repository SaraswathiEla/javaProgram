package TyMockProgram;
//check logic once
public class Find1stMinimumand2ndMaximumINArray2 {

	public static void main(String[] args) {
   int [] a= {1,7,2,0,5,0,3,7,1,5};
  //  int [] a= {1,2,3,4,5,6};

    int fmax=a[0];
    int smax=a[0];
    int tmax=a[0];
    for(int i=0;i<a.length;i++)
    {
    	if(a[i]>=fmax)
    	{
    		if(a[i]!=0)
    		{
    			smax=fmax;
    		}
    		else
    		{
    			tmax=fmax;
    		}
    		fmax=a[i];
    	}
    	else if(fmax==smax || a[i]>smax)
    	{
    		smax=a[i];
    	}
    	else 
    	{
    		tmax=a[i];
    	}
    }
    
        System.out.println(fmax);
		System.out.println(smax);
		System.out.println(tmax);
		
		int prduct=fmax*smax*tmax;
		System.out.println("The product first 3 maximum elmets in array is "+prduct);

	}

}
