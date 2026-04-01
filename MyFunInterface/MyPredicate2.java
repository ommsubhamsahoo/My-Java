package MyFunInterface;

import java.util.function.Predicate;

public class MyPredicate2 {
public static void main(String[] args) {
	String[] a= {"Sundergarh","Sunderban","Odisha","Bhubaneswar"};
	Predicate<String> p=str->str.toLowerCase().startsWith("s");
	for(String n:a)
	{
		if(p.test(n)) {
			System.out.println(n );
		}
	}
}
}
