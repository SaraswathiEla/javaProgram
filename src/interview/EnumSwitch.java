package interview;

public class EnumSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Months.class);//it will print package and Enum
		System.out.println(Months.apr);//it will print package and Enum
    Months b=Months.apr;
 		switch(b)
 		{
 		case apr:System.out.println(" April"); 
 					break;
 					default :System.out.println("the month name is not match");
 					break;
 		}

	}

}
