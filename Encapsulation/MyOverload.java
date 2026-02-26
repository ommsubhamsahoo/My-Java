package Encapsulation;


class Printer
{
	public void print(int a)
	{
		System.out.println("inside print1 int");
	}
	public void print(double a)
	{
		System.out.println("inside print2 double");
	}
	public void print(String a)
	{
		System.out.println("inside print3 String");
	}
	public void print(int a,float b)
	{
		System.out.println("inside print4 int & float");
	}
	public void print(String a,double b)
	{
		System.out.println("inside print5 string & double");
	}
	public void print(int a,float b,String c)
	{
		System.out.println("inside print6 int & float & string");
	}
	public void print(String a,float b,int c)
	{
		System.out.println("inside print7 string & float & int");
	}
}
public class MyOverload {
	public static void main(String[] args) {
		 Printer p1=new Printer();
		 p1.print(10);
		 p1.print(10.45);
		 p1.print("subham");
		 p1.print(10,4.5f);
		 p1.print("subham",5.6);
		 p1.print(10,5.4f,"subham");
		 p1.print("subham",23.34f,23);
		 
	}
}
