package datatype;

public class MyChar {

	public static void main(String[] args) {
		char c = 65;
		System.out.println(c);
		char d = 90;
		System.out.println(d);
		char e = 97;
		System.out.println(e);
		char f = 122;
		System.out.println(f);
		for (char i = 65; i <= 90; i++) {
			System.out.print(i);
		}
		for (char i = 97; i <= 122; i++) { 
			System.out.println(i);
		}
		for(char z ='\u0B00';z<='\u0B7F';z++)
		{
			System.out.println(z);
		}
		for(int x=65;x<=90;x++)
		{
			System.out.println((char)x);
		}
			

	}

}
