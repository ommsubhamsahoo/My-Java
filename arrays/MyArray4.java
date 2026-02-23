package arrays;

import java.util.Scanner;

public class MyArray4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of students:");
		int i=scan.nextInt();
		String [] a = new String[i];
		for(int j=0;j<=i;j++)
		{
			System.out.println("Enter the name of:i["+j+"]");
			a[j]=scan.next();
		}
		for(int j=0;j<=i;j++)
		{
			System.out.println(a[j]);
		}
		
	}
}
