package abstraction;
abstract class MyAbstract{
	static int a = 10;
	static {
		System.out.println("inside the static block");
	}
	public static void m1() {
		System.out.println("inside static method");
	}
	int x=20;
	
	{
		
	}
	
	public void m2() {
		System.out.println("inside instance method");
	}	
	
	public abstract void m3();
}
public class MyNewClass {
public static void main(String[] args) {
	 
}
}
