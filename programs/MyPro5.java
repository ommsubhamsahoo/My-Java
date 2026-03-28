package programs;

import java.util.Scanner;

public class MyPro5 {
public static void main(String[] args) {
	String s="ROOMAN";
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter any character from ROOMAN :");
	char ch=sc.next().charAt(0);
	for(int i=s.length()-1;i>=0;i--) {
		if(ch==s.charAt(i)) {
			System.out.println(i);
			return;
		}
		
	}
	System.out.println(-1);
}
}
