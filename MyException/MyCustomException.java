package MyException;

import java.util.Scanner;

class underAgeException extends Exception{
	public underAgeException(String msg) {
		super(msg); 
	}
}

class MyLicense{
	public void applyLicense() throws underAgeException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age:");
		int age=sc.nextInt();
		if(age<18) {
			throw new underAgeException("You are not eligible as you are below 18");
		}
		else {
			System.out.println("You are eligiable for license.Kindly,collect it after 20 days");
		}
		
		
	}
}

public class MyCustomException {
public static void main(String[] args) {
	MyLicense m1 = new MyLicense();
	try {
		m1.applyLicense();
	}
	catch(underAgeException e){
		System.out.println(e.getMessage()); 
	}
}
}
