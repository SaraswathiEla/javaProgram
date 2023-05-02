package Matrix;

import java.util.Scanner;

public class Create2dArray {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		int row, elem, col;

		//		elem = s.nextInt();
		System.out.println("Enter row");
		row=s.nextInt();
		System.out.println("Enter col");
		col=s.nextInt();
		System.out.println("Enter Element to insert");


		int[][] arr=new int[row][col];

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {
				arr [i][j]=s.nextInt();
			}
		}

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {
				System.out.print( arr [i][j]+" ");
			}
			System.out.println();
		}

	}

}
