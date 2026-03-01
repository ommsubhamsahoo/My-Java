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
	 public void carrycargo() {
		System.out.println("cp carries the cargo");

	}
}
class Passengerplane extends Plane{
	@Override
	public void fly() {
		System.out.println("passengerplane iflies at mid height");
	}
	public void carrypassenger() {
		System.out.println("cp carries passengers");

	}
}
class Fighterplane extends Plane{
	
		@Override
		public void fly() {
			System.out.println("Fighterplane flies at greater  height");
	}
		public void carryarms()
		{
			System.out.println("fp carries weapons.");
		}
}
class Airport{
	public static void permit(Plane p) {
		System.out.println("Airport allowing the planes inside permit");
		p.takeoff();
		p.fly();
		p.land();
		System.out.println();
	}
}
public class MyJets {
	public static void main(String[] args) {  
		Plane p;
		Cargoplane cp = new Cargoplane();
		p=cp;
		p.fly();
		((Cargoplane) p).carrycargo();
		/*
		 * c.takeoff(); c.fly(); c.land(); c.carrycargo();
		 */
		Passengerplane pp = new Passengerplane();
		p=pp;
		p.fly();
		((Passengerplane) p).carrypassenger();
		/*
		 * p.takeoff(); p.fly(); p.land(); p.carrypassenger();
		 */
		Fighterplane fp = new Fighterplane();
		p=fp; 
		p.fly();
		((Fighterplane) p).carryarms();
		/*
		 * f.takeoff(); f.fly(); f.land(); f.carryarms();
		 */
		
		}
}
