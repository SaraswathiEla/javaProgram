package interview;

public class FrquencyOfMatchingCharacterInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="bating batrunner batsman";//"apple appium application";  //"batrunner  batsman bating";
		String[] arr = s.split(" ");
		System.out.println(arr[0]);
		boolean flag=true;
		int count=0;
		String value="";
		for(int i=0;i<arr[0].length();i++)
		{
			String s1=arr[0].substring(0,i+1);
	//	System.out.println(s1);
//			//a
//			ap
//			app
//			appl
//			apple
 			
			for(int j=1;j<arr.length;j++)
			{
				if(!arr[j].startsWith(s1))
				{
					System.out.println(arr[0].substring(0,i));
					  value=arr[0].substring(0,i);
					  

 				flag=false;

					break;
							
				}
 
			}
			
			
			
			if(flag==false)
				break;
		 
		}
		
		for(int k=0;k<arr.length;k++)
		{
			if(arr[k].contains(value))
				count++;
		}
		System.out.println(value+":"+count);
	}

}
