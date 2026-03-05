package MyException;
import java.util.Scanner;
public class MyExp4 {
	public static void main(String[] args) {
		
	
	System.out.println("Connection established");
	Scanner scan = new Scanner(System.in);
	try {
		System.out.println("Enter the size of an array :");
		int n=scan.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the index u need to access :");
		int index=scan.nextInt();
		System.out.println(arr[index]);
	}
	catch(Exception e) {
		System.out.println("Give the index you want to access. ");
		
	}
	System.out.println("Connection terminated.");
	}
}
