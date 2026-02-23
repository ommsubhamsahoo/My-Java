package methods;

public class Calci1 {
	private int add() {
		// TODO Auto-generated method stub
		int a=1000,b=3000;
		int sum=a+b;
		return sum;
	}
	public static void main(String[] args) {
		Calci1 c = new Calci1();
		int res=c.add();
		System.out.println("sum is printed in main() :"+res);
	}
}
