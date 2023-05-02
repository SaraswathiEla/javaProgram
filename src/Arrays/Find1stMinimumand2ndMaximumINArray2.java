package Arrays;

public class Find1stMinimumand2ndMaximumINArray2 {

	public static void main(String[] args) {
    int [] a= {1,7,2,0,5,0,3,7,1,5};
    int fmax=a[0];
    int smax=a[0];
    for(int i=0;i<a.length;i++)
    {
    	if(a[i]>=fmax)
    	{
    		if(a[i]!=0)
    		{
    			smax=fmax;
    		}
    		fmax=a[i];
    	}
    	else if(fmax==smax || a[i]>smax)
    	{
    		smax=a[i];
    	}
    }
    
        System.out.println(fmax);
		System.out.println(smax);

	}

}
