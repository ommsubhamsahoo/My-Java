package abstraction;

abstract class Calci{
	public void add()
	{
		int a=10;
		int b=20;
		System.out.println("a+b ="+(a+b));
	}
	public void sub()
	{
		int a=100;
		int b=20;
		System.out.println("a-b ="+(a-b));
	}
}
public class MyLab {
public static void main(String[] args) {
	Calci c = new Calci();
}
}
