package TyMockProgram;

public class RemoveSpaceInGivenString {

 		public static void main(String[] args) {
			 
			//1 st way 
			
				String st1="I am from Bangalore";
				
				System.out.println(st1.replace(" ",""));
//				String st2 = st1.replace(" ","$");
//				System.out.println(st2.replace("$"," "));
//				String st3 = st2.replaceAll("am", "ma");
//				System.out.println(st3);
//				
				//2nd way
			String st="my name is abc";
			String[] s=st.split(" ");
			for(int i=0;i<s.length;i++)
			{
				System.out.print(s[i]);
			}
	 		
				
				
		}

	

	}


