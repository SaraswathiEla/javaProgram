package interview;

public class frequencyOfcharacterInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	String s="AAA&&&&apple appium application";
		String s="A@$app pleapp iumappli";
//String can hold 128 chracter
		
		
 	int count[]=new int[128];
	for (int i = 0; i < s.length(); i++)
	{
		
		char ch=s.charAt(i);
		count[ch]++;
	}
		
	for(int i=0;i<128;i++)
	{
		if(count[i]!=0)
		if(count [i]>1)
			System.out.println((char)i+"   "+count[i]);
		
	}
	}

}
