package arrays;

import java.util.Scanner;


public class MyArray2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] a=new int[5];
		//For storing data
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Enter data for a["+i+"]");
			a[i]=scan.nextInt();
		}
		for(int i=0;i<=4;i++)
		{
			System.out.println(a[i]);
		}
	}
}
