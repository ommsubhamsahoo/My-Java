package Encapsulation;

	class Car {
	 String name;
	 int cost;
	public Car(String name) {
		// TODO Auto-generated constructor stub
		this(100000);
		System.out.println("Inside the name constructor");
		this.name=name;
		
	}
	public Car(int cost) {
		// TODO Auto-generated constructor stub
		this();
		System.out.println("inside the cost constructor");
		this.cost=cost;
	}
	public Car() {
		// TODO Auto-generated constructor stub
		System.out.println("inside 0-parametrised constructor");
	}
	
public String getName() {
		return name;
	}

	

	public int getCost() {
		return cost;
	}
}

	public class Garage{

public static void main(String[] args) {
	Car c = new Car("Audi");
	System.out.println(c.getName());
	System.out.println(c.getCost());
}
}
