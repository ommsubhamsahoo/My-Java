package MyException;

import java.util.Scanner;

class MyAtm {
	public void m1() throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Connection Establiehed");
		try {
			System.out.println("enter a:");
			int a = sc.nextInt();
			System.out.println("enter b:");
			int b = sc.nextInt();
			int c = a / b;
			System.out.println("Result of a/b is" + c);
		} catch (Exception e) {
			System.out.println("sorry for the incovenience. ");
			throw e;
		} finally {
			System.out.println("Connection terminated.");
			sc.close();
		}

	}
}

public class MyRethrow {
	public static void main(String[] args) {
		MyAtm a = new MyAtm();
		try {
			a.m1();
		} catch (Exception e) {
			System.out.println("Exception caught in main method");
			e.printStackTrace();
		}
	}
}
