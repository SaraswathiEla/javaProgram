package Arrays;

public class Find1stMinimumand2ndMinimumINArray {

	public static void main(String[] args) {
	    int [] a= {0,1,7,2,0,5,0,3,7,1,5};
    int fmin=a[0];
    int smin=a[0];
    for(int i=0;i<a.length;i++)
    {
    	if(a[i]<=fmin)
    	{
    		if(a[i]!=fmin)
    		{
    			smin=fmin;
    		}
    		fmin=a[i];
    	}
    	else if(fmin==smin || a[i]<smin)
    	{
    		smin=a[i];
    	}
    }
    
        System.out.println(fmin);
		System.out.println(smin);

	}

}
