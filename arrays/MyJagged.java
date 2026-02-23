package arrays;

import java.util.Scanner;

public class MyJagged {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][] a=new int[2][];
		
		a[0]=new int[2];
		a[1]=new int[3];
		for(int r=0;r<a.length;r++)
		{
			for(int c=0;c<a[r].length;c++)
			{
				System.out.println("Enter the data a["+r+"]["+c+"]");
				a[r][c]=scan.nextInt();
			}
		}
		for(int r=0;r<a.length;r++)
		{
			for(int c=0;c<a[r].length;c++)
			{
				System.out.print(a[r][c]+"");
				
			}
			System.out.println();
		}
	}
}
