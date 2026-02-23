package arrays;

import java.util.Scanner;

public class My2DArray3 {
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int[][] ar = new int[3][4];
		
		for (int i = 0; i <ar.length; i++) 
		{
			for (int j = 0; j <=ar[i].length; j++) 
			{
				System.out.println("Enter the data: ar[" + i + "][" + j + "]");
				ar[i][j] = scan.nextInt();
			}
		}
		for (int i = 0; i<ar.length; i++)
		{
			for (int j = 0; j < ar[i].length; j++)
			{
				System.out.println(ar[i][j]);

			}
		}
	}
}
