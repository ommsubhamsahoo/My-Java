package B;

import A.Abc;

public class Pqr extends Abc{
	 @Override
	public void m1() {
//		 System.out.println(a);//not possible for private
//		 System.out.println(b);// default only access in the same package but outside the package it does not work
		 System.out.println(c);//protected is accessble through inheritance or extends keyword
		 System.out.println(d);
	}
}
