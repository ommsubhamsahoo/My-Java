package MyFunInterface;

interface Opns{
	void add(int a,int b);
}

/*
 * class Calc implements Opns{ public void add(int a, int b) { int c=a+b;
 * System.out.println("Sum is :"+c); } }
 */
public class MyMain {
public static void main(String[] args) {
	/*
	 * Calc c = new Calc(); c.add(100, 200);
	 */
	Opns a1=(int a,int b)->{
		int c=a+b;
		System.out.println("Sum is :"+c);
	};
	a1.add(100, 200);
}
}
