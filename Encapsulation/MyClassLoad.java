package Encapsulation;

class Demo
{
	int a= 10;
	int b=20;
	
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("inside display()");
		System.out.println(a);
		System.out.println(b);

	}
}
public class MyClassLoad {
public static void main(String[] args) {
	Demo d = new Demo();
	d.display(); 
}
}
