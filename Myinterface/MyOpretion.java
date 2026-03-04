package Myinterface;
 
interface Calculator{
	public abstract void add();
	public abstract void sub();
}
class Calci implements Calculator{
	public void add() {
		int a=100,b=200;
		System.out.println("a+b="+(a+b));
	}
	public void sub()
	{
		int a=200,b=100;
		System.out.println("a-b="+(a-b));
	}
	}
class SciCalci implements Calculator{
	public void add() {
		int a=1000;
		int b=2000;
		System.out.println("sum="+(a+b));
	}
	public void  sub()
	{
		int a=5000,b=2000;
		System.out.println("diff="+(a-b));
	}
	}
class MathCalci implements Calculator{
	public void add()
	{
		int a=10,b=300;
		System.out.println("Addition="+(a+b));
	}
	public void sub()
	{
		int a=1000,b=100;
		System.out.println("Substraction="+(a-b));
	}
}
public class MyOpretion {
public static void main(String[] args) {
	Calci c1 = new Calci();
	SciCalci c2 = new SciCalci();
	MathCalci c3 = new MathCalci();
	c1.add();
	c1.sub();
	System.out.println();
	c2.add();
	c2.sub();
	System.out.println();
	c3.add ();
	c3.sub();
	System.out.println();
	
}
}
