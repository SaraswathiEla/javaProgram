package Strings;

public class SubStringisThereInStringWithouUsingInbuilt {

	public static void main(String[] args)
	{
		String mainString = "This is a sample string";
		String subString = "samle";
		
		boolean flag = isSubstring(mainString,subString);
		if(flag=true)
		{
			System.out.println("is present");
		}
		else
		{
			System.out.println("is not  present");
	
		}
	}
	public static boolean isSubstring(String mainString, String subString) {
		    int m = mainString.length();
		    int n = subString.length();
		    for (int i = 0; i <= m - n; i++) {
		        int j;
		        for (j = 0; j < n; j++) {
		            if (mainString.charAt(i + j) != subString.charAt(j)) {
		                break;
		            }
		        }
		        if (j == n) {
		            return true;
		        }
		    }
		    return false;
		}

	}


