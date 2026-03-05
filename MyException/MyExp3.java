package MyException;

import java.util.Scanner;

public class MyExp3 {
public static void main(String[] args) {
	System.out.println("Connection established");
	Scanner scan = new Scanner(System.in);
	int[] arr=new int[3];
	arr[0]=10;
	arr[1]=20;
	arr[2]=30;
	try {
		System.out.println("Enter the index u need to access :");
		int index=scan.nextInt();
		System.out.println(arr[index]);
	}
	catch(Exception e) {
		System.out.println("Give from 0,1,2");
	}
	System.out.println("Connection terminated.");
	
}
}
