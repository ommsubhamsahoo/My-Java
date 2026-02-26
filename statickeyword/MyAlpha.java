package statickeyword;

class MyStatic{
	static int x; 
	static int y;
	static {
		System.out.println("onsode static block.");
	}
	public static void staticmethod() {
		System.out.println("inside static method");
		System.out.println("accessing static variables");
		System.out.println(x);
		System.out.println(y);
	}
	int a;
	int b;
	{
		System.out.println("inside static block");
		a=100;
		b=200;
	}
	public void instancemethod() {
}
public class MyAlpha {

}
}
