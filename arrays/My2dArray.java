 package arrays;

import java.util.Scanner;

public class My2dArray {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][] ar = new int[2][4];
		for (int i = 0; i <= 1; i++) {
			for (int j = 0; j <= 3; j++) {
				System.out.println("Enter the data: ar[" + i + "][" + j + "]");
				ar[i][j] = scan.nextInt();
			}
		}
		for (int i = 0; i <= 1; i++) {
			for (int j = 0; j <= 3; j++) {
				System.out.println(ar[i][j]);

			}
		}
	}
}
