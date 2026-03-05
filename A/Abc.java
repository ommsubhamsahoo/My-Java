package A;

 public class Abc {
	 private int a;
	 		 int b;
	 protected int c;
	 public int d;
	 
	 public void m1()
	 {
		 System.out.println(a); 
		 System.out.println(b);
		 System.out.println(c);
		 System.out.println(d);
	 }
}

 class Efg extends Abc{
	 @Override
	public void m1() {
		// System.out.println(a); //because private member only access within the same class within same package
		 System.out.println(b);
		 System.out.println(c);
		 System.out.println(d);
	}
 }