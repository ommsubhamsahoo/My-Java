package Inheritance;

class Parent
{
	public void sing()
	{
		System.out.println("parent are singing");
	}
}
class Son1 extends Parent
{}
class Son2 extends Parent
{}
class Son3 extends Parent
{}
public class Heirarchical {
	public static void main(String[] args) {
		
	
	Son1 s1 = new Son1();
	s1.sing();
	Son2 s2 = new Son2();
	s2.sing();
	Son3 s3 = new Son3();
	s3.sing();
	}
}
