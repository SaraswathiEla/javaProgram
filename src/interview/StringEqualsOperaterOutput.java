package interview;

public class StringEqualsOperaterOutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="hello";
		String s2="hello";
		String s=new String ("hello");
		String st=new String ("hello");

		System.out.println(s1==s); //false//it will compare address
		System.out.println(s1.equals(s)); //True //the address is different but it will consider value 
		System.out.println(s +" and "+ s1);
		
		System.out.println(s1==s2); //true  //here  both String value is same so it refere same addresss
		System.out.println(s==st); //false  //bcoz the Sting object refence is differnce

		
	}

}
