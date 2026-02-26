package Inheritance;


class Dog{
	String name;
	int cost;
	String breed="German shepard";
	
	public Dog(String name) {
		System.out.println("inside name constructor");
		this.name = name;
	}
	
	
	public Dog(int cost) {
		this("Ruby");
		System.out.println("inside cost constructor");
		this.cost = cost;
	}
	
	public Dog(String name, int cost) {
		super();
		this.name = name;
		this.cost = cost;
	}


	public Dog() {
		this(1000);
		// TODO Auto-generated constructor stub
		System.out.println("Dog object created.");
	}
	public void bark() {
		System.out.println("Dog is barking");
	}
}
class Puppy extends Dog{
	
	public Puppy() {
		super();
		System.out.println("puppy object created");
	}
	@Override
	public void bark() {
		System.out.println("puppy barks in low voice");
	}
}
public class Kennel {
	public static void main(String[] args) {
		Puppy p = new Puppy();
		System.out.println(p.breed);
		p.bark();
	}
}
