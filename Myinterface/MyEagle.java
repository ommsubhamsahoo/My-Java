package Myinterface;

interface Bird{
	public abstract void fly();
	public abstract void eat();
}
abstract class Eagle implements Bird{
	public void fly() {
		System.out.println("Eagle flies in greater heights.");
	}
	
}
class GoldenEagle extends Eagle{
	public void eat() {
		System.out.println("GE feeds on fish.");
	}
}
class SerpantEagle extends Eagle{
	public void eat() {
		System.out.println("SE feeds on snakes.");
	}
}
public class MyEagle {
public static void main(String[] args) {
	Eagle e= new GoldenEagle();
	e.fly();
	e.eat();
}
}
