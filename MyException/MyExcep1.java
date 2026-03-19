package MyException;

import java.util.Scanner;

public class MyExcep1 {
public static void main(String[] args) {
	System.out.println("Connection established :");
	Scanner scan = new Scanner(System.in);
	try {
		System.out.println("Enter ur age :");
		int age=scan.nextInt();
		System.out.println("Age entered is :"+age);
	}
	catch(Exception e) {
		System.out.println("Age can't be string,kindly provide integer");
	}
	System.out.println("Connection terminated gracefully.");
}
}
 