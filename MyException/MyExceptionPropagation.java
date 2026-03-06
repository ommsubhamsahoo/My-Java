package MyException;
import java.util.InputMismatchException;
import java.util.Scanner;
class Demo3{
	
	public void m3() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Connection4 established");
		try {
			System.out.println("Enter your age");
			int age = scan.nextInt();
			System.out.println("Age entered is "+age);
		}
		catch(InputMismatchException e){
			System.out.println("Age can't be string.");
			System.out.println("Connection 4 is handled.");
		}
		System.out.println("Connection4 terminated");

	}
}

class Demo2{
	
	public void m2() {
		System.out.println("Connection3 established");
		Demo3 d3=new Demo3();
		try {
			d3.m3();
		}
		catch(InputMismatchException e) {
			System.out.println("age cant be string");
			System.out.println("connection3 is handled.");
		}
		System.out.println("Connection3 terminated");

	}
}

class Demo1{
	
	public void m1() {
		System.out.println("Connection2 established");
		Demo2 d2=new Demo2();
		try {
			d2.m2();

		}
		catch(InputMismatchException e) {
			System.out.println("age cant be string");
			System.out.println("connection2 is handled.");
		}
		System.out.println("Connection2 terminated");

	}
}


public class MyExceptionPropagation {
	public static void main(String[] args) {
		System.out.println("Connection1 established.");
		
		Demo1 d1 = new Demo1();
		d1.m1();
		
		System.out.println("Connection1 terminated.");
	}
}
