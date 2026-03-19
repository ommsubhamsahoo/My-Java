package MyException;

public class MyError {
public static void main(String[] args) {
	int[] a= new int[Integer.MAX_VALUE];//OutOfMemoryError
	System.out.println(a.length);
}
}
