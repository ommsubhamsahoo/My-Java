package arrays;

import java.util.Scanner;

public class MyArray3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of floors:");
		int i=scan.nextInt();
		int[] a= new int[i];
		//storing the data
		for(int j=0; j<i;j++)
		{
			System.out.println("Enter the number of rooms:a["+j+"]");
			a[j]=scan.nextInt();
		}
		//for accessing the data
		for(int j=0;j<i;j++)
		{
			System.out.println(a[j]);
		}
	}
}
