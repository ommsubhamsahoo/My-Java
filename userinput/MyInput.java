package userinput;

import java.util.Scanner;

public class MyInput {
	String name;
	int age;
	boolean status;
	double salary;
	public static void main(String[] args) {
		
		  Scanner scan = new Scanner(System.in); MyInput i = new MyInput();
		 /* System.out.println(i.name); System.out.println(i.age);
		 * System.out.println(i.status); System.out.println(i.salary); i.name="subham";
		 * i.age=22; i.status=false; i.salary=25000.00; System.out.println(i.name);
		 * System.out.println(i.age); System.out.println(i.status);
		 * System.out.println(i.salary );
		 */
		System.out.println("Enter your name :");
		i.name=scan.next();
		System.out.println(i.name);
		System.out.println("Enter your age:");
		i.age=scan.nextInt();
		System.out.println(i.age);
		System.out.println("Enter your status:");
		i.status=scan.nextBoolean();
		System.out.println(i.status);
		System.out.println("Enter your salary:");
		i.salary=scan.nextDouble();
		System.out.println(i.salary);
	}
}
