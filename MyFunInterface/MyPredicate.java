package MyFunInterface;

import java.util.function.Predicate;

public class MyPredicate {
public static void main(String[] args) {
	int[] a= {1,2,3,4,5,10,15,28,45,67,78,36};
	Predicate<Integer> p=num->num%2==0;
	for(int n:a) {
		if(p.test(n)) {
			System.out.println("Even no is :"+n);
		}
	}
}
}
