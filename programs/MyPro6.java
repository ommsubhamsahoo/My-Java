package programs;

import java.util.Scanner;

public class MyPro6 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String s="ROOMAN";
	String t="";
	System.out.println("Enter starting index from ROOMAN :");
	int f=sc.nextInt();
	System.out.println("Enter ending index from ROOMAN :");
	int e=sc.nextInt();
	for(int i=f;i<e;i++) {
		t=t+(char)(s.charAt(i));
	}
	System.out.println(t);

	
}
}
