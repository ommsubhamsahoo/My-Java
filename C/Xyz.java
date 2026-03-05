package C;

import A.Abc;

public class Xyz {
	public void m2() {
		Abc b=new Abc();
//		System.out.println(b.a);//not possible for private
//		 System.out.println(b.b);//not possible for default also
//		 System.out.println(b.c);// not accessible for protected because there is no extends 
		 System.out.println(b.d);
	}
}
