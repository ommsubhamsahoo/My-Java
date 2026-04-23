package Inheritance2;

class plane{
	public void takeoff() {
		System.out.println("plane is taking off");
	}
	public void fly() {
		System.out.println("plane is flying");
	}
	public void land() {
		System.out.println("plane is landing");
	}
}
class Cargoplane extends plane{
	@Override
	public void takeoff() {
		System.out.println("cp is taking off");
	}
	@Override
	public void fly() {
		System.out.println("cp is flying");

	}
	@Override
	public void land() {
		System.out.println("cp is landing");

	}
}
class Fighterplane extends plane{
	@Override
	public void takeoff() {
		System.out.println("fp is taking off");
	}
	@Override
	public void fly() {
		System.out.println("fp is flying");

	}
	@Override
	public void land() {
		System.out.println("fp is landing");

	}
}
class Passenger extends plane{
	@Override
	public void takeoff() {
		System.out.println("pp is taking off");
	}
	@Override
	public void fly() {
		System.out.println("pp is flying");

	}
	@Override
	public void land() {
		System.out.println("pp is landing");

	}
}
public class MyAbstraction {
	public static void main(String[] args) {
		Cargoplane cp = new Cargoplane();
		Fighterplane fp = new Fighterplane();
		Passenger pp = new Passenger();
	}
}
