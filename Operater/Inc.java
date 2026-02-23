package Operater;

import java.util.Iterator;

public class Inc {
	public static void main(String[] args) {
		int a=20;
		int b=22;
		int c=--a + --b + a++ + b++ ;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
	}
}
