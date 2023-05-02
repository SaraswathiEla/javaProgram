package TyMockProgram;


//check logic once
public class FindtheLengthofTheStringwiyoutUsinglength {

	public static void main(String[] args) {
String s="Saraswathi";
char[] ch = s.toCharArray();
int count=0;
System.out.println(ch.length);
for(int i=0;i<ch.length;i++)
{
	if(ch[i]!=ch.length)
	{
		count++;
	}
	
}
System.out.println("the length of the array is "+count);

	}

}
