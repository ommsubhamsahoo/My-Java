package abstraction;

abstract class Plane {
	public abstract void takeoff();

	public abstract void fly();

	public abstract void land();
}

class Cargoplane extends Plane {

	public void takeoff() {
		System.out.println("cargoplane taking off");

	}

	public void fly() {
		System.out.println("cargoplane is flying");
	}

	public void land() {
		System.out.println("cargoplane is landing");
	}
}

class Passengerplane extends Plane {

	public void takeoff() {
		System.out.println("passengerplane taking off");

	}

	public void fly() {
		System.out.println("passengerplane is flying");
	}

	public void land() {
		System.out.println("passengerplane is landing");
	}
}

class Fighterplane extends Plane {

	public void takeoff() {
		System.out.println("fighterplane taking off");

	}

	public void fly() {
		System.out.println("fighterplane is flying");
	}

	public void land() {
		System.out.println("fighterplane is landing");
	}}

public class Jet {
public static void main(String[] args) {
	Cargoplane cp = new Cargoplane();
	cp.takeoff();
	cp.fly();
	cp.land();
	Passengerplane pp = new Passengerplane();
	pp.takeoff();
	pp.fly();
	pp.land();
	Fighterplane fp = new Fighterplane();
	fp.takeoff();
	fp.fly();
	fp.land();
}
}
