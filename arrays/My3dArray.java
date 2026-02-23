package arrays;

import java.util.Scanner;

public class My3dArray {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][][] a=new int[2][3][4];
		for(int b=0;b<a.length;b++)
		{
			for(int r=0;r<a[b].length;r++)
			{
				for(int c=0;c<a[b][r].length;c++)
				{
					System.out.println("Enter the data:a["+b+"]["+r+"]["+c+"]");
					a[b][r][c]=scan.nextInt();
				}
			}
		}
		for(int b=0;b<a.length;b++)
		{
			for(int r=0;r<a[b].length;r++)
			{
				for(int c=0;c<a[b][r].length;c++)
				{
					System.out.print("["+a[b][r][c]+"]"+" "); 
					
				}
				System.out.println();
			}
		}

	}
}
