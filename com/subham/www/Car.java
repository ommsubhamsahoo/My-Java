package com.subham.www;

public class Car {
	
	String name;
	String brand;
	double cost;
	double mileage;
	
	public void ignite()
	{
		System.out.println("Car gets ignited");
	}
	public void accelerate()
	{
		System.out.println("Car gets accelerated.");
	}
	public void applyBrake()
	{
		System.out.println("car applies brake");
	}
	
	public static void main(String[] args) {
		     Car c = new Car();
		     c.name="Audi A5";
		     c.brand="Audi";
		     c.cost=2500000.50; 
		     c.mileage=25.5;
		     c.ignite();
		     c.accelerate();
		     c.applyBrake();
		     System.out.println(c.name);
		     System.out.println(c.brand);
		     System.out.println(c.cost);
		     System.out.println(c.mileage);
	}

}
