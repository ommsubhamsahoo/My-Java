package arrays;

import java.util.Scanner;

public class MyArray5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of employees:");
		int i=scan.nextInt();
		double[] a= new double[i];
		for(int j=0;j<a.length;j++)
		{
			System.out.println("Enter the employys salary:");
			a[j]=scan.nextDouble();
			
			
		}
		for(int j=0;j<a.length;j++)
		{
			System.out.println(a[j]);
		}
	}
}
