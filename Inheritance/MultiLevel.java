package Inheritance;

class MyGrantparent
{
	public void read()
	{
		System.out.println("grant parents are reading");
	}
}
class Myparents extends MyGrantparent
{
	
}
class Child extends Myparents
{
	
}
public class MultiLevel {
	public static void main(String[] args) {
		Child m = new Child();
		m.read();
	}
}
