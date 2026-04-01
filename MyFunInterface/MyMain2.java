package MyFunInterface;

interface Opns1{
	int add(int a,int b);
}
public class MyMain2 {
public static void main(String[] args) {
	/*
	 * Opns1 m=(int a,int b)->{ int c=a+b; return c; };
	 */
	Opns1 m=(int a,int b)->a+b; //Reducing code
	int res=m.add(100, 200);
	System.out.println("sum is :"+res);
}
}
