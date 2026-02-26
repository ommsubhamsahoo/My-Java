package Inheritance;


class Plane{
	public void takeoff() {
		System.out.println("plane is takingoff");

	}
	public void fly()
	{
		System.out.println("plane is flying");
	}
	public void land() {
		System.out.println("plane is landing");

	}
}
class Cargoplane extends Plane{
	@Override
	public void fly() {
		System.out.println("cargoplane flies at lower height.");
	}
}
class Passengerplane extends Plane{
	@Override
	public void fly() {
		System.out.println("passengerplane iflies at mid height");
	}
}
class Fighterplane extends Plane{
	
		@Override
		public void fly() {
			System.out.println("Fighterplane flies at mid height");
	}
}
public class MyJets {
	public static void main(String[] args) {
		Cargoplane c = new Cargoplane();
		c.takeoff();
		c.fly();
		c.land();
		Passengerplane p = new Passengerplane();
		p.takeoff();
		p.fly();
		p.land();
		Fighterplane f = new Fighterplane();
		p.takeoff();
		p.fly();
		p.land();
		}
}
