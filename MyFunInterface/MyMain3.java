package MyFunInterface;

@FunctionalInterface //->it is a interface that consist of a single abstract method.
interface Calc{
	int mul(int a,int b);
//	int add(int m,int n);
	
	//We can add these following three methods with body.
	
//	default void add() {
//		
//	}
//	static void add1() {
//		
//	}
//	private void add2() {
	
//}
	
}
public class MyMain3 {
public static void main(String[] args) {
//	Calc o=(int a,int b)->a*b;
	Calc o=( a, b)->a*b; //Reducing code 

	int res=o.mul(100, 200);
	System.out.println("mul is :"+res);
}
}
