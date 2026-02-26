package Inheritance;

class Creditcard{
	public void creditlimit() {
		// TODO Auto-generated method stub
		System.out.println("credit limit upto 50000");
	}
}
class Axiscard extends Creditcard{
	@Override
	public void creditlimit() {
	System.out.println("inside axis card credit limit");
	}
}
public class MyTransaction {
	public static void main(String[] args) {
		Axiscard a = new Axiscard();
		a.creditlimit();
	}
}
