package finalkeyword;

//final class Myfinal{} //final class can't be extended
class MyFinal {
	public void nonfinal() {
		System.out.println("inside nonfinal method");
	}

	public final void m1() {
		System.out.println("m1() is a final method cant be override.");
	}

//	public abstract final void m2(); //abstract-compulsory overide but final-can't be overriden
}

class MyChild extends MyFinal {
	@Override
	public void nonfinal() {
		System.out.println("overiding nonfinal in child class");
	}

	/*
	 * public final void m1() //final methods can't be overriden {
	 * 
	 * }
	 */
}

public class MyExecution {
	public static void main(String[] args) {
		MyChild c = new MyChild();
		c.nonfinal();
		c.m1();

		/*
		 * final double A=100.01; System.out.println(A); A=100.09;
		 * System.out.println(A);
		 */
	}
}
