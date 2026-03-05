package Inheritance;

class Myparent {
	/*
	 * public int add() {
	 * 
	 * int a=10,b=20; System.out.println("a+b="+(a+b)); return(a+b);
	 */
	public Animal add() {
		Animal a = new Animal();
		return a;
	}
}

class MyChild extends Myparent {
	/*
	 * public int add() { int a=100,b=200; System.out.println("a+b="+(a+b));
	 * return(a+b); }
	 */
	/*
	 * public Animal add() { Animal a1 = new Animal(); return a1; }
	 */

	
	/*
	 * public Lion add() { Lion l=new Lion(); return l; }
	 */	 
	public Tiger add() {
		Tiger t = new Tiger();
		return t;
	}

}

class Animal {

}

class Lion extends Animal {

}

class Tiger extends Animal {

}

public class MyRules {
	public static void main(String[] args) {
		MyChild n = new MyChild();
		n.add();
	}
}
