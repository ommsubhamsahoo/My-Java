package arrays;

import java.util.Scanner;

public class My3dArray2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int [][][] a= new int[2][][];
		a[0]=new int[3][];
		a[0][0]=new int[3];
		a[0][1]=new int[2];
		a[0][2]=new int[3];
		
		a[1]=new int[4][];
		a[1][0]=new int[1];
		a[1][1]=new int[2];
		a[1][2]=new int[3];
		a[1][3]=new int[1];
		
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
