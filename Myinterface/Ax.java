package Myinterface;

 interface interf{
	 public abstract void m1();
	 public static final int A=25;
 }
 class Alpha{
	 public void m1() {
		 System.out.println("m1() of Alpha");
	 }
 }
 class Ax extends Alpha implements interf{
	 public static void main(String[] args) {
		System.out.println(interf.A);
//		interf.A=30;
		System.out.println(interf.A);
	}
 }