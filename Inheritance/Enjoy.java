package Inheritance;

class Bank{
	public void roi() {
		// TODO Auto-generated method stub
		System.out.println("6.5%");
	}
	public static void withdraw() {
		// TODO Auto-generated method stub
		System.out.println("Bamk allows to withdraw");
	}
}
class Sbi extends Bank{
	@Override
	public void roi() {
		// TODO Auto-generated method stub
		System.out.println("8.5%");
	}
//	@overriden //static method never get override,it always hide
//	public static void withdraw() {
//		// TODO Auto-generated method stub
//		System.out.println("Bamk allows to withdraw");
//	}
}
public class Enjoy {
public static void main(String[] args) {
	Sbi s= new Sbi();
	s.roi();
	Sbi.withdraw();
}
}
