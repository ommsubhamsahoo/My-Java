package MyException;

import java.util.Scanner;

public class MyExp2 {
public static void main(String[] args) {
	System.out.println("Connection established");
	
	Scanner scan = new Scanner(System.in);
	try {
		System.out.println("Enter int a :");
		int a= scan.nextInt();
		System.out.println("Enter int b :");
		int b= scan.nextInt();
		int c=a/b;
		System.out.println("Result of a/b is :"+c);
	}
	catch(Exception e) {
		System.out.println("Give the integer type data");
	}
	System.out.println("Connection terminated.");
}
}
