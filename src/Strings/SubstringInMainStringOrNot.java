package Strings;

public class SubstringInMainStringOrNot {
	public static void main(String args[])
	{
		String mainString = "This is a sample string";
		String subString = "sample";
			


	boolean isPresent = mainString.contains(subString);
	if (isPresent) {
	    System.out.println("Substring found in the main string");
	} else {
	    System.out.println("Substring not found in the main string");
	}

	
}
}
