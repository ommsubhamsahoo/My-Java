package MyException;

class MyError1{
	public void m3() {
		m3();   //StackOverflowError
	}
}
public class MyError2 {
public static void main(String[] args) {
	MyError1 m = new MyError1();
	m.m3();
	
}
}
