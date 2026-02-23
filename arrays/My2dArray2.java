package arrays;

import java.util.Scanner;

public class My2dArray2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][] ar = new int[3][3];
		for (int r = 0; r <= 2; r++) {
			for (int c = 0; c <= 2; c++) {
				System.out.println("Enter the data: ar[" + r + "][" + c + "]");
				ar[r][c] = scan.nextInt();
			}
		}
		for (int r = 0; r <= 2; r++) {
			for (int c = 0; c <= 2; c++) {
				System.out.println(ar[r][c]);

			}
		}
	}
}
