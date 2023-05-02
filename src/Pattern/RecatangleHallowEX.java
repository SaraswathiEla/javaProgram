package Pattern;

public class RecatangleHallowEX {

	public static void main(String[] args) {
		
		System.out.println("//rectangle pattern\r\n"+ "");
		//rectangle pattern
 		        int rows = 5;
		        int cols = 10;
		        
		        for (int i = 0; i < rows; i++) {
		            for (int j = 0; j < cols; j++) {
		                System.out.print("* ");
		            }
		            System.out.println();
		        }
		        
		        
				System.out.println("//Square pattern\r\n"+ "");
      
		     //Square
		        int sideLength1 = 5;

				for (int i = 0; i < sideLength1; i++) {
				    for (int j = 0; j < sideLength1; j++) {
 				            System.out.print("* ");
				     }
				    System.out.println();
				}

		        
		        
				System.out.println("// square inside no * pattern\r\n"+ "");
 
		        // square inside no *
		        
		        int sideLength = 5;

				for (int i = 0; i < sideLength; i++) {
				    for (int j = 0; j < sideLength; j++) {
				        if (i == 0 || i == sideLength - 1 || j == 0 || j == sideLength - 1) {
				            System.out.print("* ");
				        } else { 
				            System.out.print("  ");
				        }
				    }
				    System.out.println();
				}
				
				
				
				System.out.println("// rectangle inside no * pattern\r\n"+ "");

				//rectangle inside no *
				int len = 5;
		        int wid = 10;
		        
		        for (int i = 0; i < len; i++) {
				    for (int j = 0; j < wid; j++) {
				        if (i == 0 || i == len - 1 || j == 0 || j == wid - 1) {
				            System.out.print("* ");
				        } else { 
				            System.out.print("  ");
				        }
				    }
				    System.out.println();
				}
				  
		        
				System.out.println("//Triangle pattern\r\n"+ "");
  
		        int tri=5;
		        for(int i=0;i<tri;i++)
		        {
		        	for(int j=0;j<tri-i;j--)
		        	{
		        		System.out.print("* ");
		        	}
		        		System.out.println();
		        }

		    }
		}

