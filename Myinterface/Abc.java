package Myinterface;
interface Interf{
	public abstract void m1();
	public abstract void m2();
}
abstract class Abc implements Interf {
public void m1() {
	System.out.println("inside m1() of abc ");
}
}
