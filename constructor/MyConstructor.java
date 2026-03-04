package constructor;

class Alpha{
	public Alpha()
	{
		//this(); //recursive constructor invocation
		System.out.println("i am inside alpha");
	}
}
public class MyConstructor {
public static void main(String[] args) {
	Alpha a= new Alpha();
}
}
