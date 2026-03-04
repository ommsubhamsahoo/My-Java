package Myinterface;

interface Atm {
	public abstract void withdraw();

	public abstract void deposite();
}

class Sbi implements Atm {
	public void withdraw() {
		System.out.println("inside withdraw method of atm");
	}

	public void deposite() {
		System.out.println("inside deposite of Atm");
	}

	public void specialroi() {
		System.out.println("sbi gives special roi of 8.5%.");
	}
}

class Canara implements Atm {
	public void withdraw() {
		System.out.println("inside withdraw method of canara");
	}

	public void deposite() {
		System.out.println("inside deposite of canara");
	}
}

class Axis implements Atm {
	public void withdraw() {
		System.out.println("inside withdraw method of Axis");
	}

	public void deposite() {
		System.out.println("inside deposite of Axis");
	}
}

class Plutonemall {
	public static void getInstalled(Atm a) {
		a.withdraw();
		a.deposite();
	}
}

public class MyBank {
	public static void main(String[] args) {
		Sbi s = new Sbi();
		Canara c = new Canara();
		Axis a = new Axis();
		s.deposite();
		s.withdraw();
	
		System.out.println();
		c.deposite();
		c.withdraw();
		System.out.println();
		a.deposite();
		a.withdraw();
		System.out.println();
//		Atm atm =new Atm();
		Sbi sb = new Sbi();
		Axis ax = new Axis();
		Plutonemall.getInstalled(sb);
		Plutonemall.getInstalled(ax);
		
		Atm atm=new Sbi();
		
		
	}
}
