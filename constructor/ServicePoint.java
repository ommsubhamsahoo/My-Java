package constructor;

class Bike{
	String name;
	double mileage;
	int model;
	public Bike( String name) {
		this();
		this.name=name; 
		System.out.println("inside name constructor");
	}
	public Bike(double mileage) {
		this.mileage=mileage;
		System.out.println("inside mileage constructor");
	}
	public Bike() {
		this(2025);
		System.out.println("inside default constructor");
	}
	public Bike(int model) {
		this(30.0);
		this.model=model;
		System.out.println("inside int constructor");
	}
	String getname() { return name;}
	double getmileage(){return mileage;}
	int getmodel() {return model;}
}
public class ServicePoint {
public static void main(String[] args) {
	Bike b = new Bike("Bullet");
}
}
