package Encapsulation;

class Calculator {
	void add(int a)
	{
		int c=10+a;
		System.out.println("inside int add");
	}
	void add(float b)
	{
		float d=10.5f+b;
		System.out.println("inside float add");
	}
	void add(double m)
	{
		double n=20.5+m;
		System.out.println("inside double add");
	}
	void add(int a,int b)
	{
		int c=a+b;
		System.out.println("inside int,int add");
	}
	void add(int a,float b)
	{
		float d=a+b;
		System.out.println("inside int,float add");
	}
	void add(int a,int b,float c)
	{
		float g=a+b+c;
		System.out.println("inside int,int, float");
	}
}
