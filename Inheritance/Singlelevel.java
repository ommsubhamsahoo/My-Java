package Inheritance;

class MyParent
{
	public void write()
	{
		System.out.println("parents are writing");
	}
}
class Childd extends MyParent
{
	
}
public class Singlelevel {
	public static void main(String[] args) {
		Childd m = new Childd();
		m.write();
	}
}
