package Inheritance;

class Bike{
	public void ride() {
		System.out.println("I am riding bike");

	}
	
	public void brake() {
		System.out.println(" i am applying brake.");

	}
	public void mileage() {
		System.out.println("Mileage varies sometimes.");

	}
	
}
class SuperBike extends Bike{
	@Override
	public void mileage() {
		System.out.println("SuperBike show less mileage.");
	}
}
class MophedBike extends Bike{
	@Override
	public void mileage() {
		System.out.println("Mophedbike show avg mileage.");
	}
}
class ElectricBike extends Bike{
	@Override
	public void mileage() {
		System.out.println("Electricbike show mileage as per it's charge .");
	}
}
public class MotorBike {

}
